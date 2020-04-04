package classes;

import java.util.Scanner;

public class MemberExample2 {
	private static Scanner sc = new Scanner(System.in);
	private static Member[] memArray = new Member[100]; 
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계정생성 | 2.계정목록 | 3.계정조회 | 4.종료");
			System.out.println("-----------------------------------");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == 1) {
				createMember();
			} else if (num == 2) {
				getMemberList();
			} else if (num == 3) {
				verify();
			} else if (num == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	}

	// 계정생성
	public static void createMember() {
		System.out.println("이름을 입력하세요");
		String memName = sc.nextLine();
		System.out.println("id를 입력하세요");
		String memID = sc.nextLine();
		System.out.println("password를 입력하세요");
		String memPW = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int memAge = sc.nextInt();
		Member mem = new Member(memName, memID, memPW, memAge);
		for (int i = 0; i < memArray.length; i++) {
			if (memArray[i] == null) {
				memArray[i] = mem;
				return;// return void 메소드 종료 // break 반복문 종료
			}
		}
	}

	// 계정목록
	public static void getMemberList() {
		for (Member a : memArray) {
			if (a != null)
				System.out.println("이름: " + a.getName() + ", ID: " + a.getId() + ", PW: " + a.getPassword() + ", 나이: "
						+ a.getAge());
		}
	}

	// 계정조회
	public static void verify() {
//		System.out.println("id를 입력하세요");
//		String memPW = sc.nextLine();
//		System.out.println("password를 입력하세요");
//		String passwd = sc.nextLine();
//		
//		for(Member memb : memArray) {
//			if( memb != null && memb.getId().equals(memID) && 
//			//memb이 null이 아니어야 연산가능
//					memb.getPassword().equals(memPW) ) {
//				System.out.println("이름: "+memb.getName()+"나이: "+memb.getAge());
//			} else if ( memb != null && memb.getId().equals(memID) &&
//					!memb.getPassword().equals(memPW) ) {
//				System.out.println("패스워드가 잘못되었습니다");
//			} else if ( memb != null) {
//				System.out.println("존재하지 않는 id입니다");
//			}
//		}
		
		//입력, 변수선언, 필드값일치 판단, 출력부를 따로
		
		System.out.println("id를 입력하세요"); 
		String id = sc.nextLine();
		System.out.println("password를 입력하세요");
		String passwd = sc.nextLine();
		
		boolean isId = false; 
		boolean isPw = false;
		
		int age = 0;
		String name = null;

		for (Member m : memArray) {
			if (m != null && m.getId().equals(id)) {
				if (m.getPassword().equals(passwd)) {
					isId = true;
					isPw = true;
					name = m.getName();
					age = m.getAge();
					break;
				} else {
					isId = true;
					isPw = false;
					break;
				}
			} else {
				isId = false;
				isPw = false;
				break;
			}
		}
		
		if (isId == true && isPw == true)
			System.out.println("이름은 " + name + "나이는 " + age);
		else if (isId == true && isPw == false)
			System.out.println("비번이 틀림");
		else if (isId == false && isPw == false) {
			System.out.println("존재하지 않는 ID");
		}

	}

}
