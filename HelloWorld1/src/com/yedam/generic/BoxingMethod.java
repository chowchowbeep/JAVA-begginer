package com.yedam.generic;
//제네릭 메소드 호출

public class BoxingMethod {
	public static void main(String[] args) {
		Integer intValue = new Integer(10);
		Box<Integer> box = Util.boxing(intValue);//아래와 동일
//		Box<Integer> box = Util.<Integer>boxing(intValue);//타입파라미터를 명시적으로지정
		System.out.println(box.getObj());
		
		Box<String> strBox = Util.boxing("hello");
		System.out.println(strBox.getObj());
		
	}
}
