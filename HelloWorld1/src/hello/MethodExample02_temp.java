package hello;

public class MethodExample02_temp {
	
	public static void main(String[] args) {
		//배열을 매개변수로 하는 경우의 메소드
		
		
		
		int[] intAry = { 2, 3, 4, 5, 6 };
		// 정수형 배열값을 매개값으로 하여
		int sum = 0;
		sum = sum2(intAry); 
		//intAry 배열의 값들을 매개값으로 하여 
		//sum2메소드의 연산결과를 int sum변수에 저장
		for (int i = 0; i < intAry.length; i++) { 
			sum += intAry[i]; 
			//sum2메소드의 리턴값이 sum의 초기값이 됨.
		} 

		System.out.println("합은 : " + sum);

	}

	public static int sum2(int[] ary) { 
		// 매개값은 정수형배열 변수명은 임의지정 가능. num2메소드 내에서 사용//
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum; //
		//main에서 sum2(intary)로 호출이 되면 배열을 매개변수로 받아 
		// sum2메소드를 연산하고 return값으로 연산결과인 변수 sum을 반환하고, 
		//이 반환값을 메인메소드의 sum = sum2(intAry); 
		//메인메소드의 sum 변수에 저장함.
		
	}

}
