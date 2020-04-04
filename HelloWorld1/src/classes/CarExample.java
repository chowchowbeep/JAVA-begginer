package classes;

public class CarExample {
	public static void main(String[] args) { // # 메인메소드가 있는  클래스
		
		// # 인스턴스(개별 객체 실체)생성과 사용
		
		// class Car 참조하면서 확인
		// 객체는 필드(속성)들을 가진 일종의 배열
		// 각각의 인스턴스가 배열들의 값?
		// (new연산자로 인해 인해 객체는 힙영역에,
		// car1,car2 변수에는 Car 클래스에 속하는 객체들의 물리적 주소값이 저장._배열설명참조)
		// (new연산자로 클래스의 생성자를 호출_ Car클래스에서 생성자 생략시 기본생성자가 자동 생성)
		Car car1 = new Car(); 
		// 컨트롤키 + Car()위로 hover하면 원래 클래스의 구현부, 실행부 확인가능
		// 인스턴스 (객체 실체)가 만들어진 상태에서
		// 해당되는 클래스의 필드(값 대입과 사용(출력)), 메소드를 이용가능
		//설계도(클래스)의 필드 정의에 따라 개별객체(인스턴스)의 필드값을 입력
		car1.model = "그랜저"; // 각 필드에 값 대입
		car1.color = "red"; //객체외부에서 필드접근시 변수.필드명
		car1.price = 1000;
		car1.maxSpeed = 200;
		
		
//		System.out.println(car1.model);
//		System.out.println(car1.color);
//		System.out.println(car1.price);
//		System.out.println(car1.maxSpeed);
//		car1.drive(); 
		//car1 객체의.drive메소드 실행
		
		// # 클래스 타입의 배열
		// Car는 하나의 클래스인 동시에 속성과 기능을 담는 데이터 타입.
		Car car2 = new Car(); 
		int[] intAry = new int[5];
		Car[] carAry = new Car[2]; 
		// Car클래스타입의 배열 carAry생성
		//-> Car클래스의 인스턴스만 값으로 담을 수 있음
		String[] strAry = null;
		
		car2.model = "소나타";
		car2.color = "Black";
		car2.price = 1500;
		car2.maxSpeed = 250;
		car2.drive();
		
		//Car클래스타입의 배열 carAry에 인스턴스 변수(인스턴스의 주소값을 가짐)를 저장
		//인스턴스 여러개를 묶어서 사용
		carAry[0] = car1; 
		carAry[1] = car2;
		
		//서로다른 인스턴스의 필드값을 배열과 for문을 이용하여 출력
		for(Car c : carAry) { //우항의 배열 값을 좌항 변수에 차례로 담으면서 명령문실행
			System.out.println(c.model+","+c.color);
		} 
		//결과출력 -> car1.model의 값, car1.color의 값
		//      -> car2.model의 값, car2.color의 값 
		
		
		
		//car,car2 변수에는 객체의 물리적 주소값이 저장되어 있음
		System.out.println(car1);//classes.Car@15db9742
		System.out.println(car2);//classes.Car@6d06d69c
		
		

	}
	
	
	
	
}
