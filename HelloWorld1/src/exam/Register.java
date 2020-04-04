package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atHome.Member00;

public class Register {
	private static Scanner sc = new Scanner(System.in);
//	List<Member> list = new ArrayList<Member>();
	private static Member[] memberAry = new Member[100];

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.회원등록 | 2.회원조회 | 3.등록그룹별리스트 | 4.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int num = sc.nextInt();
			sc.nextLine();
			if (num == 1) {
				createMem();
			} else if (num == 2) {
				searchMem();
			} else if (num == 3) {
				group();
			} else if (num == 4) {
				run = false;
			}
		}
	}

	public static void createMem() {
		System.out.println("회원번호입력");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("이름입력");
		String name = sc.nextLine();
		System.out.println("등록과정을 입력하세요");
		System.out.println("수영 | 테니스 | 베드민턴");
		String course = sc.nextLine();

		Member mem = new Member(num, name, course);

		for (int i = 0; i < memberAry.length; i++) {
			if (memberAry[i] == null) {
				memberAry[i] = mem;
				break;
			}
		}
	}

	public static void searchMem() {
		System.out.println("회원번호를 입력하세요");
		int selectedNum = sc.nextInt();
		sc.nextLine();

		for (Member mem : memberAry) {
			if (mem != null && mem.getNum() == selectedNum) {
				System.out.println("회원번호: " + mem.getNum() + ", 회원이름: " + mem.getName() + ", 등록과정: " + mem.getCourse());
				break;
			} 
		}
	}

	public static void group() {
		System.out.println("과정명을 입력하세요");
		System.out.println("수영 | 테니스 | 베드민턴");
		String course = sc.nextLine();

		for (Member mem : memberAry) {
			if (mem != null && course.equals(mem.getCourse())) {
				System.out.println("회원번호: " + mem.getNum() + ", 회원이름: " + mem.getName() + ", 등록과정: " + mem.getCourse());
				break;
			} else {
				System.out.println("존재하지 않는 과정명이거나, 수강등록내역이 없습니다");
			}
		}
	}
}