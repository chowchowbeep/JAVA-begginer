package com.yedam.example;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		this.accumulatedRotation++;
		if(maxRotation>accumulatedRotation) { 
			System.out.println(location +"Kumho 타이어수명: "
		//구체적으로 어느타이어의 수명인지 출력할 수 있도록 오버라이딩 됨
		+(maxRotation-accumulatedRotation)+ "회");
			return true;
		} else {
			System.out.println("***"+location+"Kumho 타이어펑크***");
			//구체적으로 어느타이어의 펑크인지 출력할 수 있도록 오버라이딩 됨
			return false;
		}
	}
}
