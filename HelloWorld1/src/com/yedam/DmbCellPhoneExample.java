package com.yedam;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbCell = new DmbCellPhone("S10","white",10);
		//자식 생성자 내에 있는 부모생성자(super();)가 호출되어, 부모객체 먼저 생성후 자식객체생성됨
		//자식객체는 부모객체의 필드,메소드를 자신의 것처럼 사용가능
		System.out.println("model: "+dmbCell.model);//자신의필드인 것처럼 부모필드사용
		System.out.println("color: "+dmbCell.color);//자신의필드인 것처럼 부모필드사용
		System.out.println("channel: "+dmbCell.channel);//dmbCell자신의필드_자식필드
		dmbCell.powerOn();//자신의메소드인 것처럼 부모메소드사용
		dmbCell.turnOnDmb();//자신메소드
		dmbCell.turnOffDmb();//자신메소드
		dmbCell.powerOff();//자신의메소드인 것처럼 부모메소드사용
		
	}
}
