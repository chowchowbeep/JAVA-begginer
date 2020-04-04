package com.yedam.collections.tree;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	
	String  name;
	int age;
	public Person(String name, int age) {
		this.name= name;
		this.age = age;
	}

	//age를 기준으로 크기비교하도록
	@Override
	public int compareTo(Person o) {
		if(this.age > o.age) //매개값이 작으면 양수리턴
			return 1;
		else if(this.age == o.age)
			return 0;
		else 
			return -1;
	}
	
}

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		tSet.add(new Person("aaa",30));
		tSet.add(new Person("bbbb",25));
		tSet.add(new Person("cc",35));
		tSet.add(new Person("dddd",50));
		
		//저장한 값 리턴_iterator이용
		Iterator<Person> iter = tSet.iterator();
		while(iter.hasNext()) { //다음값있는지 검사
			Person p = iter.next(); //next 한 번만 소진되게 할 수 있음
			System.out.println(p.name+", "+p.age);
//			System.out.println(iter.next().name+", "+iter.next().age); 
			//두개의 인스턴스를 소진
		}		
	}
}
