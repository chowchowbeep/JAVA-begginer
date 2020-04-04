package impl;

import java.util.List;

import model.EmpService;
import model.Employee;


public class EmpServiceImpl implements EmpService {
	EmpDAO dao = new EmpDAO();

	@Override
	public void registerEmp(Employee emp) {
		dao.registerEmp(emp);
	}

	@Override
	public List<Employee> getEmps(String empName) {
		return dao.getEmps(empName);
		
	}

	@Override
	public List<Employee> EmpListForDept(String deptName) {
		return dao.empListForDept(deptName);
	}

	@Override
	public void changeDept(int empNo, String dept) {
		dao.changeDept(empNo, dept);
		
	}

	@Override
	public void delEmp(int empNo) {
		dao.delEmp(empNo);
	}
	

}
