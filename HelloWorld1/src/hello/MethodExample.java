package hello;

public class MethodExample {
	public static void main(String[] args) { // 스트링타입의 배열이 args 매개값으로 올 수 있다. /void는 결과값이 없음을 의미
		int a = 50;
		System.out.println(args[0]); // 매개값으로 들어온 것 중 첫번째요소 //
		showName(); // showName()이라는 메소드를 메인메소드로 불러와 실행
		showAge(a); // 변수 a=50값을 매개값으로 하여 showAge메소드를 호출
		showMe(175.5, 65.5);
//		int sumR = sum(4,5); 
		//sum메소드의 값을 리턴받아 result변수에 담고, 아래 sysout출력
//		int minusR = minus(5,3);
//		int multiR = multi(5,3);
//		double divR = div(5,3);
//		
//		int result = sum(sum(4,5),multi(5,6)); 
		//호출한 함수의 리턴값을 매개값으로 사용함

		double weightR = goodWeight(158.2); 
//	데이터타입 메인메소드에서 사용할(ex.sysout출력할)변수이름 = 메소드명(매개변수); 

//		System.out.println("결과값: "+result);
//		System.out.println("합: "+sumR);
//		System.out.println("차: "+minusR+" 곱: "+multiR+" 나눔: "+divR);

		System.out.println("적정몸무게는" + weightR + "입니다"); // 적정몸무게

		System.out.println(args[1]);
	}

	public static double goodWeight(double tall) {
		return (tall - 100) * 0.9;
	}

//	public static int minus(int a, int b) {
//		return a-b;
//	}
//	public static int multi(int a, int b) {
//		return a*b;
//	}
//	public static double div(int a, int b) { 
	//리턴타입이 double, 매개값을 int로 지정
//		return a/b;
//	}
//	
//	public static int sum(int a, int b) { 
	// 리턴타입 int(결과값의 데이터타입)로 지정 
	//void와 다르게 리턴 구문이 있음 리턴 구문은 void에서는 불가
//		return a + b; 
	//sum이라는 메소드 호출시 매개값을 받아 연산값을 리턴해줌
//	}

	public static void showMe(double height, double weight) {
		System.out.println("I am " + height + "cm and " + weight + "kg");
	}

	// int타입의 매개값을 활용
	public static void showAge(int age) { 
		// showAge메소드 호출시 매개값으로 인트타입을 받도록 지정해둠.
		System.out.println("I am " + age + "years old."); 
		// 메인메소드에서 호출되어 showAge(매개값)을 받아 실행됨
	}

	public static void showName() {
		// showName이라는 메소드 ()는 실행
		System.out.println("Hello my name is cc");
	}

}