package atHome.exercise; //6장 확인 문제 15

public class MemberService {
	boolean login(String id, String password) {
		if(id == "hong" && password =="12345") {
//		if(id.equals("hong") && password.equals("12345")) { 
		// 문자열 비교를 더 정확하게 하려면 equals메소드를 사용해야 함
		// 논리연산자==은  변수에 저장된 주소가 가리키는 객체의 문자열이 서로 일치한다고 해도,
		// new연산자로 String객체를 생성했을 경우 변수에 저장된 주소가
		// 서로 다른 객체를 가리키게 되어 각각이 서로==일치하지 않는다는 결과를 도출함.
			return true;
		} else {
			return false;
		}
	}	
	
	void logout(String id) {
			System.out.println("로그아웃되었습니다");
	}
			
}

