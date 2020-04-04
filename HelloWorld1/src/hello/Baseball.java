package hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int randomAry[] = new int[3];
		for (int i = 0; i < randomAry.length; i++) {
			int random = (int) (Math.random() * 10);
			randomAry[i] = random;
			System.out.print(randomAry[i]+ " ");
		}
		System.out.println();
		boolean run = true;
		while (run) {

			int typeAry[] = new int[3];
			for (int i = 0; i < typeAry.length; i++) {
				System.out.println((i + 1) + "번째 숫자 입력");
				int typeNo = sc.nextInt();
				typeAry[i] = typeNo;
			}

			int strike = 0;
			int ball = 0;
			int notexist=0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (typeAry[i] == randomAry[j]) {
						notexist=1;
						if (i == j) {
							strike = strike + 1;
							System.out.println(strike + "strike");
						} else {
							ball = ball + 1;
							System.out.println(ball + "ball");
						}
					}
				}
				
			}
			if(notexist ==0) {
				System.out.println("존재하지않습니다.");
			}
			
		}
	}
}
