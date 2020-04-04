package com.yedam.interfacePkg;

public class Television implements RemoteControl {//RemoteControl을 구현하는 객체Television 
	int volume;
	
//	add  unimplement method
	@Override 
	public void turnOn() {
		System.out.println("텔레비젼을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비젼을 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
