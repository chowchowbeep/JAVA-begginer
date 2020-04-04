package com.mycompany.kcr;

public class AccessExample {
	public static void main(String[] args) {
		Access1 acc1 = new Access1();
//		acc1.method3(); //method3()의 접근제한자 private으로 접근불가
		Access2 acc2 = new Access2();
	}
}
