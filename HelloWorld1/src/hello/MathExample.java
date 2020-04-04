package hello;

public class MathExample {
	public static void main(String[] args) {
		int a = 75 ;
		a = (int) (Math.random()*100); // 임의의 난수 생성
		a = a / 10;
		switch (a) { //switch구문으로 if구문 대체가능_but case는 범위가 아닌 수가 일치하는 조건을 지정
		case 9:
			System.out.println(a  + "A등급");
			break; // 실행 후 switch구문에서 빠져나오게 할 경우.
		case 8:
			System.out.println(a  + "B등급");
		case 7:
			System.out.println(a  + "C등급");
		case 6:
			System.out.println(a  + "D등급");
		default:
			System.out.println(a  + "F등급");
		}
//		//System.out.println(a);
//		if(a >= 90) {
//			System.out.println(a + " A등급");
//		} else if(a >= 80) {
//			System.out.println(a + " B등급");
//		} else if(a >= 70) {
//			System.out.println(a + " C등급");
//		} else if(a >= 60) {
//			System.out.println(a + " D등급");
//		} else {
//			System.out.println(a + " F등급");
//		}
	}
}
