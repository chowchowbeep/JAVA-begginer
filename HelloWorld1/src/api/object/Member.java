package api.object;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	
	// 서로다른 객체라도 같은클래스의 인스턴스이고 필드값이 동일하면  true리턴하도록 오버라이드
	@Override
	public boolean equals(Object obj) {
		//equals()의 매개값이  기준객체와 동일한 타입인지 먼저 확인
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;	
		//매개값을 멤버타입으로 강제형변환후 id필드값이 동일하면 true반환하도록 함			
			}
		}
		return false;//매개값이 Member타입아니거나 id필드값다른경우
	}
	
	// id가 동일한 문자열인 경우 같은 해시코드 리턴하도록 hashCode()오버라이드
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
	
}
