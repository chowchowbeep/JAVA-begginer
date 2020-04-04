package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.List;

//List collection_List인터페이스의  구현클래스인 ArrayList _배열과 유사함


public class ArrayListExample {
	public static void main(String[] args) {
		//List 인터페이스를 구현하는 ArrayList클래스의 객체 생성(자동형변환되어 저장)
		List<String> list = new ArrayList<String>();
		//List인터페이스는 제네릭 타입이므로 타입파라미터사용. ArrayList생성 위해서는 타입파라미터로
		// 저장될 객체의 타입을 표기하고 기본생성자를 호출함.
		//()안에 공간크기 입력 않을 경우 기본적으로 10개공간 주어짐 //new String[10];
		//(10개를 넘어서는 객체 저장시 새로운 10개의 공간이 추가됨.
		list.add("Hello"); //add메소드는 맨 끝 인덱스에 데이터값을 추가
		list.add("World"); 
		list.add("Nice");
		list.add("Java");
		list.add(2, "Insert"); //인덱스2에 데이터추가(2에있던 기존데이터는 한칸씩 뒤로 밀려남)_
		int size = list.size();//
		System.out.println("객체수는 "+size);
		for(int i =0; i< list.size(); i++) {
			System.out.println("index"+ i + " > " 
		+list.get(i));// get i인덱스에 저장된 값을 리턴
		}
		String returnVal = list.remove(2); //2번인덱스의 값제거/리턴 //인덱스대신 값입력 가능
		//2번뒤의 인덱스에 저장된 값들이 앞으로 한 칸씩 이동함
		System.out.println("제거되는 값은 "+returnVal);
//		for(String str : list) {
//			System.out.println(str);
//		}
		for(int i =0; i< list.size(); i++) {
			System.out.println("index"+ i + " > " +list.get(i));
		} //자동으로 데이터가 저장된 인덱스가 변경됨.
	}
}
