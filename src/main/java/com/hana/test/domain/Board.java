package com.hana.test.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Board {
	private int boardno;
	private String boardtitle;
	private String boardcontent;
	private String boardwriter;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date boarddate;
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(int boardno, String boardtitle, String boardcontent, String boardwriter, Date boarddate) {
		super();
		this.boardno = boardno;
		this.boardtitle = boardtitle;
		this.boardcontent = boardcontent;
		this.boardwriter = boardwriter;
		this.boarddate = boarddate;
	}
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public String getBoardtitle() {
		return boardtitle;
	}
	public void setBoardtitle(String boardtitle) {
		this.boardtitle = boardtitle;
	}
	public String getBoardcontent() {
		return boardcontent;
	}
	public void setBoardcontent(String boardcontent) {
		this.boardcontent = boardcontent;
	}
	public String getBoardwriter() {
		return boardwriter;
	}
	public void setBoardwriter(String boardwriter) {
		this.boardwriter = boardwriter;
	}
	public Date getBoarddate() {
		return boarddate;
	}
	public void setBoarddate(String boarddate) throws ParseException {
		this.boarddate = new SimpleDateFormat("yyyy-MM-dd").parse(boarddate);
	}
	@Override
	public String toString() {
		return "Board [boardno=" + boardno + ", boardtitle=" + boardtitle + ", boardcontent=" + boardcontent
				+ ", boardwriter=" + boardwriter + ", boarddate=" + boarddate + "]";
	}
	
	
}
