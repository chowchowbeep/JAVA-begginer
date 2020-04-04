package com.board.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//오라클 데이터 베이스 접속 메소드 
//먼저build path - configure build path에서 자바 아카이브파일jar을 라이브러리에 추가해야 함

public class DAO { 
	
	public static Connection getConnect() {
		Connection conn = null;
//		String user = "hr";
//		String passwd = "hr";  // EMP용
		String user = "amator";
		String passwd = "amator"; // BoardDB용
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //포트명, db명xe
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver); //jdbc드라이버 로딩 //forName()클래스객체를 리턴
			conn = DriverManager.getConnection(url,user,passwd); //db연결
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
