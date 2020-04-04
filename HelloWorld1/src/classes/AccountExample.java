package classes;

import java.util.Scanner;

public class AccountExample {
//	클래스 내 모든 메소드에서 사용가능한 계좌의 배열 생성(메인메소드 내 선언시 메인메소드 내에서만 사용가능)
	
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
			System.out.println("--------------------------------");
			int menu = sc.nextInt(); //nextInt()는 엔터치기 전까지의 값을 받음
			//그러나 엔터도 다음 값으로 남아있음. 
			sc.nextLine(); // nextLine은 엔터값을 받음(다음 값을 받을 때 오류가 나지 않도록 )
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				getAccountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				run = false;
			}

		}
		System.out.println("프로그램 종료");

	} // end of main

	// 계좌 인스턴스 생성 메소드
	public static void createAccount() {
//		System.out.println("createAccount()");
		System.out.println("계좌번호 입력"); // 계좌정보 입력 받아서 저장.
		String accountNo = sc.nextLine();
		System.out.println("사용자명 입력");
		String accountName = sc.nextLine();
		System.out.println("첫 계좌금액"); 
		int accountBalance = sc.nextInt();
		Account accnt = new Account(accountNo, accountName, accountBalance); //계좌정보이용하여 계좌생성
		for (int i = 0; i < accountArray.length; i++) { //계좌를 계좌배열에 저장
			if (accountArray[i] == null) { // i번째 공간이 비었는지 확인하여
				accountArray[i] = accnt; // 인스턴스 변수를 저장하고
				break; // for문 종료(빈 배열을 확인하는 연산을 하지 않도록)
			}

		}

	}

	// 전체 계좌리스트 조회 메소드
	public static void getAccountList() {
//		System.out.println("getAccountList()");
		for (Account a : accountArray) { 
			// accountArray에 인스턴스 변수가 저장되어 있지 않으면 a = null이 될 것임.
			if (a != null) 	// 인스턴스변수가(계좌가) 저장되어 있을 경우에만 출력
							// 계좌번호가 널이 아닌 경우
				System.out.println("계좌번호: " + a.getAno() + " 소유자: " + 
				a.getOwner() + " 잔액: " + a.getBalance());
		}

	}

	// 계좌 입금 메소드
	public static void deposit() {
//		System.out.println("deposit()");
		System.out.println("계좌번호입력");
		String accntNo = sc.nextLine();
		System.out.println("입금액");
		int accntBalance = sc.nextInt();
		for(Account accnt : accountArray) {
			if(accnt != null && accnt.getAno().equals(accntNo)) {
				//계좌번호가 널이 아니고, 입력한 계좌와 저장되어 있는 계좌가 일치할 때.
		//(accountArray에 저장된 인스턴스를 accnt변수에 저장하고, 
	    // accnt변수에서 참조하는 Ano필드값을 입력받은 계좌번호인 accntNo변수와 비교) 
				accnt.setBalance(accntBalance);
		//Balance가 새로 입력한 값으로 대체되지 않고 새로 입력한 값이 추가되도록 setBalace메소드를 수정
			}
		}

	}

	 //  계좌 출금 메소드
	public static void withdraw() {
//		System.out.println("withdraw()");
		System.out.println("계좌번호입력");
		String accntNo = sc.nextLine();
		System.out.println("출금액");
		int accntBalance = sc.nextInt();
		for(Account accnt : accountArray) {
			if(accnt != null && accnt.getAno().equals(accntNo)) {
				accnt.setBalance(accntBalance*(-1));
				//새로입력하는 값을 음수로 만들어 +연산에서 -연산이 가능하도록.
			}
		}
	}
	


	
	// 특정계좌(입금하고 출금할)를 찾는 메소드
	public static Account findAccount(String ano) { 
		Account accnt = null;
		for(Account a : accountArray) {
			if(a != null && a.getAno().equals(ano)) {
				accnt = a;
				break;
			} else {
				System.out.println("유효하지 않은 계좌");
			}
		}
		return accnt; // accnt=findAccount("123-456");
	}

}
