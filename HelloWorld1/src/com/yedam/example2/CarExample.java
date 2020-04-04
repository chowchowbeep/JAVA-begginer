package com.yedam.example2;


import com.yedam.example.HankookTire; 
//다른 패키지에 있는 한국타이어 객체 생성할 수 있도록 클래스 임포트하고, 
//한국타이어의 생성자와 메소드(roll()이 run()에서 실행되기 때문에 한국타이어가 가진 roll메소드도 퍼블릭으로 만들어야) 
// public으로 만들어 패키지가 달라도 접근가능하도록 설정.금호타이어도 마찬가지.
import com.yedam.example.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 10; i++) { //10번루핑 =>  car.run() 열번호출
			int problemLocation = car.run();
	
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 Hankook 타이어로 교체");
				car.tireAry[0] = new HankookTire("앞왼쪽", 15);
				//기존에 인스턴스주소를 담던 필드가 배열로 바뀌었기 때문에 
				//새로운 인스턴스주소를 저장하는 곳이 배열[인덱스값]으로 변경됨.
				break; 
			case 2:
				System.out.println("앞오른쪽 kumho타이어로 교체");
				car.tireAry[1] = new KumhoTire("앞오른쪽", 17);
				break;
			case 3:
				System.out.println("뒤왼쪽 Hankook 타이어로 교체");
				car.tireAry[2]  = new HankookTire("뒤왼쪽", 16);
				break;
			case 4:
				System.out.println("뒤오른쪽 kumho타이어로 교체");
				car.tireAry[3]  = new KumhoTire("뒤오른쪽", 15);
				break;
			}
			System.out.println("----------------------------");
		}
	}
}
