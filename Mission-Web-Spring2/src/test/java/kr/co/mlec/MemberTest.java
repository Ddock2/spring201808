package kr.co.mlec;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.member.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/**/*.xml"})
public class MemberTest {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Test
	public void 로그인테스트() throws Exception{
		
		MemberVO loginVO = new MemberVO();
		loginVO.setId("user");
		loginVO.setPassword("password");
		
		Assert.assertNotNull(sqlSession.selectOne("kr.co.mlec.member.dao.MemberDAO.login", loginVO));
		
	}
	
}
