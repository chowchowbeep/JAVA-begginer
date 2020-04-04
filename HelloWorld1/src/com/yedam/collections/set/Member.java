package com.yedam.collections.set;

public class Member {
	String name;
	int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	// 논리적으로 동일한 객체 판별위한 메소드 hashCode()와 equals()
	// 해시코드 검사 후 값이 동일할 경우 -> 이퀄스 검사 를 통해 동일객체 판단
	//중복된 값을 걸러낼 수 있음
	
	
	
	// 필드값만같으면 같은객체로 간주하도록 hashCode와 equals메소드를오버라이딩 
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return mem.age == this.age;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() { 
//		return super.hashCode();
		return age;
		//인스턴스가 가진 고유의 값hashCode를 age필드값으로 변경
		//->age가 동일하면 같은인스턴스로 간주하도록
	}
	//
}
