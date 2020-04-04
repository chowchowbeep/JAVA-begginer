package api.math_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택번호 
		int[] selectNumber = new int[6];//선택번호 6개가 저장될 배열생성
		Random random = new Random(3);//선택번호얻기위한 객체생성_종자값3
		System.out.println("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			//0<= <int n // 0<= <45 // 1<= <46
			System.out.println(selectNumber[i]+" ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber =new int[6];
		random = new Random(5);
		System.out.println("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) +1;
			System.out.println(winningNumber[i]+" ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber); //비교하기 전에 정렬
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		//배열 항목값비교
		System.out.println("당첨여부");
		if(result) {
			System.out.println("1등에 당첨되셨습니다");
		} else {
			System.out.println("당첨되지 않았습니다");
		}
	}
}
