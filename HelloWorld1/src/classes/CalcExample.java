// 메소드 호출 + static개념(정적 필드,메소드 사용하는 경우와 그렇지 않은 경우)
// Calculator 참조
package classes;

import java.util.Scanner;

public class CalcExample {
	public static void main(String[] args) { //실행
		Scanner sc = new Scanner (System.in);// Scanner라는 클래스 
		Calculator cal = new Calculator(); //먼저 인스턴스 생성
		System.out.println("정수값을 입력하세요");
		int a = sc.nextInt();
		System.out.println("정수값을 입력하세요");
		int b = sc.nextInt();
		cal.execute(a,b); 
		// static붙지않은 메소드 ->인스턴스 생성 후 메소드 호출
		// (인스턴스 참조변수명.메소드명으로 호출) 
//		//execute메소드 내 결과출력을 해주는 메소드가 있어서 sysoutprintln별도로 입력안함.
		sc.close();
		
		
		Calculator.plus(23.5,10.2);
		// static 정적메소드호출 ->인스턴스 생성없이 클래스이름으로 바로 메소드 실행가능
		//(변수명.메소드명 아니라 클래스명.메소드명 으로 호출)
		Calculator.minus(23.5,10.2);
		
		System.out.println(Calculator.pi);
		// Calculator클래스의 pi필드는 정적static 필드이기 때문에
		// 인스턴스 생성없이 클래스이름.필드명으로 필드에 접근가능
		// (변수명.필드명 아니라 클래스명.필드명 )
		
		// system클래스명이 동일하나, 매개변수의 데이터타입이 다르게 정의되어 오버로딩
		// System.out.println()에는 매개변수의 데이터 타입이 다양하게 정의되어 있음
		System.out.println(23);
		System.out.println("Hello");
	}
}
