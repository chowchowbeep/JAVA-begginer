package classes;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setName("김초롱");
		m1.setId("kcr");
		m1.setPassword("kcr123");
		m1.setAge(29);

		Member m2 = new Member();
		m2.setName("관리자");
		m2.setId("admin");
		m2.setPassword("admin123");
		m2.setAge(0);

		Member m3 = new Member("사용자1", "user1", "user123", 10); 

		Member memberAry[] = { m1, m2, m3 };

//		for (int i = 0; i < memberAry.length; i++) {
//			System.out.println(memberAry[i].getName() + "," 
//					+ memberAry[i].getId() + "," 
//					+ memberAry[i].getPassword() + ","
//					+ memberAry[i].getAge());
//		}
		
		//memeberAry에 담은 인스턴스들의 필드값을 차례로 출력함
		for(Member m : memberAry) {
			System.out.println(m.getName()+", "
					+m.getId()+", "+m.getPassword()+", "+m.getAge());
		} 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 멤버의 이름를 입력하세요");
		String name = sc.nextLine();
		//문자열을 받을 때는 스캐너변수명.nextLine(); 엔터도 읽어오지만 엔터를 변수에 저장은 하지 않음
		//sc.nextInt()는 int타입 데이터를 읽어오고, 엔터는 읽어오지 않음
		
		
		//입력한 값과 필드값이 일치하는 인스턴스를 찾아 필드값을 출력함.
		for(Member m : memberAry) {
			if(m.getName().equals(name)) {
		// 필드값(배열에서 꺼낸 인스턴스의 필드값).equals(비교할 값_위에서 입력받은 값) 
				// -> 문자열이 서로 같은지 여부판단 (==는 객체의 주소를 비교함)
				System.out.println(m.getName()+", "
						+m.getId()+", "+m.getPassword()+", "+m.getAge());
			}
		}
	
		
		
		
	
		
		
		
		

	}

}
