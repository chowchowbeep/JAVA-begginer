//finalize() 메소드

package api.object;

public class FinalizeExample {
	public static void main(String[] args) {
		
		//쓰레기값을 반복적으로 생성
		Counter counter = null;
		for (int i = 1; i < 50; i++) {
			counter = new Counter(i);
			counter = null;

			System.gc(); //쓰레기 수집기 실행요청
			//(참조하지 않는 배열,객체를 메모리의 상태를 보고 일부만 무작위로 소멸)
			//finalize()메소드의 실행을 확인할 수 있음. 
		}
	}
}
