package atHome.exercise; //6장 연습문제 19

public class Account {
	public static final int MIN_BALANCE = 0; //정적 final field(값이 )
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	
	//방법 1
//	public void setBalance(int balance) {
//		if(balance >= Account.MIN_BALANCE //상수는 항상 클래스를 통해 접근
//				&& balance <= Account.MAX_BALANCE) {
//			this.balance = balance;
//		} else {
//			this.balance = this.balance;
//		}
//	}
	//방법 2
	public void setBalance(int balance) {
	if(balance < Account.MIN_BALANCE //상수는 항상 클래스를 통해 접근
			|| balance > Account.MAX_BALANCE) { 
		return; //void메소드에서 return은 메소드를 즉시 강제종료시킴.
	} else {
		this.balance = balance;
	}
}
	
	



}
