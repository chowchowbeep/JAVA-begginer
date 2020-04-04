package com.board.control;

import java.util.List;
import java.util.Scanner;

import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.Employee;
import com.board.model.EmployeeService;

//Employee객체의 인터페이스의 구현부를 사용하는

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmployeeService service = new EmployeeServiceImpl();
	//인터페이스 구현객체생성

	public void execute() {
		while (true) {
			System.out.println("[메뉴선택]");
			System.out.println("1.직원등록 2.직원조회 3.전체직원조회 4.직원정보삭제 9.종료");
			int menu = 0;
			try {
				menu = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("정상적인메뉴를 선택해주세요");
				sc.nextLine();
			}
			
			if (menu == 1) {
				addEmp(); 
			} else if (menu == 2) {
				getEmp();
			} else if (menu == 3) {
				EmpList();
			} else if(menu == 4) {
				delEmp();
			} else if (menu == 9) {
				System.out.println("프로그램종료합니다.");
				break;
			}
		}
		System.out.println("프로그램종료");
	}


	
	public void addEmp() {
		System.out.println("[직원등록]");
//		System.out.println("직원번호를 입력하세요");
//		int empId = sc.nextInt();
//		sc.nextLine(); //프로시저의 시퀀스 사용으로 인해 직원번호 수동등록x
		System.out.println("이름을 입력하세요");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요");
		String lastName = sc.nextLine();
		System.out.println("email을 입력하세요");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요"); // yyyy-mm-dd
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요");
		int salary = sc.nextInt(); sc.nextLine();
		System.out.println("JobID를 입력하세요");
		String jobId = sc.nextLine();
		
		Employee emp = new Employee();
//		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate);
		emp.setSalary(salary);
		emp.setJobId(jobId);
		
		service.insertEmployee(emp);

	}

	public void getEmp() {
		System.out.println("[직원조회]");
		System.out.println("조회할 직원의 ID를 입력 하세요");
		int empId = sc.nextInt(); sc.nextLine();
		Employee emp = service.getEmployee(empId);
		System.out.println(emp);
	}
	
	public void delEmp() {
		System.out.println("[한건삭제]");
		System.out.println("삭제할 사원의 ID를 입력");
		int empNo = sc.nextInt(); sc.nextLine();
		service.deleteEmployee(empNo); 
	}
	
	public void EmpList() {
		System.out.println("[전체직원조회]");
		List<Employee>  employees = service.getEmpList();
		for (Employee employee: employees) {
				System.out.println(employee);
	// 기본적으로 인스턴스값 출력시 주소값만 출력하게 되는데, 
	// 필드값을 보여주도록 employee클래스에서 오버라이딩되어 있음
		}

	}
	
//	public void updateEmp() {
//		System.out.println("변경할 글번호:");
//		int boardNo = sc.nextInt();sc.nextLine();
//		System.out.println("변경할 제목");
//		String title = sc.nextLine();
//		System.out.println("변경할 내용: ");
//		String content = sc.nextLine();
//		System.out.println("변경할 작성자명");
//		String writer = sc.nextLine();
//		
//		
//		Board board = new Board(boardNo, title, content, writer);
//		service.updateBoard(board, boardAry);
//		
//	}
	
}
