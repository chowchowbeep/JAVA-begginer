package api.string; 

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException  {
			byte[] bytes = new byte[100];
			
			System.out.println("입력");
			int readByteNo = System.in.read(bytes);
			//bytes배열에 키보드입력값저장하고 입력값의 바이트수(문자바이트수에 +2(엔터 \r,\n))리턴
			
			
			String str = new String(bytes, 0, readByteNo-2);
			//readByteNo-2 ->  \r, \n의 수를 감산
			System.out.println(str);
	}
}
