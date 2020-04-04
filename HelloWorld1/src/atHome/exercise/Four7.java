package atHome.exercise;

import java.util.Scanner;

public class Four7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		int in = 0; // 예금액
		int out = 0; // 출금액

		while (run) {
			System.out.println("---------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("---------------------------");
			System.out.println("선택>");
			int selected = sc.nextInt(); // selected변수에 지금 입력받는 값을 저장

			if (selected == 1) {
				System.out.println("예금액");
				in = sc.nextInt();
			} else if (selected == 2) {
				System.out.println("출금액");
				out = sc.nextInt();
			} else if (selected == 3) {
				System.out.println("잔고>" + (in - out));
			} else if (selected == 4) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}
}
