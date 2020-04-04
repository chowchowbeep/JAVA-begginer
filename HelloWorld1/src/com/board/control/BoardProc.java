package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardCollectionImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10]; // => DB역할을 하는 배열.
	List<Board> boardAry = new ArrayList<>();
	
//	BoardService service = new BoardServiceImpl(); 
	// 인터페이스타입변수에 구현객체가 자동형변환되어 저장
	BoardCollection service = new BoardCollectionImpl();

	public void execute() {
		while (true) {
			login_check(); //
			System.out.println("[메뉴선택]");
			System.out.println("1.작성 2.글삭제 3.전체조회 4.변경 9.종료");
			int menu = 0;
			try {
				menu = sc.nextInt();//에러발생가능 코드
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인메뉴를 선택해주세요");
				sc.nextLine();
				
//				e.printStackTrace(); //예외발생코드 추적하여 출력
			}
			
			if (menu == 1) {
				writeBoard(); // 배열에 Board를 담아요
			} else if (menu == 2) {
				delBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if(menu == 4) {
				updateBoard();
			} else if (menu == 9) {
				System.out.println("프로그램종료합니다.");
				break;
			}
		}
		System.out.println("프로그램종료");
	}
	
	
	public void login_check(){
		while(true) {
			System.out.println("ID입력");
			String id = sc.nextLine();
			System.out.println("PASSWORD입력");
			String passwd = sc.nextLine();
			if(id.equals("user1") && passwd.equals("1234")) {
				System.out.println("방문자님 환영합니다");
				break;
			} else {
				System.out.println("id, password 다시 입력");
			}
		}
	}
	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();sc.nextLine();
		System.out.println("변경할 제목");
		String title = sc.nextLine();
		System.out.println("변경할 내용: ");
		String content = sc.nextLine();
		System.out.println("변경할 작성자명");
		String writer = sc.nextLine();
		
		
		Board board = new Board(boardNo, title, content, writer);
//		Board board = new Board(boardNo, "", content,"");//비워두고 생성가능
		service.updateBoard(board, boardAry);//새로 생성한 인스턴스로 대체
		
		
	}
	public void writeBoard() {
		System.out.println("[글작성]");
		System.out.println("게시글번호를 입력하세요");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요");
		String contents = sc.nextLine();
		System.out.println("작성자 입력");
		String writer = sc.nextLine();

		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);
		// 위의 내용은 다음을 BoardServiceImp에서 구현메소드로 재정의 한 것
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//		}

	}

	public void getBoard() {
		System.out.println("[한건조회]");
		System.out.println("조회할 번호를 입력");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle()+", "
//			+boardAry[i].getContents()+", "+boardAry[i].getBoardNo()
//			+", "+boardAry[i].getWriter());
//			}
//		}
	}
	
	public void delBoard() {
		System.out.println("[한건삭제]");
		System.out.println("삭제할 글번호를 입력");
		int boardNo = sc.nextInt(); sc.nextLine();
		service.delBoard(boardNo, boardAry); 

		
	}
	

	public void getBoardList() {
		System.out.println("[전체글조회]");
		List<Board> resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
				System.out.println(brd);
		}
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle()+", "+boardAry[i].getContents());
//			}
//		}
	}
}
