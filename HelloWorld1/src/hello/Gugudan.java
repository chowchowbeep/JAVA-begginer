package hello;

public class Gugudan {
	public static void main(String[] args) {
//		int i;
//		int j;
//		for(i=1; i<10; i++) {
//			System.out.println(); //아무입력 없이 줄바꿈
//			for(j=2; j<10; j++) {
//				System.out.print(j+"*"+i+"="+j*i+" ");
//
//			}
//		}

		int w = 1;
		while (w < 10) {
			int h = 2;
			while (h < 10) {
				System.out.print(h + "*" + w + "=" + h * w + " ");
				h++;
			}
			w++;
			System.out.println();
		}

	}
}
