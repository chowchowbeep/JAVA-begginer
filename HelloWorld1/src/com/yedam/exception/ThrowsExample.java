package com.yedam.exception;

public class ThrowsExample {
	public static void main(String[] args) {
		try { //findclass()정의시 예외처리할 수도 있음
			findClass();
		} catch (ClassNotFoundException e) {//예외발생시JVM은 예외클래스로 객체를 생성
			e.printStackTrace();//예외객체이용
			//ClassNotFoundException e을 받아서 오류트레이싱 결과값 출력
		}
		System.out.println("findClass()호출 후");
		
	
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		
		//호출한 영역으로 예외를 넘김
		Class clazz = null;
		clazz =	Class.forName("java.lang.String2");
		//Class.forName()메소드는 매개값인 클래스가 존재하면 해당객체 리턴, 
		//없으면  ClassNotFoundException발생
		System.out.println(clazz.getName());
	}
}
