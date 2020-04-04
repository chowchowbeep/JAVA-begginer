package classes;

public class SingletonExample {
	public static void main(String[] args) { //싱글톤 설명은 Singleton클래스 참고
//		Singleton s1 = new Singleton(); //private으로 접근불가
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance(); 
		if(s1 == s2)
			System.out.println("같은객체");
		else
			System.out.println("다른객체");
		
	}
}
