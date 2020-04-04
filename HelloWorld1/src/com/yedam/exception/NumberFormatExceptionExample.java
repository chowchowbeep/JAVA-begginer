package com.yedam.exception;

public class NumberFormatExceptionExample { 
	//숫자로 변환될 수 없는 문자를 숫자로 변환하려할 때 발생하는 예외
	public static void main(String[] args) {
		String data1 = "a10";
		String data2 = "20";
		
		int val1 = Integer.parseInt(data1);//문자열을 정수값으로 변환하여 리턴
		//a10을 정수타입으로 변환불가 NumberFormatException
		int val2 = Integer.parseInt(data2);
		
		int result = val1+val2;
		System.out.println("sum: "+(result));
	}

}
