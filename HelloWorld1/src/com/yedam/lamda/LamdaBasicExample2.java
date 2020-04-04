package com.yedam.lamda;
//람다표현식의 구현객체_매개값, 리턴값 유무에 따른 표현방식

interface MyInterfaceNoArgs {
	public void method1();
}

interface MyInterfaceWithArgs {
	public void method2(int a);
}

interface MyInterfaceWithReturn {
	public int method3(int a, int b);
}

public class LamdaBasicExample2 {
	public static void main(String[] args) {
//		MyInterfaceNoArgs fina = new MyInterfaceNoArgs() {
//			@Override
//			public void method1() {
//				System.out.println("no arguments expression.");
//			}
//		};
//		fina.method1();
		//아래와 같이 표현가능

		//매개값x 리턴값x	 
		MyInterfaceNoArgs fina = () -> { //생성자 호출x 
			System.out.println("no arguments expression.");
			//실행문만 남게 됨
		};
		fina.method1();
		
		//매개값o 리턴값x	
		MyInterfaceWithArgs fiwa = (a) -> { 
			//매개값의 변수타입은 생략, but 갯수는 명시해야.
			System.out.println("result is " + a * 3);
		};
		fiwa.method2(5);
		
		//매개값o 리턴값o 
		MyInterfaceWithReturn fiwr = (a,b) -> {
			return a+b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과값은 "+result+"입니다.");
		
		//하나의 실행문, 하나의 매개변수만 있을 경우 () {} 생략가능

	}
}
