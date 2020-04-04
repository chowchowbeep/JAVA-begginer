package com.yedam.collections.set;

public class HashSetExample2 {
	public static void main(String[] args) {
		String str = new String("AA");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2)); 
		//StringIndexOutOfBoundsException(2번인덱스에는 저장된 객체가 없기때문에)			
	}
}
