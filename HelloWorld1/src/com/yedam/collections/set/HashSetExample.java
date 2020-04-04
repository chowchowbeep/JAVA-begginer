package com.yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Set인터페이스는 인덱스로 객체를 검색해서 가져오는 메소드 없음.
//대신 Iterator인터페이스를 구현한 객체인 반복자(Iterator)를 사용하여 전체객체를 반복해서 가져옴.

public class HashSetExample {
	public static void main(String[] args) {
		//Set컬렉션의 구현객체인 HashSet()_동일객체(hashCode와 equals메소드를 통해 판단)
		//를 중복저장하지 않음. 순서없음. 하나의 null만 저장가능.
		Set<Member> memSet = new HashSet<>();
//		Member mem = new Member("1",1);
//		System.out.println("hashCode: "+mem.hashCode());
		
		
		memSet.add(new Member("홍길동",30));
		memSet.add(new Member("홍길남",30));
		System.out.println("memSet의 객체수 "+memSet.size());
		//Member클래스에서, 서로다른 인스턴스라도 필드값만같으면 같은객체로 간주하도록 
		//hashCode와 equals메소드를 오버라이딩하여 객체수가 하나인 것으로 출력됨
		for(Member m : memSet) {
			System.out.println(m.name + "/"+ m.age);
		}
		
		
		
		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World"); //set은 중복된 객체 저장 허용하지 않음
		System.out.println("객체수: "+set.size());
		Iterator<String> iter = set.iterator(); //반복자(Iterator)얻기
	//set에 저장된 값을 가져오기 위해 iterator()메소드를 호출. 타입파라미터에는 set에 저장된 데이터의 타입
		while(iter.hasNext()) {
			//hasNext()는  가져올 객체의 유무에 따라 true,false반환
			System.out.println(iter.next());
			//next()는 set컬렉션에서 하나의 객체를 가져옴
		}
		
		System.out.println("반복자소진 후");
		iter = set.iterator();//
		while(iter.hasNext()) { 
			System.out.println(iter.next());
		} 
		
		set.remove("Nice");//인덱스가 없기 때문에 오브젝트로만 삭제가능
		System.out.println("확장for");
		for(String str : set) {
			System.out.println(str);
		}
	}
}
