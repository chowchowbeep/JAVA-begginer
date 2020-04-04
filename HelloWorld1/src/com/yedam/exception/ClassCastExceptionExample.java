package com.yedam.exception;

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}



public class ClassCastExceptionExample { //억지로 타입변환시 발생하는 예외
	public static void main(String[] args) {
		Animal animal = null;
		Dog dog = new Dog();
		Cat cat = new Cat();
		animal = dog;
		animal = cat;
		Animal animal2 = new Animal();

		// ClassCastException을 방지하기 위해 타입변환가능여부 먼저 확인
		if (animal instanceof Cat)
			cat = (Cat) animal;
		
		cat = (Cat) animal2; 
		//ClassCastException
		//상위->하위로  인터페이스->구현클래스로 캐스팅 불가.
		
	}
}
