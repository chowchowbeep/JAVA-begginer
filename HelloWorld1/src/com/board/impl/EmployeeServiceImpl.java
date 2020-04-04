package com.board.impl;

import java.util.List;

import com.board.model.Employee;
import com.board.model.EmployeeService;
//Employee객체의 인터페이스의 구현부 

public class EmployeeServiceImpl implements EmployeeService{
	EmpDAO dao = new EmpDAO();
	
	@Override
	public List<Employee> getEmpList() {
		List<Employee> list = dao.getEmpList();
		return list;
	}

	@Override
	public Employee getEmployee(int empNo) {
		Employee emp = dao.getEmp(empNo);
		return emp;
	}

	@Override
	public void insertEmployee(Employee emp) {
//		dao.insertEmp(emp);
		dao.insertEmpProc(emp); //프로시저 이용하여 인서트
		
	}

	@Override
	public void updateEmployee(Employee emp) {

	}

	@Override
	public void deleteEmployee(int empNo) {
		dao.delEmp(empNo);
		
	}
	
}
