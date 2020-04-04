package hello;

public class ArrayExample3 {
	public static void main(String[] args) {

		// #행과 열의 수가 서로 다른 배열 선언
		int[][] intAry = new int[2][]; //2개 행. 열은 지정x.
		intAry[0] = new int[3]; // 0행에는 3열(3개 공간)
		intAry[1] = new int[4]; // 1행에는 4열(4개 공간)
		
		// #행과 열의 수가 다를 경우 행의길이와 열의길이 구하는 법_exercise Five06참고
		
		
		// #행,열수가 서로 다른 2차원배열에서, 증가값을 차례로 삽입
		int a = 8;
		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {//각 행별 열의 수만큼 루핑
				intAry[i][j] = a++;
			}
		}
		// 위에서 삽입한 값 확인
//		for (int i = 0; i < intAry.length; i++) {
//			for (int j = 0; j < intAry[i].length; j++) {
//				System.out.printf("%2d", intAry[i][j]);
//				//println은 입력 후 줄바꿈, printf는 한 줄에 계속해서 입력하되 출력형식 지정가능
//				// %2d -> 2자리를 할당하여 십진수decimal로 출력
//			}
//			System.out.println();
//		}

		// #행,열수가 서로 다른 2차원배열에서, 행별 배열값들의 합계 출력
		for (int i = 0; i < intAry.length; i++) {
			int sum = 0;
			for (int j = 0; j < intAry[i].length; j++) { 
				sum += intAry[i][j];
			}
			System.out.println("=> intAry[" + i + "] => 합:" + sum);
		}

	}
}
