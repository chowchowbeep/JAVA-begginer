package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//Map
//키와 값(각각은 모두 객체)으로 구성. 키와 값 쌍을 map.Entry객체로 저장
//키는 중복 불가. 값은 중복가능.


public class HashMapExample {
	public static void main(String[] args) {
		//Map인터페이스를 구현한 HashMap 
		Map<String, Integer> map = new HashMap<>();
		// String이 키의 데이터타입, Integer가 키
		// list set은 add 값 추가
		map.put("홍길동", 80); // 키,값 추가.
		map.put("이길동", 70); //70은 원래 int지만 자동박싱되어 Integer객체로 저장됨
		map.put("김길동", 60);
		map.put("홍길동", 90);// key가 홍길동으로 중복됨. 중복된 key에 해당하는
		//value값이 마지막에 저장된 값으로 대체됨.(key는 중복저장 불가하기 때문)
		// -> 홍길동, 80이 홍길동,90으로 대체됨. 
		
		//객체 꺼내보기_ 방법1_
		System.out.println("Entry갯수: " + map.size());
		System.out.println("방법1"); //key를 set에 담아서 iterator로 가져옴.
		Set<String> keyset = map.keySet(); //모든키를 Set객체에 담아서 리턴
		Iterator<String> iter = keyset.iterator();//반복자 생성
		while(iter.hasNext()) {
			String key = iter.next();//반복자로 키를 하나씩 얻어오기
			System.out.println("key : "+key + ", value: "
			+ map.get(key)); //맵에서 key에 해당하는 value를 리턴
		}
		
		// 객체 꺼내보기_ 방법2
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();//entrySet()메소드는 key,value의 쌍을 리턴
		Iterator<Map.Entry<String,Integer>> mapIter = entrySet.iterator();
		while(mapIter.hasNext()) {
			Map.Entry<String, Integer> ent = mapIter.next();
			System.out.println("Key: "+ent.getKey()+
					", value: "+ent.getValue());
		}
		for(Map.Entry<String, Integer> mapEnt : entrySet) { //set
			System.out.println(mapEnt.getKey()+", "+ mapEnt.getValue());
			
		}
//		for (Entry<String, Integer> ent : map) {
//			System.out.println();
//		}

	}
}
