//상속에서의 형변환
//자식클래스타입->부모클래스타입으로 자동 형변환 가능
//부모클래스타입->자식클래스타입으로는 강제 형변환 필요

package com.yedam;
class Parent{
	void method1() {
		System.out.println("부모클래스의 메소드1");
	}
	void method2() {
		System.out.println("부모클래스의 메소드2");
	}
}

class Child extends Parent{
	@Override
	void method1() {
		System.out.println("자식클래스의 메소드1"); //부모클래스 메소드 재정의_오버라이드
	}
	@Override
	void method2() {
		System.out.println("자식클래스의 메소드2"); //부모클래스 메소드 재정의_오버라이드
	}
	void method3() {
		System.out.println("자식클래스의 메소드3"); //자식클래스의 독자적인 메소드
	}
}

public class Parentexample {
	public static void main(String[] args) {
		
//자식인스턴스를 참조하는 자식클래스타입변수는 부모타입이 됐다가 다시 자식타입이 될 수 있음(아래 참고)
		Child c1 = new Child(); //자식클래스 인스턴스 생성
//		c1.method1();
//		c1.method2();
//		c1.method3();
		
//		System.out.println(c1); //com.yedam.Child@15db9742
		//Child클래스타입 변수에 담긴 Child인스턴스 주소를  Parent클래스타입의 변수에 저장?(자동 형변환 가능)
		Parent p1 = c1; 
//		System.out.println(p1); //com.yedam.Child@15db9742
		
		// 부모타입으로 자동형변환된 이후로는 부모의 필드,메소드에만 접근이 가능하나,
		// 자식클래스에서 오버라이딩된 경우에는 자식클래스의 메소드가 호출된다.
//		p1.method1(); // 자식 인스턴스의 메소드 호출됨(오버라이딩되었기 때문)
//		p1.method2(); // 자식 인스턴스의 메소드 호출됨(오버라이딩되었기 때문)
//		p1.method3(); // 부모의 메소드가 아니고, 오버라이딩된 메소드도 아니기 때문에 접근 불가
//		c1 = (Child) p1;	//가능
		
		if(p1 instanceof Child) { 
	// 참조변수p1이 참조하는 게 Child클래스의 인스턴스인지 확인(참조변수가 참조하는 인스턴스의 실제 타입 확인)하여
	// 참조변수를 검사한타입(Child타입)으로 형변환이 가능한지를 검사
	// p1이 참조하는 객체는 Child인스턴스가 맞기 때문에 true 
			c1 = (Child) p1; 
		//부모타입이었던 참조변수p1을 자식타입으로 강제 형변환(부모가 자식보다 크기때문에 자동형변환은 불가)하여,
		//참조변수p1에 저장돼있던 Child인스턴스주소를 Child타입 참조변수c1에 저장
			c1.method1();   //Child의 메소드 호출
			c1.method2();	//Child의 메소드 호출
			c1.method3();	//Child의 메소드 호출
			
		
		Parent p2 = new Parent();
//		p2.method1();
//		p2.method2();
//		System.out.println(p2); //com.yedam.Parent@6d06d69c
		c1 = (Child) p2; //형변환오류
//		System.out.println(c1); //불가
// 부모클래스타입 참조변수p2를 자식 클래스타입 참조변수로(부모가 자식보다 크기때문에 자동형변환은 불가) 강제형변환하여
// 부모인스턴스주소를 자식클래스타입 참조변수에 저장 -> 강제형변환으로 저장은 가능이라고??? 저장도 안되는데??
		c1.method1();//호출불가
		c1.method2();//호출불가
		c1.method3();//호출불가
		

		}
//		Parent p2 = new Parent(); 
//		if (p2 instanceof Child) { //Parent타입 변수p2가 참조하는 게 Child의 인스턴스인가?아님.
//			c1 = (Child) p2; //따라서 p2를 Child타입으로 형변환하여 p2에 저장돼있던 
		//Parent타입의인스턴스 주소를 Child타입의 참조변수c1에 저장할 수 없음
//			c1.method1(); //호출불가
//			c1.method2(); //호출불가
//			c1.method3(); //호출불가
//		}

		

	}
}
