package hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 변수sc에 저장된 scanner 라는 객체. new Scanner인스턴스 생성 
//		System.out.println("input int type");
//		int a = sc.nextInt(); //sc.nextInt()라는 메소드는 사용자의 입력값을 받아(해당구문실행시 입력을 기다리게 됨) int 타입의 변수 a에 저장함.
//		System.out.println("next input");
//		int b = sc.nextInt(); 
//		System.out.println("next input");
//		int c = sc.nextInt(); 
//		int sum = a+b+c;
//		System.out.println("입력값의 합은: "+sum);

		
		int[] intAry = new int[5];
//		int tot = 0;
		for(int i = 0; i < intAry.length; i++) {
			System.out.println("input intAry val");
			intAry[i] = sc.nextInt();
//			tot = intAry[i] + tot;
//		}System.out.println("데이터의 합계는"+tot);
			
		}
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i]);
		}
		
		
		int a,b, result =0;
		Scanner sctwo = new Scanner(System.in);
		System.out.println("첫번째 값을 입력");
		a = sctwo.nextInt();
		System.out.println("두번째 값을 입력");
		b = sctwo.nextInt();
//		if (a > b)
//			result =a;
//		else
//			result =b;
		result = (a > b ? a : b);
		System.out.println(result);
		
		sc.close();
		sctwo.close();
	}
}
