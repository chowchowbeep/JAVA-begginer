package com.board.model;
//인터페이스 _ 기능정의

import java.util.List;

public interface BoardDBService {
	
	//로그인체크
	public String logincheck(String id, String passwd);

	//글 작성
	public void insertBoard(BoardDB board);
	
	//전체 리스트 가져오기
	public List<BoardDB> getBoardList();
	
	//한건 조회
	public BoardDB getBoard(int boardNo);
	
	//댓글조회
	public List<BoardDB> getReply(int boardNo);

	//댓글추가
	public void insertReply(BoardDB board);
	
	//한건 수정
	public void updateBoard(BoardDB board);
	
	//삭제
	public void deleteBoard(BoardDB board);
	


}
