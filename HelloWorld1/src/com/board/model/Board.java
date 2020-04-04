package com.board.model;

public class Board {
	//필드
	int boardNo;
	String title;
	String contents;
	String writer;
	
	//생성자
	public Board(int boardNo, String title, String contents, String writer) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	}
	
	//get,set메소드
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() { //Overrides: toString() in Object
		return "[게시번호: " + boardNo + ", 제목: " + title + ", 내용: " + contents + ", 작성자: " + writer + "]";
	}
	
	
}
