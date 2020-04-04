package atHome;

import java.util.Scanner;

public class Account00Example {
	//static이어야 하는 이유는?_ 안붙이면 메인메소드에서 사용할 때 에러.
	//static은 필드,메소드를 인스턴스 생성없이 사용 할 수 있게 하기 위해서 붙이는 것이라 했는데
	// new Scanner로 인스턴스를 생성하는 건 뭐임?
	//또, static필드와 메소드에는 클래스명.필드명 혹은 메소드명으로 접근할 수 있다고 했는데,
	// 아래서 사용할 때는 변수명.메소드명?의 형태로 메소드에 접근함. 어떻게  그럴 수?
	// =>인스턴스 생성없이 사용할 수 있게 하지만, 인스턴스를 생성하면 안된다는 것은 아니라는 것임?
	// 같은 클래스 내에 있으므로 인스턴스 생성시 주소저장된 변수가 private이라도 sc.nextLine으로 사용가능한것?
	//static이 class가 메모리로 적재될 떄 필드.메소드가 함께 로드되게 하는 속성을 가졌다면  해당 클래스 내에서
	// static이 붙은 필드와 메소드는 클래스 전체에서 사용가능하다고 이해하면 되나?
	//또 System.in은 뭔지?
	private static Scanner sc = new Scanner(System.in);
	private static Account00[] acAry = new Account00[10];
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>");
			int num = sc.nextInt();
			sc.nextLine();
			
			
			if(num == 1) {
				createAc();
			} else if(num ==2) {
				acList();
			} else if(num ==3) {
				deposit();
			} else if(num ==4) {
				withdraw();
			} else if(num ==5) {
				run = false;
			}
		}
	}
	
	// static없으면 현재 클래스인 TempExample의 인스턴스 생성하여  호출해야 함?
	// TempExample temp = new TempExample(); temp.createAc(); ->야스
	// createAc();는 TempExample.createAc();에서 TempExample이 생략된 것???
	// 왜 ? 같은 클래스 내에 있기 때문에???
	public static void createAc() {
		System.out.println("계좌번호?");
		String accNo = sc.nextLine();
		System.out.println("예금주?");
		String owner = sc.nextLine();
		System.out.println("초기입금액?");
		int balance = sc.nextInt();
		
		Account00 acnt = new Account00(accNo, owner, balance);
		
		for(int i=0; i<acAry.length; i++) {
			if(acAry[i] == null) {
				acAry[i] = acnt;
				return;
			}
		}
		
	}
	
	public static void acList() {
		for(int i=0; i<acAry.length; i++) {
			if(acAry[i] !=null) {
				System.out.println("계좌번호: "+acAry[i].getAno()+", 예금주: "+
						acAry[i].getName()+", 잔액: "+acAry[i].getBalance());
			}
		}
	}
	
	public static void deposit() {
		System.out.println("계좌번호를 입력하세요");
		Account00 selectedAcnt = findAccount(sc.nextLine());
		System.out.println("입금액을 입력하세요");
		selectedAcnt.setBalance(selectedAcnt.getBalance() + sc.nextInt());
		System.out.println("잔액은 "+selectedAcnt.getBalance()+"원 입니다.");
		
	}
	
	public static void withdraw() {
		System.out.println("계좌번호를 입력하세요");
		Account00 selectedAcnt = findAccount(sc.nextLine());
		System.out.println("출금액을 입력하세요");
		selectedAcnt.setBalance(selectedAcnt.getBalance() - sc.nextInt());
		System.out.println("잔액은 "+selectedAcnt.getBalance()+"원 입니다.");
		
	}
	
	public static Account00 findAccount(String ano) {
		Account00 acnt = null;
		for(int i=0; i<acAry.length; i++) {
			if(acAry[i] != null && acAry[i].getAno().equals(ano)) {
				acnt = acAry[i]; 
			}
		}
		return acnt;
		
	}
	
	
	
	
	
}
