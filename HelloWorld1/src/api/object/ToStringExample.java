package api.object;

import java.util.Date;

public class ToStringExample { //toString():객체를 문자열로 표현한 값리턴
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		//Object클래스의 toString()(재정의 전의 메소드)은 클래스명@진수해시코드리턴
		System.out.println(obj1.toString());
		//Date클래스의 경우toString()을 재정의하여 현재 시스텀 날짜시간정보리턴
		System.out.println(obj2.toString());
	}
}
