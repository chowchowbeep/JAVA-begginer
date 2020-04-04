package hello;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum]; 
				// 배열크기 변경시
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = scanner.nextInt(); 
					// 스캐너 변수명 같아도 되는지?
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if (selectNo == 4) {
				//변수선언부, for문, 출력부를 각각 따로 입력할 것.
				int max = 0, sum = 0;
				double avg = 0.0; //표시형식?
				
				for (int i = 0; i < scores.length; i++) {
					max = (max < scores[i] ? scores[i] : max);
				}
				for (int i = 0; i < scores.length; i++) {
					sum = sum + scores[i];
				}
				avg = (double)sum/scores.length; //(double)
				
				System.out.println("최고점수: "+max);
				System.out.printf("평균점수: %.3f", avg); 
//	,뒤에 나오는 변수를 %.3f소수점아래 세 자리까지 표시한다는 뜻.
//	System.out.printf("%.3f\ 평균점수: %.3f %2d", avg, 30); 두가지 표시
//  %.3f\ : %.3f를 표시형식 지정이 아닌 문자 그대로 출력하고 싶을 때 \이스케이프문자 사용
				System.out.println();
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		
		scanner.close();
	}
}
