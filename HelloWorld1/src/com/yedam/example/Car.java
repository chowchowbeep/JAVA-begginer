package com.yedam.example;

public class Car {
	// Car클래스의 필드(초기값으로 Tire인스턴스가 저장)선언
	Tire frontLeft = new Tire("앞왼쪽", 6);
	Tire frontRight = new Tire("앞오른쪽", 2);
	Tire backLeft = new Tire("뒤왼쪽", 3);
	Tire backRight = new Tire("뒤오른쪽", 4);

	int run() {
		System.out.println("[자동차가 달립니다]");

		if (frontLeft.roll() == false) {
			stop();
			return 1;// 왼쪽 앞 바퀴 문제 발생시 1값을 리턴
		} else if (frontRight.roll() == false) {
			stop();
			return 2;
		} else if (backLeft.roll() == false) {
			stop();
			return 3;
		} else if (backRight.roll() == false) {
			stop();
			return 4;
		}
		return 0;// (아무것도 펑크안남)

	}

	void stop() {
		System.out.println("[자동차가멈춥니다]");
	}

}
