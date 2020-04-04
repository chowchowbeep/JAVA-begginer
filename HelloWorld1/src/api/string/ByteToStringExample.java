package api.string;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		
		
		//매개값이 바이트 배열인 String 생성자
		String str1 =new String(bytes);
		System.out.println(str1);//Hello Java
		String str2 = new String(bytes, 6,4); 
		//bytes의  6번인덱스부터 4개의 문자열을 가져와 인스턴스생성
		System.out.println(str2);//Java
	} 
	
}
