package com.yedam.generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>(); 
		//선언하는 시점에 제네릭데이터타입이 어떤 데이터타입인지 정해짐.
		//(클래스의 제네릭타입이 모두 String으로 대체됨)
		box.setObj(new String("Hello"));
		String str = box.getObj();
		
		Box<Integer> intBox = new Box<>();
		//인스턴스변수에 데이터타입명시하는 경우 new 클래스명<>에는  데이터타입 생략가능
		intBox.setObj(10);
		int intValue = intBox.getObj();
		
		
		
		
//		box.setObj(new String("Hello"));
//		String strValue = (String) box.getObj();
//		System.out.println(strValue);
//		
//		box.setObj(new Integer(10));
//		int intValue = (int) box.getObj();
//		System.out.println(intValue);
//		
//		box.setObj(new Double(1.1));
//		String newStr = ()box.getObj();
		
		
		//메소드의 매개값이 오브젝트타입이기 때문에 어떤 타입이든(오브젝트를 상속하는) 올 수 있음
		
		
		
		
		
	}
}
