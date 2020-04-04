//인스턴스주소가 저장되는 필드가 많은 경우 유지보수 용이하도록 배열을 사용해 인스턴스주소를 저장하고 사용해보기
//example 바탕으로 

package com.yedam.example2; 

import com.yedam.example.Tire; //Tire객체생성할 수 있도록 클래스 임포트


public class Car {
	
	Tire[] tireAry = { 
			new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2),
			new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4) 
			};
	
	int run() {
		System.out.println("[자동차가 달립니다]");
		for(int i=0; i<tireAry.length; i++) {
			if(tireAry[i].roll() == false) {
				stop();
				return i+1;	
			} 
		} return 0;	
	}
	void stop() {
		System.out.println("[자동차가멈춥니다]");
	}
}
	


