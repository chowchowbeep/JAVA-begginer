package hello;

public class StringExample {
	public static void main(String[] args) {
		//기본타임과 참조타입 차이 알아보기 p139참고
		
		
		//문자열 리터럴을 통해 값을 저장
		String str1 =  "Nice"; // 참조타입(int,short,long같은 기본타입과 다름) => 메모리의 번지값이 저장되어 있음
		String str2 =  "Nice";
		//힙에 생성된 하나의 nice를 스택영역에 생성된 변수str2,1이 참조 
		
		if(str1 == str2) { 
			System.out.println("동일한 참조값");
		} else {
			System.out.println("다른 참조값");
		}
		
		
		//new를 이용한 변수선언
		String str3 = new String("Nice");
		String str4 = new String("Nice");
		//힙에 생성된 각각의 '객체?'nice를 스택영역에 생성된 변수str3,4가 각각 참조 
		
		
		if(str3 == str4) { //주소값으로 비교(==)
			System.out.println("동일한 참조값");
		} else {
			System.out.println("다른 참조값");
		} 
		
		
		if(str3.equals(str4)) { //값으로 비교(equals라는 메소드 이용)
			System.out.println("동일한 값");
		} else {
			System.out.println("다른 값");
		}
		
		
		
		
		
	}
}
