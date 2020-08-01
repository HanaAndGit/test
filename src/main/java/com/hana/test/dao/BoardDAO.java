package com.hana.test.dao;

import java.util.List;

import com.hana.test.domain.Board;

public interface BoardDAO {

	public List<Board> getBoardList() throws Exception;
	
	public int getBoardCnt() throws Exception;
	
	public void addBoard(Board board) throws Exception;
	
	public Board getBoardByNo(int boardno) throws Exception;
}
