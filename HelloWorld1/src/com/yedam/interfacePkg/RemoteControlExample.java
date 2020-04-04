package com.yedam.interfacePkg;
//인터페이스메소드를 구현한 객체의 실행부??

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null; 
		//리모트컨트롤 인터페이스를 구현하는 객체(Audio,Television)를 담을 수 있는 변수
		rc = new Television();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println("==========");
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		// 개발코드(RemoteControlExample의 코드)는 객체 내부구조(Television, Audio의 내용)
		// 알 필요없이 인터페이스 메소드만 호출.
		// 개발코드 수정없이 객체만 변경하여 리턴값or실행내용 다양화할 수 있음.
		//-> 추상클래스와 뭔 차이?? [ 상속하는/구현하는 객체 간 동일한 추상메소드를 오버라이딩한다는 점, 
		// 부모타입 변수에 객체를 바꿔가며 넣을 수 있다는 점, 객체만 따로 수정하면 결과값 달라진다는 점 동일.]
		// [ 추상 클래스는 일반 필드, 인터페이스는 정적파이널필드_상수_를 갖는다는 점,
		// 추상클래스에서는 부모를 상속extends/인터페이스에서는 부모를 구현implements한다는 점이 차이?? 
		// 그리고 또???]
		
		
		// 명시적인 구현 클래스 작성하지 않고, 익명의 구현클래스선언과 동시에 구현 객체를 생성하는 방법
		// 일회성의 객체 필요시 사용.
		RemoteControl rc1 = new RemoteControl() { 
			// RemoteControl인스턴스를 생성한다는 뜻이 아님
			// -> 중괄호 내의 내용(필드 생성자 메소드 가질 수 있음)으로 클래스 선언하고 객체성성함
			// 해당 클래스는 클래스명이 없고, RemoteControl인터페이스를 구현함.
			
			// 다음과 같다는 의미일까????
			// public class 익명  implements RemoteControl{ 인터페이스의 추상메소드를
			// 오버라이드 하는 실체 메소드 }
			// RemoteControl rc1 = new 익명클래스 
			
			
			int volume; // 인터페이스에는 없는 필드,메소드는 익명 객체 안에서만(추상메소드의 실체메소드 안에서)
			//사용가능 (인터페이스 변수rc1으로 접근할 수 없음_ rc1.volume = 1; 불가)

			@Override
			public void turnOn() {
				System.out.println("익명구현객체를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("익명구현객체를 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				
			}
			
		}; // 선언만 할 때처럼 세미콜론 붙어요
		rc1.turnOn();
		rc1.turnOff();
		
	}
}
