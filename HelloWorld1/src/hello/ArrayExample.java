package hello;

public class ArrayExample {
	public static void main(String[] args) { // 배열 정리

		// 배열_하나의 변수에 같은 데이터타입의 여러 값 저장
		// 변수에 값을 모두 담을 수 없기 때문에 각각의 값을 힙 영역에 저장하고 인덱스를 이용하여 주소를 찾아 데이터를 사용함

		int a = 10, b = 20, c = 30; // 변수를 각각 선언한 경우
		int sum = 10;

//		## 배열 선언과 동시에 값 저장
		int[] intAry = { 10, 20, 30, 40, 50 }; // 공간크기 입력x
		// 정수타입이 저장될 수 있는(문자타입저장불가) 변수(배열) intAry
		String[] strAry = { "Nice", "Good", "Hello" }; // 문자열을 저장할 수 있는 배열
		System.out.println(intAry[0]); // intAry의 0번째 값 10
		System.out.println(strAry[0]);

		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		System.out.println("strAry의 크기" + strAry.length);
		// strAry.length는 배열strAry의 공간크기(저장가능한 데이터 갯수)
		
//		## 값 저장 후 변경
		strAry[0] = "NNice";
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(intAry[i]);
		}

//		## 배열먼저 선언하고(공간할당도 하고) 값 저장하는 방법 1(배열값을 인덱스별로 따로 저장)
//		int[] aAry = new int[5] //공간할당하고 값 저장 전일 경우, int라면 배열의 값들은 0으로 초기화됨
//		aAry[0] =10;
//		aAry[1] =20;
//		aAry[2] =30;
//		aAry[3] =40;
//		aAry[4] =50;

//		## 배열먼저 선언하고(공간할당도 하고) 값 저장하는 방법 2(배열값을 인덱스별로 따로 저장_for문이용)
//		int[] aAry = new int[5];
//		int val = 10;
//		for(int i=0; i<5; i++) {
//			aAry[i] = val;
//			System.out.println(i+"번째 aAry의 값은 "+ aAry[i]);
//			val = val+10;
//		}

//  	## 배열먼저 선언하고(공간할당 하든 하지 않든 상관없음) 값 저장하는 방법 3 (배열값 한꺼번에 입력)
//		int[] aaaa = new int[3]; //혹은 int[] aAry = null;로도 배열 선언 가능
//		aaaa = new int[] {10,20,30}; 
		// new연산자를 통해 10,20,30배열 객체가 새롭게 생성되고, 이 배열의 주소를 aaaa가 참조하게 됨???
		// -> 기존에 참조하던 배열의 값은 더이상 참조할 수 없게 됨.(새로운 배열을 생성하면서 값을 저장하지 않고 
		// 배열크기만 지정한다면 배열 내의 값들은 모두 0으로 초기화됨.)

//  	## 이미 선언한 배열의 배열크기를 변경 할 경우
//		int[] aaaa = new int[3]; //혹은 int[] aAry = null;로도 배열 선언 가능
//		aaaa = new int[5]; // but aaaa변수에 새로 생성된 배열의 주소가 저장되어 
				// aaaa가 기존에 참조하던 값들은 더 이상 참조할 수 없게 됨.(배열이 비어있을 경우에 사용할 것.)

		int[] aAry = new int[3]; // 혹은 int[] aAry = null;도 가능
		aAry = new int[5];

		for (int i = 0; i < aAry.length; i++) {
			// aAry.length를 이용하면, 수정시 배열 크기를 개별적으로 변경하지 않아도 됨.
			aAry[i] = i * 10 + 10;
		}
		for (int i = 0; i < aAry.length; i++) {
			System.out.println(aAry[i]);
		}
		for (int i = 0; i < aAry.length; i++) {
			sum += aAry[i];
			System.out.println("aAry 배열의 합: " + sum);
		}

	}
}
