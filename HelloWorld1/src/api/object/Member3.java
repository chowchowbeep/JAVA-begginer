//깊은 복제 :
//참조하고 있는 객체까지 복제(참조타입필드는 복사본과 다른 객체를 참조하게 됨)
//
package api.object;

import java.util.Arrays;

public class Member3 implements Cloneable{//clone()사용위해 해당 인터페이스 구현
	public String name;//기본타입필드
	public int age;
	public int[] scores; //참조타입필드
	public Car car;
	
	
	public Member3(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	// 깊은 복제시 Object클래스의 clone()메소드를 오버라이드하여
	// 참조객체를 복제하는 코드를 직접 작성해야 함
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//얕은복제로 기본타입필드를 먼저 복제
		Member3 cloned = (Member3) super.clone();
		//Object의 clone()호출?
		
		//scores를 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		//car를 깊은 복제
		cloned.car = new Car(this.car.model);
		
		// 깊은 복제된 Member객체를 리턴
		return cloned;
	}
	
	// 재정의된 clone()을 호출하여 자신을 깊은 복제한 객체를 리턴함
	public Member3 getMember(){
		Member3 cloned = null;
		try {
			cloned = (Member3) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	

}
