package api.wrapper;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 Boxing
		Integer obj = 100; //포장클래스타입에 기본타입데이터대입_힙영역에 객체생성 
		System.out.println("value: " + obj.intValue());

		// 대입시 자동 Unboxing
		int value = obj; //기본타입에 포장클래스타입 객체 대입
		System.out.println("value: " + value);

		// 연산시 자동 Unboxing
		int result = obj + 100; //Integer타입객체와 int타입값 연산시 
		System.out.println("result: " + result);

	}
}
