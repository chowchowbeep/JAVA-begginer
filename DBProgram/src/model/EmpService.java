package model;

import java.util.List;

public interface EmpService {
	//사원등록
	public void registerEmp(Employee emp);
	
	//사원이름조회
	public List<Employee> getEmps(String empName);
	
	//부서별조회(부서입력시 부서별조회, 입력 x경우 전체조회, 부서출력시 부서별 전체인원 표시)
	public List<Employee> EmpListForDept(String deptName);
	
	//부서변경
	public void changeDept(int empNo, String dept);
	
	//퇴사처리(삭제/조회불가)
	public void delEmp(int empNo);
}
