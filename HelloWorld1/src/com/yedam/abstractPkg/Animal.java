package com.yedam.abstractPkg; //추상클래스
//실체클래스의 공통된 필드와 메소드를 가짐.//인스턴스 생성은 불가//

public abstract class Animal { //abstract class해당클래스가 추상클래스임을 명시
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound(); //추상메소드는 정의내용없이  선언만하게 됨.
}

class Cat extends Animal{ 
//hover해서 메시지 확인 -> 애니멀 추상메소드 상속시 메소드가 정의되어있어야 한다는 메시지-> 
//오버라이드로 메소드 재정의 가능

	@Override
	public void sound() {
		System.out.println("애옹");
	} 
}

class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
}