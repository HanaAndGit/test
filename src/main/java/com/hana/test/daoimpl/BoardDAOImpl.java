package com.hana.test.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hana.test.dao.BoardDAO;
import com.hana.test.domain.Board;

@Repository
public class BoardDAOImpl implements BoardDAO {

	private static final String namespace ="mappers.BoardMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Board> getBoardList() throws Exception {
		return sqlSession.selectList(namespace + "getBoardList");
	}

	@Override
	public int getBoardCnt() throws Exception {
		return sqlSession.selectOne(namespace + "getBoardCnt");
	}    

	@Override
	public void addBoard(Board board) throws Exception {
		sqlSession.insert(namespace + "addBoard", board);
	}

	@Override
	public Board getBoardByNo(int boardno) throws Exception {
		return sqlSession.selectOne(namespace + "getBoardByNo", boardno);
	}

}
