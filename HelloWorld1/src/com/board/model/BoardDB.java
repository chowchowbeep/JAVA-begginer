package com.board.model;

public class BoardDB {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String creationDate;
	private int origNo;
	
	
	
	public int getBoardNo() {
		return boardNo;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public String getWriter() {
		return writer;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public int getOrigNo() {
		return origNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public void setOrigNo(int origNo) {
		this.origNo = origNo;
	}
	

	
}
