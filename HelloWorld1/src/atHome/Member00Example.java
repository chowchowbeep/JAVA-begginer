package atHome;

import java.util.Scanner;

public class Member00Example {
	private static Scanner sc = new Scanner(System.in);
	private static Member00[] memberAry = new Member00[10];

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------");
			System.out.println("1.계정생성 | 2.계정목록 | 3.계정검색 | 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택>");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == 1) {
				createMem();
			} else if (num == 2) {
				memList();
			} else if (num == 3) {
				search();
			} else if (num == 4) {
				run = false;
			}
		}
	}

	public static void createMem() {
		System.out.println("이름입력");
		String name = sc.nextLine();
		System.out.println("ID입력");
		String id = sc.nextLine();
		System.out.println("PASSWORD입력");
		String pw = sc.nextLine();
		System.out.println("나이입력");
		int age = sc.nextInt();

		Member00 mem = new Member00(name, id, pw, age);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}
	}

	public static void memList() {
		for (Member00 mem : memberAry) {
			if (mem != null) {
				System.out.println("이름 : " + mem.getName() + 
						", ID: " + mem.getId() + ", 나이: " + mem.getAge());
			}
		}
	}

	public static void search() {
		System.out.println("id를 입력하세요");
		String selectedId = sc.nextLine();
		System.out.println("password를 입력하세요");
		String selectedPw = sc.nextLine();
		
		for(Member00 mem : memberAry) {
			if(mem !=null && mem.getId().equals(selectedId)) {
				if(mem.getPassword().equals(selectedPw)) {
					System.out.println("이름: " + mem.getName() + ", 나이: " + mem.getAge());
					break;
				} else { 
					System.out.println("비밀번호가 잘못되었습니다");
					break;
				} 
			} else {
				System.out.println("ID가 존재하지 않습니다");
				break;
			}
		}
		
		
		
	}

}