package hello;

public class Abc {
	public static void main(String[] args) {
//		char chr ='A';
//		int num = chr; //chr에 담긴 문자의 ascii값을 저장
//		System.out.println(chr + ","+num);
		
		
		char chr ='A';
		int num = chr;
		for(int i=0; i<26; i++) {
			System.out.println(chr++ +","+num++);
			//char chr를 증가시키면 ascii코드값이 증가된 문자가 출력
			
		}

	}
}

