package com.yedam.generic;

public class Course<T> {
	private String name;
	private T[] students; 
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];  // new T[capacity]로 입력x
		//제네릭 타입의 배열 선언시 오브젝트타입에서 제네릭타입으로 형변환하는 방식으로.
		//capacity가 배열크기가 됨.
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for(int i =0; i<students.length; i++) {
			if(students[i]==null) {
				students[i] = t;
				break;
			}
		}
	}
	
	
}
