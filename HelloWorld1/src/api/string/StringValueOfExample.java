package api.string;

public class StringValueOfExample {
	public static void main(String[] args) {
		
		//valueOf()는 기본타입의 값을 문자열로 변환
		String str1 = String.valueOf(10); //int타입 10을 문자열로 
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		//->String클래스로 메소드 사용
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}
}
