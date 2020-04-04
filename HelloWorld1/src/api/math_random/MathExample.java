package api.math_random;

public class MathExample {
	public static void main(String[] args) {
		//Math클래스의 정적 메소드
		
		//절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1= " + v1);
		System.out.println("v2= " + v2);

		//올림값_더 큰 정수의 실수형태값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3= " + v3);
		System.out.println("v4= " + v4);
		
		//버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5= " + v5);
		System.out.println("v6= " + v6);
		
		//최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7= " + v7);
		System.out.println("v8= " + v8);
		
		//최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9= " + v9);
		System.out.println("v10= " + v10);
		
		//0.0<=랜덤값<1.0
		double v11 = Math.random();
		System.out.println("v11= " + v11);
		
		
		//가까운 정수의 실수형태값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12= " + v12);
		System.out.println("v13= " + v13);
		
		//반올림값
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14= " + v14);
		System.out.println("v15= " + v15);
		
		//원하는 소수자릿수에서 반올림하기 (round()는 소수점첫째자리에서 반올림하여 정수값 리턴)
		double value = 12.3456;
		double temp1 = value * 100;//1234.56으로 변환하여 5에서 반올림되도록
		long temp2 = Math.round(temp1);//1235
		double v16 = temp2 / 100.0;//곱했던 숫자(실수형태)로 나눠주기
		System.out.println("v16= " + v16);

	}

}
