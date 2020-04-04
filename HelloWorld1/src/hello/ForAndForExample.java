package hello;

public class ForAndForExample {
	public static void main(String[] args) {
//		//중첩된 for문 실행순서 익혀두기
//		for (int i = 2; i < 10; i++) {
//			System.out.println("<<"+i + "단>>");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i+ "*" +j+ "="+(i*j));
//			}
//		}

		//중첩된 while로 표현하면
		int i = 2;
		while (i < 10) {
			System.out.println("<<" + i + "단>>");
			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
		}
		
		
	}
}
