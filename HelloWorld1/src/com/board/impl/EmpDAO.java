package com.board.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.board.common.DAO;
import com.board.model.Employee;

//구체적인 DB사용 메소드 정의

public class EmpDAO {
	// 필드값으로 사용
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	
	
	
	// 프로시저 이용_자바에서 생성한employee객체를 db에 삽입
	public void insertEmpProc(Employee emp) {
		conn = DAO.getConnect();
		String sql = "{call add_new_member(?,?,?,?,?,?)}";// PL/SQL문
		try {
			CallableStatement cstmt = conn.prepareCall(sql);//
			//CallableStatement 객체를 생성하여 프로시저가 저장된 db를 호출
			cstmt.setString(1, emp.getFirstName()); //sql매개변수 설정
			cstmt.setString(2, emp.getLastName());
			cstmt.setString(3,emp.getJobId());
			cstmt.setInt(4, emp.getSalary());
			cstmt.setString(5, emp.getHireDate());
			cstmt.setString(6, emp.getEmail());
			cstmt.execute(); //쿼리 실행
			
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

	
	
	
	// 자바에서 생성한employee객체를 db에 삽입
	public void insertEmp(Employee emp) {
		conn = DAO.getConnect(); // db접속 메소드 호출 //드라이버로드
		String sql = "insert into employees(employee_id," + "first_name, last_name, email, job_id,"
				+ "hire_date, salary)" + "values (?,?,?,?,?,?,?)";// ?는 파라메터로 받겠다는 의미
		int rCnt = 0;
		try {
			pstmt = conn.prepareStatement(sql); // try catch
			// sql문을 db로 전달하기 위해 PreparedStatement객체생성하는 메소드
			// (파라미터의 sql문이 preparedStatment객체에 precompiled,stored.)
			pstmt.setInt(++rCnt, emp.getEmployeeId());
			// 첫번째 파라미터. 상기sql문의 ?부분에 위치할 값을 set.
			pstmt.setString(++rCnt, emp.getFirstName());
			pstmt.setString(++rCnt, emp.getLastName());
			pstmt.setString(++rCnt, emp.getEmail());
			pstmt.setString(++rCnt, emp.getJobId());
			pstmt.setString(++rCnt, emp.getHireDate());
			pstmt.setInt(++rCnt, emp.getSalary());
			int r = pstmt.executeUpdate(); // pstmt에 저장된 sql문을 바탕으로,
			// sql db update를 수행하게 해주는 메소드
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close(); // db connection종료
				// surrounded with try catch
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// db에서 employee list가져오기
	public List<Employee> getEmpList() {
		List<Employee> list = new ArrayList<>();
		conn = DAO.getConnect();
		String sql = "select * from emp_temp";
		Employee emp = null; // Employee객체 생성??
		try {
			pstmt = conn.prepareStatement(sql);
			// sql문 db로 전달하는 preparedStatement객체생성
			rs = pstmt.executeQuery();
			// 생성한객체의 sql문 실행하고, 쿼리에 의해 추출된 데이터를 resultSet객체로 리턴
			// 여러건의쿼리 리턴하여 rs에 저장
			while (rs.next()) { // DB의 첫째행부터 마지막행까지 이동하면서 실행
				emp = new Employee(); // 하나의 인스턴스 생성
				emp.setEmployeeId(rs.getInt("employee_id"));
				// resultSet에 저장된 DB의 컬럼으로부터 한 건(한 행)씩
				// 데이터를 가져오고, 해당 데이터를 emp객체의 필드값으로 set
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));

				list.add(emp);
				// list객체에 위에서 가져온 필드값이 적용된 emp객체를 추가
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
		return list; // 위에서 저장된 emp객체리스트를 리턴
	}

	// db에서 매개변수인 empID가 일치하는 employee가져오기
	//+ dept_name의 값을 리턴값으로 추가_함수사용
	public Employee getEmp(int empId) {
		conn = DAO.getConnect();
		String sql = "select * from emp_temp where employee_id = ?";
		String sql1 = "{? = call get_dept_name(?)}";//get_dept_name이라는 프로시저 호출하는 PL/SQL문
		Employee emp = null;
		try {
			pstmt = conn.prepareStatement(sql);  
			pstmt.setInt(1, empId);// sql문의 ? 파라미터 값 세팅
			rs = pstmt.executeQuery();
			
			CallableStatement cstmt = conn.prepareCall(sql1);
			cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);//첫번째 파라미터(첫번째물음표)는 리턴타입
			cstmt.setInt(2, empId);//두번째 물음표에는 IN매개변수
			cstmt.execute();
			String deptName = cstmt.getString(1);//첫번째 파라미터의 값(리턴값) 가져옴
			
			if (rs.next()) {
				emp = new Employee(); 
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));
				emp.setDeptName(deptName);
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
		return emp;
	}
	
	

	// db에서 empID가 일치하는 employee 삭제하기
	public void delEmp(int empNo) {
		conn = DAO.getConnect(); // db접속 메소드 호출 //드라이버로드
		String sql = "delete from emp_temp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empNo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// db에서 매개변수인 empID가 일치하는 employee가져오기
//	public Employee getEmp(int empNo) {
//		Employee emp = new Employee();
//		conn = DAO.getConnect();
//		String sql = "select * from employees";
//		try {
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				if (empNo == rs.getInt("employee_id")) {
//					emp.setEmployeeId(rs.getInt("employee_id"));
//					emp.setFirstName(rs.getString("first_name"));
//					emp.setLastName(rs.getString("last_name"));
//					emp.setEmail(rs.getString("email"));
//					emp.setHireDate(rs.getString("hire_date"));
//					emp.setSalary(rs.getInt("salary"));
//					emp.setJobId(rs.getString("job_id"));
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return emp;
//	}

	}
}
