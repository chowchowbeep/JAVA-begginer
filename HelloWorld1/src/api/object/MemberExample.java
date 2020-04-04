//equals()메소드 : 객체가 저장하는 데이터가 동일(객체의 동등유무와 무관한 논리적동등)
//				한지 비교하기 위해 사용됨.
//objcet클래스에서는 ==과 equals()가 동일한 결과
//(String클래스에서 equals()는 번지가 아닌 문자열을 비교하도록 오버라이딩되어있음)

package api.object;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
// 서로다른 객체라도 같은클래스의 인스턴스이고 필드값이 동일하면  true리턴하도록 equals() 오버라이드 선행됨.
		if(obj1.equals(obj2)) {
			//오버라이딩 전에는 false(서로다른 객체의 주소값을 데이터로 저장하고 있기때문 ). 
			System.out.println("obj1과 obj2는 동등합니다");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다");
		}
	}
}
