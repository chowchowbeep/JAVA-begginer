package classes;

public class Calculator { //CalcExample참조
	// 클래스 내 메소드 정리.(연결된 메소드_메소드 내에서 메소드 호출) 
	// + static 개념 (정적 멤버=클래스멤버_ 객체생성없이 사용할 수 있는 필드,메소드 )
	
	static double pi = 3.14; 
	// static 정적 필드 -> 인스턴스 생성없이 클래스이름으로 바로 필드접근가능
	// 객체(인스턴스)마다 가지고 있을 필요가 없는 변하지 않는 데이터일 경우. 
	
	static double plus(double x, double y) {
		return x+y;
	} //static 정적 메소드 -> 인스턴스 생성없이 클래스이름으로 바로 메소드실행
	
	static double minus(double x, double y ) {
		return x-y;
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result; //  int plus-> 리턴타입이 int
	}

	double avg(int a, int b) {
		int sum = plus(a,b);
		double result = (double)sum/2; 
		// 자바에서는 보통 정수연산을 4byte int로 처리하여 결과값도 int타입임. 
		// (a:11,b:12일경우 double relsult에 저장되는 값은 11.0)
		// 따라서double형태의 연산결과가 나올 수 있도록 강제형변환필요
		// (a:11,b:12일경우 double relsult에 저장되는 값은 11.5)
		// (참고로, long타입이 연산대상에 있으면 연산대상이 모두long타입으로 변환되고 연산결과도 long.
		// 실수 타입이 연산대상에 있으면 크키가 큰 실수타입으로 변환 후 연산하고, 결과도 해당 실수타입)
		
//		double result = sum/2.0; //혹은 연산대상인 정수 중 하나를 더블타입실수 형태로 입력해서
		//연산하면 다른 연산대상도 더블타입으로 바뀌어 연산되고, 연산결과도 더블타입이 됨.
		return result;
	}
	void execute(int a, int b) {
		double result = avg(a,b); 
		//클래스 내의 메소드를 호출. execute호출시 매개값을 avg메소드 호출시의 매개값으로 사용.
		// cal.execute(1,2); 메소드호출시 값 1,2가 execute-avg-plus의 매개값 
		println("result: "+result);  //클래스 내의 메소드를 호출
		//문자열과 avg결과를 매개값으로하여 println메소드를 실행
	}
	void println(String str) { 
		//println("result: "+result) 
		//-> result의 값은 double타입이지만 함께 문자열로 인식하게 됨.
		System.out.println(str); 
	}
	
	
	
}
