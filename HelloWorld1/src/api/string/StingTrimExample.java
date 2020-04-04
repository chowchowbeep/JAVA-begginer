package api.string;

public class StingTrimExample {
	public static void main(String[] args) {
		
		String tel1 = "  02";
		String tel2 = "123    ";
		String tel3 = "   1234    ";

		//trim()메소드는 앞뒤공백을 제거한 새로운 문자열 생성
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
