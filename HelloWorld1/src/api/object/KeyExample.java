//객체 해시코드
//hashCode()메소드 : 객체 메모리번지를 이용하여 해시코드를 리턴(객체를 식별하는 정수값)
//HashSet, HashMap, HashTable은
//hashCode()리턴값 동일한지 검사한 후 equals()리턴값 검사하여 동일객체인지 비교
//(equals()만으로 비교했을때와 달리 객체자체의 동일성여부도 고려함.)
package api.object;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		
		//HashMap컬렉션-어떤키로 객체를 저장
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		hashMap.put(new Key(1),"홍길동");//키객체 생성하여 
		
		String value = hashMap.get(new Key(1));
		System.out.println(value); 
		//hashCode()오버라이딩 전에는 다른 객체로 인식하여 결과값 null
		// 오버라이딩 후에는  put의new Key(1)과 get의 new Key(1)를 동등객체로 인식하게 됨
		//(해시코드의 리턴값을 number필드로 변경하였고, 둘은 number의 값이 동일하며,
		// equals의 결과도 true이기떄문에)
		
	}
}
