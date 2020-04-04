package com.yedam.abstractPkg;

public class AnimalExample {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound();
		dog.sound();
		//-> 동일한 메소드(Animal의 추상메소드)를 오버라이드하고, 실행내용은 다름
		
		
		System.out.println("--------------------");
		Animal animal = null; //애니멀타입 참조변수 생성(추상클래스기때문에 인스턴스생성은 불가)
		animal = cat; //애니멀 타입 참조변수에 애니멀클래스를 상속하는 Cat인스턴스의 주소를 저장
//		animal.sound();
		animalSound(animal); //Cat인스턴스 주소를 매개값으로 하여 메소드호출됨. 
		animal = dog; //애니멀 타입 참조변수에 애니멀클래스를 상속하는 Dog인스턴스의 주소를 저장
		animalSound(animal); //Dog인스턴스 주소를 매개값으로 하여 메소드호출됨. 
	}

		
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}

