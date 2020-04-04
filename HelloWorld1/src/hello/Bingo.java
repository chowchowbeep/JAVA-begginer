package hello;

public class Bingo {
	public static void main(String[] args) {
//		// 5행5열의 배열 선언
//		int[][] aAry = new int[5][5];
//
//		// 중첩된 for문으로 2차원 배열에 데이터를 삽입, 출력해보기
//		int r, c, val = 1;
//		for (r = 0; r < aAry.length; r++) {
//			for (c = 0; c < aAry[r].length; c++) {
//				aAry[r][c] = val++;
//			}
//		}
		// 값 출력 (데이터 삽입하는 실행문과 분리시켜 두기.)
//		for (r = 0; r < aAry.length; r++) {
//			for (c = 0; c < aAry[r].length; c++) {
//				System.out.printf("%3d",aAry[r][c]); // %3d 데이터의 출력형식을 지정
//			}
//			System.out.println();
//		}

		// 중첩된 for문으로 2차원 배열에 데이터 삽입,출력해보기_ 증가 방향 바꾸기
		int[][] aAry = new int[5][5];
		int i, j, val = 1;
		for (i = 0; i < aAry.length; i++) { 
			//aAry.length -> aAry의 행 갯수
			for (j = aAry[i].length-1 ; j > -1; j--) { //i 열고정, j 행감소
				//aAry[i].length -> i행의 열갯수-1(0행부터 시작이니까)
				aAry[j][i] = val++;
			}
		}
		

		for (i = 0 ; i < aAry.length; i++) {
			for (j = 0; j < aAry[i].length; j++) {
				System.out.printf("%3d", aAry[i][j]); // %3d 데이터의 출력형식을 지정
			}
			System.out.println();
		}

	}
}
