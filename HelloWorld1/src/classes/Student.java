package classes;

public class Student {
	//Student라는 class(객체를 위한 설계도)
	// 클래스 멤버: 필드,메소드 + 생성자 개념 추가
	
	
	//특성(필드)
	//클래스에서 선언되는 것은 필드_개별메소드뿐 아니라 클래스 전체에서 유효한 변수
	String name;
	String major;
	int studentNo;
	
	//생성자
	//반드시 StudentExample과 함께 보면서 이해할 것.
	//생성자의 이름은 클래스명과 동일
	//인스턴스 생성시 new연산자로 생성자 를 호출함
	
	Student() { //기본생성자(생략시 자동으로 생성) 
		// 다른 생성자를 하나라도 만들고 싶다면 기본생성자가 있어야 함.
		//(Car클래스에서는 다른 생성자가 없으므로 기본생성자 별도로 정의x)
		//Student st1 = new Student(); 매개값없이 인스턴스 생성
	}
	Student(String name) {
		this.name = name; 
	}

	// 상기생성자와 이름이 동일하나,뒤따르는 매개값의 갯수나 타입이 다른 경우 다른생성자로 인식
    //=> 생성자오버로딩 // 다른 메소드도 마찬가지.
	Student(String name, String major){//생성자의 매개변수 선언
		this.name = name;//객체의 초기화 코드 ->필드의 초기값 세팅
		this.major = major;
	} 
	// 매개값 입력하여 인스턴스 생성할 수 있게 함_StudentExample참조
	// 일반적으로 매개변수명과 필드명을 동일하게 지정
	// name = name; =>매개변수의 값을 매개변수에 저장하는 셈이 됨
	// this는 Student클래스를 통해 생성되는 객체 하나를 가리킴
	// this.name으로 객체자신의.필드 임을 명시함
	
	
	
	//기능(메소드)
	void study() {
		System.out.println("공부합니다.");
	}
	void goToSchool(){
		System.out.println("학교갑니다.");
	}
	
	
	
	
}
