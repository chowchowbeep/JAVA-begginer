package api.string;

public class StringReplaceExample {
	public static void main(String[] args) {
		
		//replace()메소드는 특정문자열을 선택하여 다른문자열로 대체한 새로운문자열을 리턴
		String oldStr = "자바는 객체지향언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
