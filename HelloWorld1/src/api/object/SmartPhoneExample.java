package api.object;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		//toString()이 재정의되어 company, field값 리턴됨.
		//재정의 전에는 클래스명@16진수 해시코드리턴
		
		System.out.println(myPhone);
		//System.out.println();의 경우 매개값이 객체로 주어지면
		//객체.toString()을 호출하여 리턴(위와 결과가 동일함)ㅠ
	}
}
