//객체 해시코드
package api.object;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()"); 
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	//hashCode()오버라이딩
	@Override
	public int hashCode() {
		System.out.println("hashCode()"); //해시코드 메소드 호출이 되는 순서확인위해
		return number;
	}

}
