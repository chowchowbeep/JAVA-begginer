//finalize() 메소드

package api.object;

class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	//finalize()메소드 재정의
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}
