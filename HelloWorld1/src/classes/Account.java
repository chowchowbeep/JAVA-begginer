package classes;

public class Account {
	String ano; //계좌번호
	String owner; //예금주
	int balance; //잔액
	
	Account(){}
	Account(String ano, String owner, int balance){
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
//	public Account(String ano, String owner, int balance) {
//		super(); // 
//		this.ano = ano;
//		this.owner = owner;
//		this.balance = balance;
//	} // 우클릭 소스- 필드값을 선택하여 constructor 생성가능
	
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance += balance; 

		//입금메소드에서 accnt.setBalance(accntBalance);했을 때 입력받은 값으로 
		//잔액이 대체돼버리지 않도록.//대체됨<-this.balance = balance; 
	}
	
	
	
}
