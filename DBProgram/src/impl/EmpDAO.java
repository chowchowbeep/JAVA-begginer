package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DAO;
import model.Employee;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void registerEmp(Employee emp) {

		conn = DAO.getConnect();
		String sql = "insert into employees values"
				+ "( (select nvl(max(employee_no),0)+1 from employees), ?, ?, ?, ?)";
		int rCnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(++rCnt, emp.getName());
			pstmt.setString(++rCnt, emp.getDeptName());
			pstmt.setInt(++rCnt, emp.getSalary());
			pstmt.setString(++rCnt, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
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

	public List<Employee> getEmps(String empName) {
		conn = DAO.getConnect();
		String sql = "select * from employees where employee_name like ?";
		List<Employee> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + empName + "%");
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpNo(rs.getInt("employee_no"));
				emp.setName(rs.getString("employee_name"));
				emp.setDeptName(rs.getString("department_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				list.add(emp);
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

	public List<Employee> empListForDept(String deptName) {
		conn = DAO.getConnect();
		String sql = "select employee_no, employee_name, department_name, salary, hire_date, "
				+ "GET_EMP_CNT(e.department_name) as cnt from employees e";
		if (!deptName.equals("")) {
			sql += " where department_name = ?";
		}

		List<Employee> list = new ArrayList<>();
		try {
			if (!deptName.equals("")) {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, deptName);
				rs = pstmt.executeQuery();
			} else {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
			}

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpNo(rs.getInt("employee_no"));
				emp.setName(rs.getString("employee_name"));
				emp.setDeptName(rs.getString("department_name") + "(" + rs.getInt("cnt") + "인 부서)");
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				list.add(emp);
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

	public void changeDept(int empNo, String dept) {
		conn = DAO.getConnect();
		String sql = "update employees " + "set department_name = ? " + "where employee_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			pstmt.setInt(2, empNo);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
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

	public void delEmp(int empNo) {
		conn = DAO.getConnect();
		String sql = "delete from employees where employee_no = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empNo);
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
