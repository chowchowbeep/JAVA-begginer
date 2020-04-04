package hello;

public class WhileExample {
	public static void main(String[] args) {

// 		
//		int i = 1;
//		while (i <= 9) {
//			System.out.println(4+"*"+i+"="+(4*i));
//			i++;
//		}

		int i = 1;
		while (true) {// break없이는 무한 루프
			if (i++ <= 5)
				continue; // 해당 조건에 만족할 때 명령실행을 일시정지.
			// i가 6이 될 때 조건을 만족하지 않게 되어 다음의 명령을 실행하게 되는데,
			// 조건확인 후 i에 1이 더해지기(i++) 때문에 다음의 결과값은 4*7부터 시작됨.
			System.out.println(4 + "*" + i + "=" + (4 * i));
			if (i == 9)
				break;
//			i++;
		}

		// do-while구문과 while구문 차이_ 조건 체크하기 전 i값이용하여 실행 
		i = 1;
		do {
			System.out.println();
		} while (i < 10);
//			do-while구문에서는 조건 뒤에 ;세미콜론입력 필수

	}
}
