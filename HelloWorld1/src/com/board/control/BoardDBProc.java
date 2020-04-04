package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardDBServiceImpl;
import com.board.model.BoardDB;
import com.board.model.BoardDBService;

public class BoardDBProc {
	Scanner sc = new Scanner(System.in);
	BoardDBService service = new BoardDBServiceImpl();
	String loginId = null;

	public void execute() {
		loginCheck();
		boolean run = true;
		while (run) {

			int menu = 0;
			System.out.println("1.게시글작성 | 2.게시글조회 | 3.글전체조회  | 4.원본글수정 | 5.원본글삭제 | 9.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				System.out.println("1.게시글작성을 선택하였습니다.");
				write();
			} else if (menu == 2) {
				System.out.println("2.게시글조회를 선택하였습니다.");
				getBoard();
			} else if (menu == 3) {
				System.out.println("3.글전체조회를 선택하였습니다.");
				getBoardList();
			} else if (menu == 4) {
				System.out.println("4.원본글수정을 선택하였습니다.");
				updateBoard();
			} else if (menu == 5) {
				System.out.println("5.원본글삭제를 선택하였습니다.");
				deleteBoard();
			} else if (menu == 9) {
				run = false;
			}
		}
	}
	
	public void deleteBoard() {
		System.out.println("삭제할 글 번호: ");
		int boardNo = sc.nextInt(); sc.nextLine();
		
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setWriter(loginId);
		
		service.deleteBoard(board);
		
	}
	
	
	public void updateBoard() {
		System.out.println("변경할 글 번호: ");
		int boardNo = sc.nextInt(); sc.nextLine();
		System.out.println("제목변경");
		String title = sc.nextLine();
		System.out.println("내용변경");
		String content = sc.nextLine();
		
		BoardDB board = new BoardDB();
		board.setBoardNo(boardNo);
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);
	
		service.updateBoard(board);
		
		
	}

	public void getBoardList() {
		List<BoardDB> list = service.getBoardList();
		service.getBoardList();
		for (BoardDB brd : list) {
			System.out.println("->" + brd.getBoardNo() + "|" + brd.getTitle() + "|" + brd.getContent() + "|"
					+ brd.getWriter() + "|" + brd.getCreationDate());
		}
	}

	public void getBoard() {
		System.out.println("원본글번호:");
		int origBoardNo = sc.nextInt();
		sc.nextLine();

		// 원본글
		BoardDB board = service.getBoard(origBoardNo);
		if (board != null && board.getBoardNo() != 0) {
			System.out.println("[원본글]");
			System.out.println("제목: " + board.getTitle());
			System.out.println("내용: " + board.getContent());
			System.out.println("작성자: " + board.getWriter());
			System.out.println("작성일자: " + board.getCreationDate());

			// 댓글
			List<BoardDB> list = service.getReply(origBoardNo);
			if (list.size() > 0) {
				System.out.println("[댓글]");
				for (BoardDB brd : list) {
					System.out.println("->" + brd.getBoardNo() + "|" + brd.getContent() + "|" + brd.getCreationDate());
				}
				System.out.println("------------------------------------");
				System.out.println("1.댓글작성 2.이전메뉴");

				int subMenu = 0;
				subMenu = sc.nextInt();
				sc.nextLine();

				if (subMenu == 1) {
					System.out.println("내용을 입력하세요");
					String content = sc.nextLine();

					BoardDB brd = new BoardDB();
					brd.setContent(content);
					brd.setWriter(loginId);
					brd.setOrigNo(board.getBoardNo());

					service.insertReply(brd);
				} else {
					return;
				}
			}System.out.println("댓글이 없습니다.");
			

		} else {
			System.out.println("없는 글 번호입니다.");
		}
	}

	public void write() {
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요");
		String content = sc.nextLine();

		BoardDB board = new BoardDB();
		board.setTitle(title);
		board.setContent(content);
		board.setWriter(loginId);

		service.insertBoard(board);

	}

	public void loginCheck() {
		while (true) {
			System.out.println("ID를 입력하세요");
			String id = sc.nextLine();
			System.out.println("PASSWORD를 입력하세요");
			String pass = sc.nextLine();
			String name = service.logincheck(id, pass);
			if (name != null) {
				System.out.println(name + "님 환영합니다.");
				loginId = id; // id값을 글 작성 시에도 사용할 수 있도록 별도의 변수에 저장
				break;
			} else {
				System.out.println("ID와 PW를 다시 입력하세요");
			}
		}
	}

}
