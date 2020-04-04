// get, set 메소드
// (private, default 등으로 필드 접근이 제한된 경우 
// public등의 접근제한자가 붙은  get, set메소드를 이용하여 필드에 대한 접근을 부분적으로 허용 가능)
// (변수명.필드명으로 값을 사용하는 경우, 변수명.필드명=값 으로 값변경하는 경우,
// 매개값으로 생성자를 호출하여 필드값지정하는 경우(값변경은 불가)와의 차이점이 됨.)

package com.mycompany.kcr;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;	
	//private으로 다른 클래스에서 사용불가하게 숨겨진 필드
	//값 변경에 제한을 가할 때. (height필드의 경우 아래와 같이 public인 set함수를 이용하여
	// 변경 가능한 값의 범위를 지정하여 값변경을 부분적으로 허용가능)
	
	
//	우클릭 소스 게터&세터 클릭
//	모든 필드 선택하여 generate -> 자동으로  모든 필드에 대한 get set 메소드 생성
//	메소드 호출시 필드값을 가져오고 get, 변경할 수set있음. 
//	메소드명 자동생성규칙 있음.	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) 
			this.age = 0;
		else 
			this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height<0) 
			this.height = 0;
		//set가능한 값을 제한
		//(PersonExample확인_음수값이 매개값으로 입력되면 필드값에 0이 적용됨)
		else 
			this.height = height; 
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
