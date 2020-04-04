//오버라이딩
//부모클래스의 메소드를 상속받아 재정의 하는 것.
//부모클래스의 메소드가 static, private, final일 경우 오버라이딩 불가


package com.yedam;

//부모클래스에서 메소드정의
class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

//자식클래스에서 오버라이딩
class Computer extends Calculator { // Calculator를 상속받음 
	
	
	// 오버라이드 어노테이션 아래 재정의 메소드 입력
	// 이 떄 재정의 메소드는 부모클래스 메소드와 시그니처(리턴타입, 메소드명, 매개변수리스트)가 동일해야 오버라이딩가능
	@Override
	double areaCircle(double r) { //시그니처(리턴타입, 메소드명, 매개변수리스트)
		return Math.PI * r * r; //Math.PI보다 정밀한 계산이 가능하도록 재정의
	} 
	//override라는 annotation(컴파일러에? 코드 컴파일,처리방식에 관한정보제공)은 
	//상속받은 메소드를 재정의할 때, 부모의 메소드와 타입이 같은지 컴파일러가 검사할 수있도록 오버라이드 했음을 알려줌
	//오버라이드 어노테이션 입력않을 경우, 오버라이딩이 아니라 새로운 메소드로 인식
	
	
	
	double areaCircle1(double r) { //부모 클래스의 메소드를 호출
		return super.areaCircle(r);
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println("결과값은 "+com.areaCircle1(10));
		//부모클래스의 메소드호출_원래 상태 그대로
		System.out.println("결과값은 "+com.areaCircle(10));
		//오버라이딩 적용된 자식클래스 메소드
		
	}
}

