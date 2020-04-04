package com.yedam;
	//상속_자식클래스

	// 상속을 통해 자식클래스는 부모클래스의 필드와 메소드 사용가능하고, 재정의할 수도 있음
	// 부모클래스는 하나만 가질 수 있음(extends뒤에 부모클래스 하나만 위치할 수 있음)
	//
	// 부모클래스가 final class일 경우 상속불가
	// (참고. final은 최종상태인 수정할 수 없는 클래스, 필드, 메소드의 선언시 사용)
	// (protected접근제한자 붙은 필드,메소드는 동일패키지 내 접근가능 
	// 	but 자식클래스는 다른 패키지라도 접근가능 but new이용한  부모의 생성자 호출불가, super()이용 호출)
public class DmbCellPhone extends CellPhone { //자식클래스 extends 부모클래스 -> 상속
	
	int channel;

	public DmbCellPhone() {
		super(); //->슈퍼클래스(부모클래스)의 기본생성자를 호출하는 메소드 
		//부모클래스인 CellPhone의 매개값이 없는 생성자를 호출하여 사용 public CellPhone() {}
		//DmbCellPhoneExample참고. (DmbCellPhone()생성자호출시 부모클래스의 생성자도 호출되어
		//부모클래스의 객체가 만들어지고, 자식객체가 그 다음에 생성됨)		
	} 
	
	public DmbCellPhone(int channel) {
		super(); 
		this.channel = channel;
	}
	
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);// 매개변수타입이 일치하는  부모클래스(슈퍼클래스)의 생성자를 호출
		// 자식클래스 생성자(현재생성자) 호출시 매개값인 model,color는 부모클래스의 생성자의 
		// 매개값으로 들어가서 필드값을 초기화함. 
		// 부모클래스 생성자는 자식클래스 생성자의 가장 윗줄에서 호출되어야 함.
		this.channel = channel; 
	}
	
	void turnOnDmb() {
		System.out.println("채널"+channel +"번 방송수신을 시작합니다");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 "+channel +"번으로 변경합니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다");
	}


											
	
}
