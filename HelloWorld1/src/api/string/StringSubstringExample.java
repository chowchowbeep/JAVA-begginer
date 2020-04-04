package api.string;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		//ssn의 인덱스0부터 6이전(6제외!!)까지의 문자열을 생성(새로운 객체)하여 리턴.
		String firstNum = ssn.substring(0,6); 
		System.out.println(firstNum);
		
		//인덱스7부터끝까지
		String secondNum = ssn.substring(7); 
		System.out.println(secondNum);
	}
}
