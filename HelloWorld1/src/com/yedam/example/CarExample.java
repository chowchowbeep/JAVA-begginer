package com.yedam.example;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) { //10번루핑 =>  car.run() 열번호출
			int problemLocation = car.run();
			//car.run();은  타이어가 돈 수를 한번 축적시켰을 때
			// 펑크난 타이어객체가 뭔지에 따라 1/2/3/4/0(펑크안남) 리턴
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 Hankook 타이어로 교체");
				car.frontLeft = new HankookTire("앞왼쪽", 15);
				//car객체의 frontLeft필드는 Tire타입의 객체주소 저장이 가능하나,
				//HankookTire가 Tire의 자식 클래스이기 때문에 HankookTire객체주소를
				//car객체의 frontLeft에 저장가능
				//(자식인 한국타이어타입이 부모인 타이어타입으로자동형변환)
				//한국타이어객체로 교체 이후로는
				//car.run()를 통해 frontLeft.roll()호출시 frontLeft필드가
				//한국타이어이기 떄문에 한국타이어클래스의 roll()을 호출함.
				//(그 전까지는 car.frontLeft = new Tire("앞왼쪽", 6))였기때문에 
				//타이어 클래스의 roll()을 호출했었음
				
				break; //
			case 2:
				System.out.println("앞오른쪽 kumho타이어로 교체");
				car.frontRight = new KumhoTire("앞오른쪽", 17);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook 타이어로 교체");
				car.backLeft = new HankookTire("뒤왼쪽", 16);
				break;
			case 4:
				System.out.println("뒤오른쪽 kumho타이어로 교체");
				car.backRight = new KumhoTire("뒤오른쪽", 15);
				break;
			}
			System.out.println("----------------------------");
		}
	}
}
