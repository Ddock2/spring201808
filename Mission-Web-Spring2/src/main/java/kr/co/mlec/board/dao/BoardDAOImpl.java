package kr.co.mlec.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.board.vo.BoardVO;

/**
 * ORACLE DB에서 구현하는 게시글 관련 클래스
 * @author bit
 *
 */
@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardVO> list() {
		List<BoardVO> list = sqlSessionTemplate.selectList("kr.co.mlec.board.dao.BoardDAO.selectAllBoard");
		return list;
	}

	@Override
	public BoardVO detail(int no) {
		BoardVO board = sqlSessionTemplate.selectOne("kr.co.mlec.board.dao.BoardDAO.detail", no);
		return board;
	}

	@Override
	public void insert(BoardVO board) {
		sqlSessionTemplate.insert("kr.co.mlec.board.dao.BoardDAO.insert", board);
	}
	
	
}
