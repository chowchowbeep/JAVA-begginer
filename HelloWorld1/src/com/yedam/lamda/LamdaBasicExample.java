package com.yedam.lamda;
//람다식
//익명함수 생성식
//클래스 선언하여 작업하는 번거로움을 해결

//functional interface(람다식의 대상)(구현할 메소드가 하나만 정의되는 인터페이스)
@FunctionalInterface // 어노테이션으로 인해 구현 메소드의 갯수 체크됨.
interface MyInterface { // 인터페이스를 먼저 정의 
	//람다식이 대입되는 인터페이스(람다식의 타겟타입)
	int print(int a, int b); // 구현클래스에서 정의될 추상메소드
}

////기존의 구현클래스_람다식에서는 사용하지 않게 됨.
//class MyInterfaceClass implements MyInterface {
//	@Override
//	public int print(int a, int b) {
//		return a + b;
//	}
//}

public class LamdaBasicExample {
	public static void main(String[] args) {
		
		//람다표현식의 구현객체_매개값, 리턴값이 있는
		//FunctionalInterface(구현메소드가 하나만)로 인해 간결
		// 생성자 없지만 런타임시 익명구현 객체 생성됨
		MyInterface mi = (c, d) -> { //매개변수갯수와 실행구문만 남겨둠
			return c / d; 
			// 실행문에 return문만 있거나, 
			// return문 뒤에 연산식, 메소드 호출되는 경우 return문자 생략가능
		};
		int result = mi.print(8,4);
		System.out.println("결과값은 "+result+"입니다.");
			
		
		
//		// 이름이 있는 구현클래스MyInterfaceClass의 객체 생성
//		MyInterface mi = new MyInterfaceClass();
//		// 구현클래스에서 정의된 메소드사용
//		int result = mi.print(4, 9);
//		System.out.println("결과값은 : " + result);
		
		
//		// 기존방식_익명구현객체 생성1_
//		mi = new MyInterface() {
//			@Override
//			public int print(int a, int b) {
//				return a * b;
//			}
//		};
//		result = mi.print(3, 5);
//		System.out.println("결과값은: " + result);

//		// 기존방식_익명구현객체 생성2
//		mi = new MyInterface() {// 익명구현객체 생성
//			@Override
//			public int print(int a, int b) {
//				return a - b;
//			}
//		};
//		result = mi.print(7, 4);
//		System.out.println("결과값은: " + result);

	}

}
