package api.wrapper;

public class ValueCompareExample {
	public static void main(String[] args) {
		
		//포장객체의 비교
		
	//포장객체는 -128~127 초과값일 경우 ==와 !=연산자 사용불가(포장객체의 참조를 비교하기때문).
	//equals로 비교(포장객체일 경우 내부값비교하도록 오버라이딩됨)하거나, 
	//언박싱한 후 ==, !=사용할 것.	
		System.out.println("[-128~127 초과값일 경우]");

		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== 결과: " + (obj1 == obj2)); 
		System.out.println("언박싱후 == 결과: "+(obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: "+obj1.equals(obj2));
		
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
	// 포장객체라도 -128~127 범위값일 경우 ==와 !=연산자로 객체비교가능
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== 결과: " + (obj3 == obj4));
		System.out.println("언박싱후 == 결과: "+(obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: "+obj3.equals(obj4));
	}
}
