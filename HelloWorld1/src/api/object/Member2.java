//얕은 복제: 
//단순히 필드값만(참조타입의 경우 번지만) 복제(원본객체와 복제객체는 같은 주소의 객체를 참조함)
//clone()메소드 이용 : 동일한 필드값을 가진 얕은복제된 객체를 리턴함
package api.object;

public class Member2 implements Cloneable { 
// clone()메소드 사용을 위해서는 원본객체에서 Cloneable인터페이스를 구현하여 복제허용해야함
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member2(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	// clone()으로 자신을 얕은 복제한 객체를 리턴함
	public Member2 getMember() {
		Member2 cloned = null;
		try { 
			cloned = (Member2) clone();
			//clone()메소드의 리턴타입은 Objcet이므로 Member타입으로 캐스팅
		} catch (CloneNotSupportedException e){}
		// Cloneable인터페이스를 구현하지 않으면 CloneNotSupportedException발생
		// clone()은 예외처리가 필요한 메소드이기 때문에 try catch구문 필요 
		return cloned;
	}

}
