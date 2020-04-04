package hello;

public class ArrayExample2 {
	public static void main(String[] args) {
		// 2차원 배열을 다뤄봅니다.
		int[][] intAry = { { 2, 3, 4 }, { 5, 6, 7 } };
		// int[2][3] //int[행수][열수] // {{0행0열,0행1열,0행2열},{1행0열,1행1열,1행2열}}
		// 2 3 4 // intAry[0] 
		// 5 6 7 // intAry[1] 

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.print("index가 "+"["+i+","+j+"]"+"인 셀의"+" value는 "+intAry[i][j]+", ");
			}
			System.out.println();
		}
		

		
		
		
		
		
		
		
	}
}
