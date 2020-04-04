package api.object;

public class SmartPhone {
	private String company;
	private String os;

	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

//	toString 호출시 company와 os필드값 리턴하도록 재정의
	@Override
	public String toString() {
		return company + ", " + os;
	} 
}
