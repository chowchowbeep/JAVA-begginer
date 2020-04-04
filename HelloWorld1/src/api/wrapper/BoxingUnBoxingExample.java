//포장클래스: 기본타입의 값을 갖는 객체(외부에서변경불가)
package api.wrapper;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		//Boxing_기본타입값을 포장객체로 생성하기
		Integer obj1 = new Integer(100);//생성자사용_매개값이 기본타입값 
		Integer obj2 = new Integer("200");//생성자사용_매개값이 문자열
		Integer obj3 = Integer.valueOf("300");//정적valueOf()사용
		//기본타입의 포장클래스: int->Integer, char->Character를 제외한
		// 나머지는 첫문자를 대문자로 바꾼이름이 클래스명
		
		//Unboxing_포장객체에서 기본타입값 얻기
		int value1 = obj1.intValue();//기본타입명+Value()메소드
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
	}
}
