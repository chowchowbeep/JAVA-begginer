package com.yedam.generic;

import java.util.Arrays;

public class CourseExample {
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		personCourse.add(new Person("일반인1"));
		personCourse.add(new Worker("직장인1"));
		personCourse.add(new Student("학생1"));
		personCourse.add(new HighStudent("고등학생1"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
//		workerCourse.add(new Person("일반인")); 
		//불가 Person이 Worker의 상위클래스. 상위클래스타입 인스턴스를 형변환하여 하위클래스 타입변수에 저장불가.
		workerCourse.add(new Worker("직장인2"));
	
	
		Course<Student> studentCourse = new Course<>("학생과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new Student("고등학생3"));
		
		Course<HighStudent> highCourse = new Course<>("고등학생과정", 5);
		highCourse.add(new HighStudent("고등학생4"));
		
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highCourse);
		
		registerStudent(studentCourse);
		registerStudent(highCourse);
		
		registerWorker(workerCourse);
		registerWorker(personCourse);
		
		registerCourse(personCourse); //어떤타입이든 가능
	
	
	} 
	public static Course<? super Worker> getCourse(){ //리턴타입이 Worker위로 가능
		Course<Person> Worker = new Course<>("일반인과정",5);//Person클래스타입 인스턴스생성
		Course<Worker> courseWorker = new Course<>("직장인과정",5);
		Course<Student> courseStudent = new Course<>("학생과정",5);
		Course<HighStudent> courseHighStudent = new Course<>("고등학생과정",5);
		return courseWorker;
//		return couseStudent; 리턴타입의 제네릭이 Worker에게 상속을 해주는 클래스로 제한되었기 때문에 리턴 불가
		
	}
	
	public static void registerWorker(Course<? super Worker> course) {
		System.out.println( "과정명: "+course.getName()+", 수강생: "
				+ Arrays.toString(course.getStudents()) );
	}
	
	public static void registerStudent(Course<? extends Student> course) {
		System.out.println( "과정명: "+course.getName()+", 수강생: "
				+ Arrays.toString(course.getStudents()) );
	}

	public static void registerCourse(Course<?> course) {//Course<?> 와일드카드. 코스클래스의 제네릭이 어떤 타입이든 가능
		System.out.println( "과정명: "+course.getName()+", 수강생: "
	+ Arrays.toString(course.getStudents()) );
	}
	
}
