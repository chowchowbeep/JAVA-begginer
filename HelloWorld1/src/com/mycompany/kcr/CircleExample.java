package com.mycompany.kcr;

public class CircleExample {
	public static void main(String[] args) { 
		Circle c1 = new Circle();
		
//		c1.radius = -10; //radius가 private필드여서 접근불가
		c1.setRadius(-10); 
		//setRadius메소드에서 값 범위 제한하여 -10이 아닌 0이 필드값이 됨

		
		System.out.println("반지름 : "+c1.getRadius()+"의 넓이는"+c1.getArea());
		
		



		
		
		
	} 
}
