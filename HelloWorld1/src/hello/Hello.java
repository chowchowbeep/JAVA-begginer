package hello;

public class Hello {
	public static void main(String[] args) {
		//byte a = 127; 
		//a = (byte) (a+1); => byte는 명시적 형 변환 
		//System.out.println("result: " + a); byte의 저장범위는 -128~127이기 때문에 128을 표현하지 못하여 결과값이 -128이 됨.
		
		
		int num1 = 10;
		num1++; //num1 = num1 + 1;
		int a= 5, b = 7;
		num1 = a++ + ++b; // 연산 후 a++ =>6, ++b =>8
		System.out.println(a + ", " + b);
		System.out.println("num1: " +num1); // 연산결과는 num1=5+8=13 a의 경우 연산이 끝나고 6이 됨 
		System.out.println(3 > 5); //<,>,==,=,<=,>= 비교연산자
		
		if(3<5)
			System.out.println("OK"); //else를 쓰지않을 경우 조건을 만족하지 않으면 결과값 반환x
		
		num1  += 3; // num1 = num1 + 3
		System.out.println(num1);
		
		
		
	}
}