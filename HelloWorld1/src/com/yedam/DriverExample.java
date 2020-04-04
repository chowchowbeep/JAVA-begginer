package com.yedam;
// (다형성) 매개변수가 어떤인스턴스를 참조하고 있는지에따라서 결과값이 달라짐
class Driver{
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Vehicle vehicle = new Vehicle();
//		driver.drive(new Vehicle());//차가 달립니다.
		
		
		
		// 버스와 택시가 Vehicle의 자식클래스이기 때문에 자동형변환되어 인스턴스주소 저장이 가능
		vehicle = new Bus();
//		driver.drive(vehicle);//버스가 달립니다.
		vehicle = new Taxi();
		driver.drive(vehicle); // 택시가 달립니다.
		// 매개값에는 Vehicle타입이 와야 하지만, 
		//똑같은 매개변수가 들어가는데, 저장된 인스턴스(주소)가 다르기때문에 결과가 다르게 나옴.
		// vehicle이 어떤인스턴스를 참조하고 있는지에따라서 결과값이 달라짐(다형성)
		// 처음에는 Vehicle인스턴스 ->Bus인스턴스->Taxi인스턴스 참조
		
		
	}
}
