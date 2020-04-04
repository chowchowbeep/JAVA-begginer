package classes;

public class Car { //# 메인메소드가 없는  클래스
	//Car라는 class(# 객체를 위한 설계도)
	
	//객체에 대한 정의 속성과 기능(# 클래스의 멤버_필드,메소드,생성자_Student클래스 참조)
	
	//필드_객체정의 속성 :Car클래스에 속하는 객체는 다음과 같은 속성을 가질 것입니다.
	String model;
	String color;
	int price;
	int maxSpeed;
	
	//메소드_객체의 기능(실행부) :Car클래스에 속하는 객체는 다음과 같은 기능을 할 것입니다.
	void drive() {
		System.out.println("최고속도는 " + maxSpeed);
		//maxSpeed 필드를 사용하는 메소드
	}
	void stop() {
		System.out.println("멈춥니다.");
	}
	void accelerate() {
		
	}
}
