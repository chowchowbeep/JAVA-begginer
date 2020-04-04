package com.yedam.exception;

class Account { 
	private long balance;

	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		//예외처리는 withdraw()메소드 호출한 곳에서 하도록 throws
		if(balance<money) { 
			//throw는 예외를 발생시킴 
			//new연산자로 예외클래스 생성자호출(사용자정의 예외클래스 생성이 우선돼야 함)
			throw new BalanceInsufficientException("잔고부족: "
						+ (money-balance)+"모자랍니다."); 
			//String타입의 메시지를 갖는 생성자-> 메시지는 자동적으로 예외객체 내부에 저장
			//->getMassage()호출 되었을 떄 해당 메시지를 리턴함
		}
		balance -= money;
	}
}

public class AccountExample { 
	public static void main(String[] args) {
		Account accnt = new Account();
		accnt.deposit(10000);
		try {
			accnt.withdraw(20000);//사용자정의 예외 발생가능 메소드
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
			//예외객체 BalanceInsufficientException e 이용
			//Exception이 가지고 있는 메소드들은 모든 예외 객체에서 호출가능
			//(BalanceInsufficientException이 Exception을 상속하므로
			//Exception의 메소드 getMessage(), printStackTrace()사용가능
			
			//
		}
		System.out.println("예금액: "+ accnt.getBalance());
	}
}
