//패키지 익스플로러에서 패키지명 우클릭 하여 패키지 내의 하위패키지 생성가능(도트.로 하위패키지 식별)

//접근제한자 정리 public, default, private // + protected(상속관련) 


//  public 모든 패키지 내 / default 동일 패키지 내
//  /protected 동일패키지 내  but자식클래스는 다른 패키지라도 접근가능
//		(new이용한 부모의 생성자 호출은불가, super()이용)
//	/private동일 클래스 내  로만 접근 가능
// 적용대상: 클래스(but 클래스는 public, default만 가능), 필드, 생성자, 메소드

package com.mycompany.kcr;
class Access2{  //디폴트 : 패키지 com.mycompany.kcr 내에서만 접근 가능 
//	(com.mycompany.other패키지의 AccessExample클래스에서 Access2클래스에 따른
//	인스턴스 생성불가  Access2 acc2 = new Access2();는 오류)	
	public Access2(){
		System.out.println("Access2");
	}
		
}
public class Access1 { //퍼블릭 : 다른 패키지에서도 클래스에 접근할 수 있게 함
//	(com.mycompany.other패키지의 AccessExample클래스에서 Access1클래스에 따른
//	인스턴스 생성가능 Access1 acc1 = new Access1();)
	public int field1;
	int field2;
	private int field3; //private 동일 클래스내에서만 접근가능
	
	
	public void method1() { 
		field3 =10;
		System.out.println("method1");
	}
	void method2() {
		System.out.println(field3);//참조 private int field3;
		System.out.println("method2");
	}
	private void method3() { 
	//private : 동일 클래스내에서만 접근가능. 같은 패키지내에서도 다른 클래스면 접근 불가. 
	// 동일 클래스 내에서 사용되지 않았기 때문에  never used locally메세지 표시됨
		System.out.println("method3");
	}
	
	public Access1(){
		System.out.println("Access1");
	}
}

