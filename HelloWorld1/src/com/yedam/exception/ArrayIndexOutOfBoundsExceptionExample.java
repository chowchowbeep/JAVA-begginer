package com.yedam.exception;

public class ArrayIndexOutOfBoundsExceptionExample { //배열에서 인덱스 범위을 초과하여 사용할 경우 발생
	public static void main(String[] args) {
		
//		ArrayIndexOutOfBoundsException방지를 위해 배열길이를 먼저 조사
		if(args.length == 2) { //main메소드의 String type 매개값이 2개 들어오는지 먼저 검사
			//(매개값index를 충분히 이용가능한지 검사)
			String data1 = args[0]; 
			String data2 = args[1];
			System.out.println("args[0]: "+ data1);//arg 값 없을경우예외발생 args[0]인덱스 사용불가
			System.out.println("args[1]: "+ data2);
			//run configurations에서 arg값을 입력하면 예외발생x

		} else { //매개값이 부족한 경우 실행방법을 안내
			System.out.println("[실행방법]");
			System.out.println("java ArrayIndexOutOfBoundsException");
			System.out.println("값1 값2"); 
		}
	}
}
