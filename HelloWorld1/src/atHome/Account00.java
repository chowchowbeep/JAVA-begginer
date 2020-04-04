package atHome;

public class Account00 { //실험용 클래스
	private String ano;//계좌번호
	private String name;//예금주
	private int balance;//잔액
	
	Account00(){}
	Account00(String ano, String name, int balance){
		this.ano = ano;
		this.name = name;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
