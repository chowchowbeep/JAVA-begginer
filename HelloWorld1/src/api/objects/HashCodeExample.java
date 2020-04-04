package api.objects;

import java.util.Objects;

public class HashCodeExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");

		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		//->s1, s2는 동일한 해시코드를 가짐
	}

	static class Student {
		int sno;
		String name;

		Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		// sno,name이 같으면 동일한 해시코드를 리턴(동등한 객체로 식별)하도록 hashCode()재정의
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
			// hash()메소드는 매개값으로 주어진 값을 이용하여 해시코드생성하고 리턴
		}
	}
	
	
	
}
