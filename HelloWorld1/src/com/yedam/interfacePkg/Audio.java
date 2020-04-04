package com.yedam.interfacePkg;

public class Audio implements RemoteControl {
	//RemoteControl을 구현하는 객체 Audio
	//Animal에서 추상클래스를 상속extends하여 메소드 오버라이드했던 것과 구분할 것.
	
	int volume;
	
	@Override
	public void turnOn() { //재정의된 메소드, 실제실행메소드
		System.out.println("오디오켬");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오끔");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		
	}
	
}
