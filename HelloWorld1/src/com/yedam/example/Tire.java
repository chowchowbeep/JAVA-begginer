package com.yedam.example;

public class Tire {
	int maxRotation; //사용가능한 최대 회전수.//타이어 수명
	int accumulatedRotation; //사용으로 인해 축적된 회전수
	String location;//타이어 위치
	
	public Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation; 
	}
	
	public boolean roll() { 
		accumulatedRotation++; //타이어회전수 누적
		if(maxRotation>accumulatedRotation) { // 타이어 수명이 남은 상태인지 체크
			System.out.println(location +"타이어수명: "
		+(maxRotation-accumulatedRotation)+ "회");
			return true;
		} else {
			System.out.println("***"+location+"타이어펑크***");
			return false;
		}
	}
}
