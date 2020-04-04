package hello;

public class ArrayExample4 {
	public static void main(String[] args) {
		
		
		//배열 복사하는 방법1_for문이용
		String[] strAry = {"Hello","World","Good","Morning"}; 
		String[] copyAry = new String[strAry.length];
		for(int i=0; i<strAry.length; i++) {
			copyAry[i]=strAry[i];
		}
		//출력
//		for(int i=0; i<strAry.length; i++) {
//			System.out.println(copyAry[i]);
//		}
		

		//배열 복사하는 방법2_system클래스의 arraycopy라는 메소드 사용
		System.arraycopy(strAry, 0, copyAry, 0, strAry.length); 
		//원본배열,값복사시작하는위치,복사받는배열,값복사받는시작위치,복사데이터갯수
		
		//출력
//		for (String str :strAry) {
//		System.out.println(str);
//	}
		
		
		
		
		
		
		
	}
}
