package model;

public class Employee {
	int empNo;
	String name;
	String deptName;
	int salary;
	String hireDate;

	public Employee() {
	}

	public Employee(int empNo, String name, String deptName, int salary, String hireDate) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getSalary() {
		return salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "[ employee_no : " + empNo + " | employee_name : " + name + " | department_name : " + deptName
				+" | salary : " + salary + " | hire_date : " + hireDate + " ]";
	}

}
