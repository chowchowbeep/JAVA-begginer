package com.board.impl;

import com.board.model.Board;
// BoardService구현을 위해 내용정의되지 않은 메소드를 불러오는데,
// 해당 메소드는 Board클래스를 필요로 하고 Board클래스가 다른 패키지에 있기 때문에 임포트
import com.board.model.BoardService;
//다른패키지에 있는 BoardService인터페이스를 필요로 하기때문에 임포트

//BoardService 인터페이스를 구현해는 객체 BoardServiceImpl 
public class BoardServiceImpl implements BoardService {
	// BoardService 임포트 //BoardServiceImpl hover해서 BoardService메소드를 구현해야 함.

	// 메소드 각각에 DB역할을 하는 Board[] boardAry를 매개변수로 담을 것임
	// Board[] boards추가시 인터페이스의 추상메소드도 수정

	@Override
	public void writeBoard(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				break;
			}
		}
	}

	@Override
	public Board getBoard(int boardNo, Board[] boards) {
		Board board = null;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				board = boards[i];
			}
		}
		return board;
	}

	@Override
	public Board[] getBoardList(Board[] boards) {
		Board[] boardAry = new Board[boards.length];
		for (int i = 0; i < boards.length; i++) {
				boardAry[i] = boards[i];
			}
		return boardAry;
		}
		
	

	@Override
	public void delBoard(int boardNo, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				boards[i] =null;
			}
		}
	}

	@Override
	public void updateBoard(Board board, Board[] boards) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null 
					&& boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContents(board.getContents());
				boards[i].setTitle(board.getTitle());
				boards[i].setWriter(board.getWriter());
				//기존보드 boards[i]의 필드값을, 새롭게 생성된 board의 필드값으로 대체함.
			}
		}
	}

}
