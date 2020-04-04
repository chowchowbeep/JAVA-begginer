package com.mycompany;

import com.mycompany.kcr.Person;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("hong"); 
		
//		p1.age=-20;
		//->age필드가  private으로 접근을 제한되어 있어 값 변경 불가
		p1.setAge(-20);
		// 결과 0 (Person참조_set메소드에서 값입력 제한_의미없는 값 입력불가하도록.)
		// p1의 public인 setAge를 통해서는 접근 가능
		//(필드에 입력가능한 값의 조건이 지정되어 있음_입력값이 음수면 입력값이 아닌 0을 필드에 저장)
		
		p1.setHeight(180.8);
		p1.setWeight(77.7);
		System.out.println("이름은 "+p1.getName());
		System.out.println("나이는 "+p1.getAge());
		System.out.println("키는 "+p1.getHeight());
		System.out.println("체중은"+p1.getWeight());
		// p1.weight은 weight필드가 private(동일 클래스내 접근 허용)
		// 이므로 값을 불러오지 못하지만 getWeight로는 불러올 수 있음.

	}
}
