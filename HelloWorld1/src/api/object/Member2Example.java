//얕은 복제
package api.object;

public class Member2Example {
	public static void main(String[] args) {
		Member2 original = new Member2("blue", "홍길동", "12345", 25, true);

		Member2 cloned = original.getMember();
		//getMember()는 clone()으로 자신을 얕은 복제한 객체를 리턴함
		cloned.password = "67890";//복제객체의 패스워드만 변경됨
		//얕은복제의 경우 참조타입의 필드를 변경하면 원본객체도 변경된 객체를 참조하게 됨.
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name: "+cloned.name);
		System.out.println("password: "+cloned.password);
		System.out.println("age: "+ cloned.age);
		System.out.println("adult: "+cloned.adult);
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: "+original.id);
		System.out.println("name: "+original.name);
		System.out.println("password: "+original.password);
		System.out.println("age: "+ original.age);
		System.out.println("adult: "+original.adult);
		

	}
}
