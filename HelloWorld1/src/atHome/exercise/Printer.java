package atHome.exercise; 

public class Printer {
	
	//6장 확인문제 16
	
//	void println(int num){
//		System.out.println(num);
//	}
//	void println(boolean tr) {
//		System.out.println(tr);
//	}
//	void println(double dou) {
//		System.out.println(dou);
//	}
//	void println(String str) {
//		System.out.println(str);
//	}
	
	//6장 확인문제 17 // Printer객체를 생성하지 않고, 정적메소드로 사용가능하도록 변경
	static void println(int num) {
		System.out.println(num);
	}

	static void println(boolean tr) {
		System.out.println(tr);
	}

	static void println(double dou) {
		System.out.println(dou);
	}

	static void println(String str) {
		System.out.println(str);
	}
	
	
	
	
}
