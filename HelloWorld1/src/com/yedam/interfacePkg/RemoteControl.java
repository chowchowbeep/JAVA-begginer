package com.yedam.interfacePkg;
// 인터페이스 정리
// 인터페이스는 객체사용설명서, 개발코드와 객체가 서로 통신하는 접점
// 개발코드는 객체 내부구조 알 필요없이 인터페이스 메소드만 알고 있으면 됨
// 개발코드 수정없이 객체를 변경하고 리턴값or실행내용 다양화하는 것을 가능하게 함

//구성멤버 : static final(상수), 추상메소드(실행블록이 없는 메소드),
// 	default 메소드(접근제한은 자동으로 public. 실행블록있음. 자바8부터), static(자바8부터)
//->new생성자로 인스턴스 만들 수 없음(상수와 메소드만을 멤버로 가짐)


public interface RemoteControl {
	//상수필드
	public static final int MAX_VVALUE =10;//선언과 동시에  초기값 반드시 지정해야 함
	int MIN_VALUE =0;// public static final을 생략해도 자동으로 컴파일과정에서 붙게 됨
	
	//아래는 모두 추상메소드(정의내용이 위치하는 실행블록이 없는 메소드)
	//인터페이스 내에서는 	public abstract를 생략해도 자동으로 컴파일과정에서 붙게 됨
	public abstract void turnOn();  
	public void turnOff();
	public void setVolume(int volume);
}