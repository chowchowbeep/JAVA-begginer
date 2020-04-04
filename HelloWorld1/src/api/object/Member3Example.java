
package api.object;

public class Member3Example {
	public static void main(String[] args) {
		// 원본객체생성
		Member3 original = new Member3
			("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		// 복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member3 cloned = original.getMember();// 객체를 깊은복제하도록 정의된 메소드
		cloned.scores[0] = 100; //복제객체의 참조객체 값 변경
		cloned.car.model = "그랜져";
		
		//복제객체와 원본객체의 필드값 비교_깊은복제의 경우 두 객체에 저장된 참조타입데이터는
		//서로다른 객체를 참조하기 때문에 복제객체의 참조객체값을 변경해도 원본객체는 변화없음
		System.out.println("[복제객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print
			((i == (cloned.scores.length - 1)) ? "" : ",");
			// i가 마지막 인덱스라면 빈칸, 아니라면 콤마,출력
		}	
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);
		
		System.out.println();
		
		System.out.println("[원본객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print
			((i == (original.scores.length - 1)) ? "" : ",");
			// i가 마지막 인덱스라면 빈칸, 아니라면 콤마,출력
		}	
		System.out.println("}");
		System.out.println("car: " + original.car.model);
		
	}
}
