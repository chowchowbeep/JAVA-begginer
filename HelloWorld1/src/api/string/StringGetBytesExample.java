package api.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		// 기본문자셋으로 인코딩된 바이트 배열 리턴
		byte[] bytes1 = str.getBytes();//바이트배열로 인코딩
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1); //디코딩(기본 문자셋의 바이트배열을 문자열로)
		System.out.println("bytes1->String: " + str1);
		
		// 특정문자셋으로 인코딩된 바이트 배열 리턴
		try {			
			byte[] bytes2 = str.getBytes("EUC-KR"); 
			System.out.println("bytes2.length: "+ bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");//디코딩(특정문자셋의 바이트배열을 문자열로)
			System.out.println("bytes2->String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: "+ bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: "+str3);
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace(); 
		//특정문자셋으로 인코딩시 잘못된 문자셋을 매개값으로 주어 발생하는 예외를 처리하기 위함
		}
	}
}
