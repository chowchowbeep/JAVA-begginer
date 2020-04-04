package com.board.model;
//Employee객체

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String hireDate;
	private int salary;
	private String jobId;
	private String deptName;
	
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getHireDate() {
		return hireDate;
	}
	public int getSalary() {
		return salary;
	}
	public String getJobId() {
		return jobId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", hireDate=" + hireDate + ", salary=" + salary + ", jobId=" + jobId + ", deptName="
				+ deptName + "]";
	}

	// 인스턴스변수의 값 출력시 기본적으로 객체 인스턴스의 주소값을 반환하게 되는데, 
	//  필드값을 보여주도록 오버라이딩

	
	
	
}
