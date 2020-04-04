package com.yedam.generic;
//제네릭타입에서의 메소드

public class Util {
	public static <T> Box<T> boxing(T t){
//		<T>제네릭 타입임을 컴파일러에게 알려줌. Box<T>는 리턴타입(사용될 때 타입이 정해짐)
		Box<T> box = new Box<T>();// 
		box.setObj(t);
		return box;	
	}
	
	public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
		//필드값이 동일하면 논리적으로 동일한 객체로 인식하도록 		
	}
	
	public static <K,V> boolean compareValue(Pair<K,V> p1, Pair<K,V> p2) {
		boolean bool = p1.getValue().equals(p2.getValue());
		return bool;
		//value만 같아도 true반환
	}
	
	//제네릭타입에 제한을 가하는 경우
	public static <T extends Number> int compare(T t1, T t2) {
		// 다음으로 등장하는 T는 메소드 호출시 매개변수의 데이터타입이 결정되며, 
		// Number클래스이하의 클래스타입만 매개변수의 데이터타입으로 올 수 있습니다.
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}
	
	// <K,V>제네릭타입 명시(다음으로 등장하는 K와 V는 메소드 호출시 데이터타입이 결정됩니다.) 
	// V 리턴타입(호출시 구체적타입결정) // 매개변수로는 Pair타입 객체와 K타입 변수를 받습니다. 
	// Pair타입의 클래스멤버에서 K,V와 변수인 K의 타입이 메소드 호출시 결정됩니다.
	public static <K,V> V getValue(Pair<K,V> p, K s) {
		if(p.getKey().equals(s)) {
			return p.getValue();
		} else {
			return null;
		}
	}
	
	
	
	
	
//	public static Box boxing2(int a) {
//		return null;
//	}
}
