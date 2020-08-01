package com.hana.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hana.test.dao.BoardDAO;
import com.hana.test.domain.Board;

@Service
public class BoardService {

	@Autowired
	BoardDAO boardDAO;
	
	public List<Board> getBoardList() throws Exception{
		return boardDAO.getBoardList();
	}
	
	public int getBoardCnt() throws Exception{
		return boardDAO.getBoardCnt();
	}
	
	public void addBoard(Board board) throws Exception {
		boardDAO.addBoard(board);
	}
	
	public Board getBoardByNo(int boardno) throws Exception {
		return boardDAO.getBoardByNo(boardno);
	}
}
