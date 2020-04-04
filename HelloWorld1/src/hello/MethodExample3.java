package hello;

public class MethodExample3 {
	public static void main(String[] args) {
		// #메소드와 배열 //#메소드와 행렬
//
//		int[] intAry = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		sum = sumArray(intAry);
//		System.out.println("합은" + sum);
//
//		int[] intAry2 = { 1, 2, 3, 4, 5, 6 };
//		sum = sumArray(intAry2);
//		System.out.println("합은" + sum);
//
//		int[] intAry3 = { 1, 2, 3 };
//		sum = sumArray(intAry3);
//		System.out.println("합은" + sum);

//		printStar(5, 7, "*");
//		printNum(5, 7);
		pirntStar2(6);
//		pirntStarASC(5);
//		pirntStarDSEC(5);
//		int[] ary = showArray(1,2,3,4,5);
//		for (int i=0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
		
//		// # enhanced for 향상된 확장된 for
		//우항의 배열 값을 좌항 변수에 차례로 담으면서 명령문실행
//		//(배열 ary의 데이터 갯수만큼 for문을 실행)/ 배열 ary와 변수a의 데이터형이 일치해야 함.
//		for (int a : ary) {
//			System.out.println(a);
//		}
		
	}

	//# 매개변수의 배열값을 차례로 가져와서 새로운 배열에 담아 리턴
	public static int[] showArray(int... arg) { 
		// int... arg ->이름이 arg인 정수형 변수가 하나 이상(다수의 정수형 매개변수)
		//(arg는 일종의 배열이 됨?)
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;
	}

	public static int[] showArray(int a, int b, int c, int d, int e) {
		int[] ary = { a, b, c, d, e };
		return ary;
	}

	public static void printStar(int a, int b, String str) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
	
	// void는 리턴값 x. 메소드 호출시 명령문내용 그대로를 실행함.
	public static void printNum(int a, int b) { 
		int[][] ary = new int[a][b];
		int num = 1;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				ary[i][j] = num++;
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
	}

	public static void pirntStar2(int a) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pirntStarASC(int a) {
		for (int i = 0; i <= a; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pirntStarDSEC(int a) {
		for (int i = a; i >= 1; i--) { //한바퀴 돌고 난 후 i값을 줄어들게 할 것. 아래 for문이 마지막회자에서 한 번만 순환하도록, 마지막 i값을 설정
			for (int j = 1; j <= i; j++) { //반복횟수=한 줄에 표시되는 별 수. =>한 번 반복 후에는 i값이 줄어들어야 함.
				System.out.print("*");
			}
			System.out.println();
		}
	}

	//배열을 매개변수로 하여 배열내의 값들을 합산하여 결과를 리턴하기
	public static int sumArray(int[] ary) { // 매개변수 이름은 임의지정가능
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {// 배열 intAry1,2,3에 저장된 각각의 값들이 호출될 때마다 배열값을 ary변수_method sumArray내에서의 변수_로
												// 받아 누적합산하고
			sum = sum + ary[i];
		}
		return sum; // sumArray에서의 결과값인 sum이 메인메소드로 리턴되어 메인메소드 내 sum변수에 저장되게 됨.
	}
}
