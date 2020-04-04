package api.string;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) { //번지비교
			System.out.println("같은 String객체를 참조");
		} else {
			System.out.println("다른 String객체를 참조");
		}
		
		if(strVar1.equals(strVar2)) { //문자열비교 
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
	}
}
