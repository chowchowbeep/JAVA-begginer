package api.wrapper;

public class StringToPrimitiveValueExample {
	public static void main(String[] args) {

		// 문자열을 기본타입값으로 변환
		// 포장클래스의 parse기본타입명() 정적메소드 사용
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");

		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);

	}
}
