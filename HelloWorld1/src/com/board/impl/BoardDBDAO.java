package com.board.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.BoardDB;
import com.board.model.Employee;

public class BoardDBDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	

	//글삭제방법 01_댓글존재여부 확인과 글 삭제를 동시에 하는 메소드
	public void deleteBoard1(BoardDB board) {
		conn = DAO.getConnect();
		List<BoardDB> list = getReplyList(board.getBoardNo());
		if (list.size() > 0) {
			System.out.println("댓글존재하여 삭제 불가함");
		} else {
			String sql = "delete from boards where board_no = ?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, board.getBoardNo());
				int r = pstmt.executeUpdate();
				System.out.println(r + "건이 삭제되었습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 글삭제방법 02_댓글 있을 경우 글 삭제 불가하도록 체크를 따로 함.
	public void deleteBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "delete from boards " + "where board_no = ?";
//		"where board_no = ? and writer=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
//			pstmt.setString(2, board.getWriter());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// 글삭제방법 02_댓글 있을 경우 글 삭제 불가하도록 체크
	public boolean checkReply(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "select count(*) as cnt from boards where orig_no = ? ";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (result == 0)
			return true;
		else
			return false;
	}

	// 원본글 수정과 삭제에 대한 권한체크
	public boolean checkResponsibility(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "select count(*) as cnt from boards" + " where orig_no is null and " // 원본글
				+ "board_no=? and writer=?";
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBoardNo());
			pstmt.setString(2, board.getWriter());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (result > 0)
			return true;
		else
			return false;
	}

	// 원본 글 수정
	public void updateBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "update boards set orig_no = orig_no ";
		if (board.getTitle() != null && !board.getTitle().equals("")) {
			sql += ",title = ? ";
		}
		if (board.getContent() != null && !board.getContent().equals("")) {
			sql += ",content = ? ";
		}
		sql += "where board_no = ? and orig_no is null";// 원본글만 가져오기 위해서
		int n = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			if (board.getTitle() != null && !board.getTitle().equals("")) {
				pstmt.setString(++n, board.getTitle());
			}
			if (board.getContent() != null && !board.getContent().equals("")) {
				pstmt.setString(++n, board.getContent());
			}
			pstmt.setInt(++n, board.getBoardNo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// 로그인체크
	public String getUserName(String id, String pass) {
		conn = DAO.getConnect();
		String sql = "select * from user_login where id=? and passwd=?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pass);
			rs = pstmt.executeQuery();
			if (rs.next()) { // 해당되는 행이 없을 경우, 가져올 name컬럼의 값이 없을 경우 name은 null
				name = rs.getString("name");// db컬럼으로부터 값을 가져옴
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return name;
	}

	// 게시글 작성
	public void insertBoard(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values" + "((select nvl(max(board_no),0)+1 from boards),"// 보드넘버 자동
				+ "?,?,?, sysdate, null)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건의 작성이 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 글번호 받아서 원본글조회
	public BoardDB getBoard(int boardNo) {
		BoardDB board = new BoardDB();
		conn = DAO.getConnect();
		String sql = "select * from boards where board_no =? and orig_no is null";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardDB();
//				board.setBoardNo(boardNo);아래와 동일
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setCreationDate(rs.getString("creation_date"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return board;
	}

	// 댓글 번호 표시하기
	
	
	// 댓글목록조회
	public List<BoardDB> getReplyList(int boardNo) {
		conn = DAO.getConnect();
//		String sql = "select * from boards where orig_no =?"; //아래와동일
		String sql = "select * from boards where orig_no =" + boardNo;
	
		List<BoardDB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));

				list.add(board);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	// 전체글 조회
	public List<BoardDB> getBoardList() {
		conn = DAO.getConnect();
//		String sql = "select * from boards where orig_no is null " + "order by creation_date desc";
		String sql1= "select board_no, title, content, "
				+ "writer, creation_date, orig_no," + 
				" GET_REPLY_CNT(b.board_no) as reply_count from boards b";
		//
		
		List<BoardDB> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql1);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDB board = new BoardDB();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title")+"["+rs.getString("reply_count")+"]");
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setOrigNo(rs.getInt("orig_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void insertReply(BoardDB board) {
		conn = DAO.getConnect();
		String sql = "insert into boards values ((select nvl(max(board_no),0)+1 from boards)," + "?,?,?,sysdate,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setString(3, board.getWriter());
			pstmt.setInt(4, board.getOrigNo());
			pstmt.executeUpdate();
			System.out.println("댓글 작성이 완료되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
