package hello;

import java.util.Scanner;

public class MethodExample2 {
	public static void menu() {
		System.out.println("------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------");
		System.out.println("선택>");

	}

	public static int[] menu2(int[] ary) {//int[] ary에 scores(값이 채워지지않고 크기는 studentNum과 동일한 배열)를 매개변수로 받음.
		Scanner scanner = new Scanner(System.in);
		int[] copyAry = new int[ary.length]; //위에서 받은 매개변수 배열의 크기와 동일한 크기의 배열인 copyAry를 생성함.
		for (int i = 0; i < ary.length; i++) {
			System.out.println("scores[" + i + "]>");
			copyAry[i] = scanner.nextInt();
			scanner.close();
		}
		return copyAry; //for문을 통해 copyAry[]배열에 scanner를 통해 입력된 값이 저장되고, 
		//해당 배열(매개변수로 받을 때는 값이 저장되어 있지 않았지만 menu2메소드 내에서 값이 저장됨)을 menu2를 호출한 곳으로 리턴함
	}

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			menu(); // 원래 명령어을 메소드로 만들어서 호출함.

			int selectNo = scanner.nextInt();

			if (selectNo == 1) { // 학생수 배열 생성
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; // 배열크기 변경시
 
			} else if (selectNo == 2) { //배열 점수 입력
				scores=menu2(scores); //scores는 studentNum과 동일한 크기를 가진 배열_ []는 입력x
			
			} else if (selectNo == 3) { //배열조회
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				// 변수선언부, for문, 출력부를 각각 따로 입력할 것.
				int max = 0, sum = 0;
				double avg = 0.0; // 표시형식?

				for (int i = 0; i < studentNum; i++) {
					max = (max < scores[i] ? scores[i] : max);
				}
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				avg = (double) sum / scores.length; // (double)

				System.out.println("최고점수: " + max);
				System.out.printf("평균점수: %.3f", avg);
//				,뒤에 나오는 변수를 %.3f소수점아래 세 자리까지 표시한다는 뜻.
//				System.out.printf("%.3f\ 평균점수: %.3f %2d", avg, 30); 두가지 표시
//  			%.3f\ : %.3f를 표시형식 지정이 아닌 문자 그대로 출력하고 싶을 때 \이스케이프문자 사용
				System.out.println();

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		scanner.close();
		
	}
	
}
