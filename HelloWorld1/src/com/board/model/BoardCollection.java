package com.board.model;

import java.util.List;

//인터페이스
public interface BoardCollection { 
	public void writeBoard(Board board, List<Board> boards); //글작성기능
	public Board getBoard(int boardNo,List<Board> boards);//한건조회
	public List<Board> getBoardList(List<Board> boards);//전체리스트
	public void updateBoard(Board board, List<Board> boards);//내용변경
	public void delBoard(int boardNo, List<Board> boards);//글삭제
	
	//->컬렉션으로
}
