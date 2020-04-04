package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//LinkedList는 인접참조를 링크하여 체인처럼 관리함
// 특정위치 객체 제거,추가시 앞 뒤 링크만 변경됨 
//빈번한 객체삭제,삽입이 있을 경우 ArrayList
//(삽입,삭제시 뒤쪽 인덱스를 전부 이동해야 함)보다 높은 성능발휘

public class LinkedListExample {
	public static void main(String[] args) {
		//ArrayList와 LinkedList의 성능 비교
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		long startTime, endTime;
		
		System.out.println("ArrayList");
		startTime = System.nanoTime();
		for(int i =0; i<10000; i++) {
			//	list1.add(0,String.valueOf(i));
			//i를 스트링타입으로 바꿔서 인덱스0에 저장(값을 뒤로 밀리게 하면서 반복
			list1.add(String.valueOf(i)); 
			//valueOf()는 int타입을 String타입 값으로 리턴함
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간은 "+(endTime-startTime)+"ns");
		
		
		System.out.println("LinkedList"); 
		startTime = System.nanoTime();
		for(int i =0; i<10000; i++) {
//		list1.add(0,String.valueOf(i));//i를 스트링타입으로 바꿔서 인덱스0에 저장
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간은 "+(endTime-startTime)+"ns");
	}
}
