//예외: 프로그램오류. 발생시 프로그램 즉시 종료. but 예외처리를 통해  정상실행 유지가능케 함.
//JVM은 예외발생시 해당 예외클래스로 객체 생성하여 예외처리코드에서 예외객체 이용하게 함.
//모든 예외 클래스는 java.lang.Exception클래스 상속.
//일반예외:예외처리코드필요. 없을경우컴파일오류발생
//실행예외:예외처리코드 필요. 컴파일과정에서 해당코드 검사x
package com.yedam.exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String str = null; // "test"; //new String("test");
		System.out.println(str.toString());
		//NullPointerException
		//참조하는 객체가 null일경우 (객체가 없는 상태에서 객체를 사용함.)
		//String객체의 메소드를 호출하였는데 참조하고 있는 String객체가 없기 때문에 발생				
			
		
	}
}
