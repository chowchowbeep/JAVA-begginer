package hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		int[] intAry = new int[5];
		for(i=0; i < intAry.length; i++) {
			System.out.println("정수입력");
			intAry[i] = sc.nextInt();
		}
		
		int max = 0;
		for(i=0; i < intAry.length; i++) { //배열크기를 초과하게 되면 오류!
			//방법1 (i값을 1로 초기화해야 함)//max = ( intAry[i] > intAry[i-1] ? intAry[i] : intAry[i-1]);
			//방법2 (i값 초기화 0)//max = (max > intAry[i] ? max :intAry[i]);
			//방법3
			if (max < intAry[i])
				max = intAry[i];
		}
		
		System.out.println(max);
		sc.close();
	}
}
