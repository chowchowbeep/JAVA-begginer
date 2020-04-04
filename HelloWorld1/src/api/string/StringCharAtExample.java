package api.string;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		//ssn의 인덱스7의 문자(1)을 리턴
		switch(sex){
			case '1' : //남자입니다
			case '3' :
				System.out.println("남자입니다");
				 break;
			case '2' :
			case '4' :
				System.out.println("여자입니다");
				break;	
		}
	}

}
