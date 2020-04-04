package classes;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {
		//특정금액을 입력받아, 지폐권 및 동전 종류별로 몇 개씩으로 환산되는지 출력
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("얼마?");
//		int rem = sc.nextInt();
		
//		int perAry[]= {50000,10000,5000,1000,500,100,50,10};
//		int resultAry[] = new int[perAry.length];
//		
//	
//		for(int i=0; i<perAry.length; i++ ) {
//			resultAry[i]=rem/perAry[i];
//			rem = rem%perAry[i];
//		}
//		for(int i=0; i<perAry.length; i++ ) {
//			System.out.println(perAry[i]+"원은 "+resultAry[i]+"장");
//		}
		System.out.println("얼마?");
		int rem = sc.nextInt();
		excg(rem);
		sc.close();
		
	}
	
	
	
	public static void excg(int rem) {
		int perAry[]= {50000,10000,5000,1000,500,100,50,10};
		int resultAry[] = new int[perAry.length];
		
	
		for(int i=0; i<perAry.length; i++ ) {
			resultAry[i]=rem/perAry[i];
			rem = rem%perAry[i];
		}

		for(int i=0; i<perAry.length; i++ ) {
			System.out.println(perAry[i]+"원은 "+resultAry[i]+"장");
		}
	}



}
