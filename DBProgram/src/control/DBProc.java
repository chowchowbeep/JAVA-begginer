package control;

import java.util.List;
import java.util.Scanner;

import impl.EmpServiceImpl;
import model.Employee;

public class DBProc {
	Scanner sc = new Scanner(System.in);
	EmpServiceImpl service = new EmpServiceImpl();

	public void execute() {
		boolean run = true;
		while (run) {
			int num = 0;
			System.out.println("============================================================");
			System.out.println("                        [ 메뉴선택 ]");
			System.out.println(" 1.사원등록 | 2.사원이름조회 | 3.부서별조회 | 4.부서변경 | 5.퇴사처리 | 6.종료 ");
			System.out.println("============================================================");
			num = sc.nextInt();
			sc.nextLine();
			if (num == 1) {
				System.out.println("사원등록을 선택하였습니다.");
				registerEmp();
			} else if (num == 2) {
				System.out.println("사원이름조회를 선택하였습니다.");
				getEmpByName();
			} else if (num == 3) {
				System.out.println("부서별조회를 선택하였습니다.");
				empListForDept();
			} else if (num == 4) {
				System.out.println("부서변경을 선택하였습니다.");
				changeDept();
			} else if (num == 5) {
				System.out.println("퇴사처리를 선택하였습니다.");
				delEmp();
			} else if (num == 6) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}
		}
	}

	public void registerEmp() {
		System.out.println("사원명을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("부서명을 입력하세요.");
		String deptName = sc.nextLine();
		System.out.println("급여를 입력하세요.");
		int salary = sc.nextInt();sc.nextLine();
		System.out.println("입사일을 입력하세요.");
		System.out.println("(날짜형식 yyyy-mm-dd)");
		String hireDate = sc.nextLine();

		Employee emp = new Employee();
		emp.setName(name);
		emp.setDeptName(deptName);
		emp.setSalary(salary);
		emp.setHireDate(hireDate);
		
		service.registerEmp(emp);

	}

	public void getEmpByName() {
		System.out.println("사원명을 입력하세요.");
		String name = sc.nextLine();
		List<Employee> employees = service.getEmps(name);
		for (Employee employee: employees) {
				System.out.println(employee);
		}
	}

	public void empListForDept() {
		System.out.println("조회할 부서명을 입력하세요.");
		System.out.println("(미입력시 전체부서 조회)");
		String dept = sc.nextLine();
		
		List<Employee> employees = service.EmpListForDept(dept);
		for (Employee employee: employees) {
				System.out.println(employee);
		}
		

	}

	public void changeDept() {
		System.out.println("부서를 변경할 사원의 사번을 입력하세요.");
		int empNo = sc.nextInt();sc.nextLine();
		System.out.println("변경할 부서명을 입력하세요.");
		String dept = sc.nextLine();
		service.changeDept(empNo, dept);
	}

	public void delEmp() {
		System.out.println("정보를 삭제할 사원의 사번을 입력하세요.");
		int empNo = sc.nextInt();sc.nextLine();
		service.delEmp(empNo);

	}

}
