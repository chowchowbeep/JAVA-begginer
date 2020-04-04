package com.yedam; //상속_부모클래스

public class CellPhone { 
	String model;
	String color;
	
	
	public CellPhone() {
		super(); //super()메소드//부모클래스를 가리킴
		//extends를 쓰지 않는 모든 클래스의 부모 클래스는 자바에서의 최상위 클래스인 java.lang.Object
		//모든 클래스는 자동적으로  java.lang.Object를 상속받음
		
		
	}
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff(){
		System.out.println("전원을 끕니다");
	}
	void bell() {
		System.out.println("벨을 울립니다");
	}
	void hangup() {
		System.out.println("전화를 끊습니다");
	}
}
