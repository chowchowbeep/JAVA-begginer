package api.string;

public class StringToLowerUpperCaseExample {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA PROGRAMMING";
		
	
		System.out.println(str1.equals(str2));
		//equals()메소드는 대소문자구분하여 문자열을 비교하기 때문에 false
		
		
		String lowerStr1 = str1.toLowerCase();
		//str1을 소문자로 바꾼 새로운 문자열생성하여 리턴
		//(str1,2의 문자열은 변경되지 않음_Sring객체의 문자열은 변경불가)
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		//모두 소문자로 변경하여 equals()메소드 사용시 true리턴
		
		
		
		System.out.println(str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase()는 대소문자 구분없이 문자열을 비교
		
	}
}
