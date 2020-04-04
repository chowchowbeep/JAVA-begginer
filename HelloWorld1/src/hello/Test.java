package hello;

public class Test {
	public static void main(String[] args) {
		//
		int sum = 0;
		int a = 1, b = 10;
		for (int i = b; i >= a; i--) {
			if (i % 2 != 0) {
				sum = sum + i;
			}	
		}
		System.out.println(sum);
	}
}
