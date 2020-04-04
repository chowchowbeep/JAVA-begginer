package classes;

public class StudentExample { // 
	public static void main(String[] args) { 
		
		// 매개값입력하지 않고 인스턴스 생성 
		
		Student st1 = new Student(); 
		st1.name = "hong"; //(인스턴스를 생성하여 필드값지정)
		st1.major = "history";
		st1.studentNo = 1111; 
		System.out.println(st1.name + ", " + st1.major + ", " + st1.studentNo);

		
		// 매개값 입력하여 인스턴스 생성(생성자의 매개값을 이용하여 필드값지정)
		
		//아래 new Student에서 Student에 컨트롤+호버_어떤 생성자를 통해 필드값지정하는지 확인가능
		Student st2 = new Student("kim", "math"); 
		// 두 매개값을 받을 수 있도록 데이터타입과 갯수가 일치하는 생성자를 호출
		st2.studentNo = 2222; // 각 필드에 값을 직접 대입
		System.out.println(st2.name + ", " + st1.major + ", " + st2.studentNo);


	}
}
