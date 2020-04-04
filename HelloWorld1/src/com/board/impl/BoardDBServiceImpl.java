package com.board.impl;

import java.util.List;

import com.board.model.BoardDB;
import com.board.model.BoardDBService;

//로그인체크 포함

public class BoardDBServiceImpl implements BoardDBService {
	BoardDBDAO dao = new BoardDBDAO();

	@Override
	public String logincheck(String id, String passwd) {
//		return dao.getUserName(id, passwd);// 아래와 동일
		String name = dao.getUserName(id, passwd);
		return name;
	}

	@Override
	public void insertBoard(BoardDB board) {
		dao.insertBoard(board);
	}

	@Override
	public List<BoardDB> getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public BoardDB getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public List<BoardDB> getReply(int boardNo) {
		return dao.getReplyList(boardNo);
	}

	@Override
	public void insertReply(BoardDB board) {
		dao.insertReply(board);
	}

	@Override
	public void updateBoard(BoardDB board) {
		// 해당글에 대한 권한확인.
		if (dao.checkResponsibility(board)) {
			dao.updateBoard(board);
			System.out.println("변경되었습니다.");
		} else {
			System.out.println("해당글에 대한 권한이 없습니다.");
		}

	}

	@Override
	public void deleteBoard(BoardDB board) {

		if (dao.checkResponsibility(board)) { // 원본글 수정과 삭제에 대한 권한체크
			if (dao.checkReply(board)) {// 댓글유무체크
				dao.deleteBoard(board);
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("댓글이 존재하여 삭제할 수 없습니다.");
			}
		} else {
			System.out.println("해당글에 대한 권한이 없습니다.");
		}

//		if(dao.checkResponsibility(board)) {
//				dao.deleteBoard1(board);
//				System.out.println("삭제되었습니다.");
//		} else {
//			System.out.println("삭제가 불가능합니다.");
//		}

	}
}
