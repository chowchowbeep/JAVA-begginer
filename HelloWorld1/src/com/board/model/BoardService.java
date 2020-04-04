package com.board.model;

//인터페이스
public interface BoardService { 
	public void writeBoard(Board board, Board[] boards); //글작성기능
	public Board getBoard(int boardNo,Board[] boards);//한건조회
	public Board[] getBoardList(Board[] boards);//전체리스트
	public void updateBoard(Board board, Board[] boards);//내용변경
	public void delBoard(int boardNo, Board[] boards);//글삭제
	

}
