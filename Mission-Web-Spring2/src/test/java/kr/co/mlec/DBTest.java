package kr.co.mlec;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.board.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/spring/spring-mvc.xml"})
public class DBTest {
	
	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
//	@Ignore
	@Test
	public void DB접속테스트() throws Exception {
		
//		Assert.assertNotNull(ds);
		Assert.assertNotEquals(null, ds);
		Assert.assertNotNull(ds.getConnection());
		Assert.assertNotNull(sqlSessionTemplate);
/*		
		System.out.println("ds : " + ds);
		
		Connection conn = ds.getConnection();
		
		System.out.println("sqlSession : " + sqlSessionTemplate);
*/		
	}
	
	@Test
	public void 전체게시글조회() throws Exception{
		
		List<BoardVO> list = sqlSessionTemplate.selectList("kr.co.mlec.board.dao.BoardDAO.selectAllBoard");
		
		for(BoardVO board : list) {
			System.out.println(board);
		}
		
	}
}
