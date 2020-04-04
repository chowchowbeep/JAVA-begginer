package classes;

//싱글톤: 하나의 어플리케이션 내에서 인스턴스가 하나만 생성되는 객체

public class Singleton { //싱글톤 만드는 방법
	//정적필드
	private static Singleton singleton = new Singleton();
	// 클래스 타입(싱글톤 타입)으로 정적필드 선언하고
	// (private static Singleton singleton_외부에서 필드값 변경하지 못하도록 private접근제한자 사용)
	// 자신의 객체를 생성해 초기화한다.-> 싱글톤객체가 가지는 단 하나의 인스턴스가 됨
	// (new Singleton()으로 인스턴스(객체)생성하여 필드에 저장?)
	
	// 생성자
	private Singleton() {} // -> 클래스 밖에서 new키워드로 호출 불가하도록 private접근제한자 사용)
	
	//정적 메소드
	static Singleton getInstance() { 
		return singleton;
		// 해당 메소드 호출시 싱글톤 Singleton타입의 singleton필드(싱글톤 인스턴스가 저장된)를 리턴함.
		// 호출시
		// 클래스명 변수명 = 클래스명.getInstance(); //Singleton클래스의 정적메소드getInstance()호출
		// Singleton s1 = Singleton.getInstance(); 
		// 싱글톤 인스턴스가 리턴되어 s1변수에 저장.
		// 여러개의 변수를 선언해도 그들은 모두 동일객체 //변수의 주소값이 동일함 
		// Singleton s2 = Singleton.getInstance(); 
		//if(s1 == s2)//여러개의 변수를 선언해도 그들은 모두 동일객체 //변수의 주소값이 동일함
		//	System.out.println("같은객체"); 같은객체
		//else
		//	System.out.println("다른객체");
	}
}
