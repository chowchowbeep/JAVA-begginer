package com.board.impl;

import java.util.ArrayList;
import java.util.List;

import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardCollectionImpl implements BoardCollection {

	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);

	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for(Board brd : boards ) {
			if(brd.getBoardNo() == boardNo) {
				boardTemp = brd;
			}
		}
		return boardTemp;
		 
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> list = new ArrayList<Board>();
		for (Board brd : boards) {
			list.add(brd);
		}
		return list;
	}

	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for(Board brd : boards ) {
			if(brd.getBoardNo() == board.getBoardNo()) {
				brd.setTitle(board.getTitle());
				brd.setContents(board.getTitle());
				brd.setWriter(board.getWriter());
				brd.setBoardNo(board.getBoardNo());
			}
		}

	}

	@Override
	public void delBoard(int boardNo, List<Board> boards) {
		for(Board brd : boards ) {
			if(brd.getBoardNo() == boardNo) {
			boards.remove(brd);
			break;
			}
		}
				

	}

}
