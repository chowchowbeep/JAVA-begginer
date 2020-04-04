package atHome.exercise;

public class Four3 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) { //3의 배수의 조건은 해당 수가 3으로 나누어서 나머지가 0인지로 결정
				sum = sum + i;
			}
		}
		System.out.println("1~100에서 3의 배수의 합은 " + sum);
	}
}
