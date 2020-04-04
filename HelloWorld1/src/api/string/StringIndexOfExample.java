package api.string;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		//subject에서 해당문자열이 시작하는 인덱스반환(해당문자열 없으면 -1반환)
		System.out.println(location); 
		
		//특정문자열이 포함되어 있는지 여부에 따라 실행코드를 달리할 때 사용
		if(subject.indexOf("자바") != -1 ) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
				
	}
}
