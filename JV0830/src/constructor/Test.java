package constructor;

public class Test {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account a = new Account();
		
		a.accountNo = "111-1111-111";
		a.ownerName = "냥";
		a.balance = 10000;
		
//		System.out.println("계좌번호: "+a.accountNo);
//		System.out.println("예금주명: "+a.ownerName);
//		System.out.println("현재잔고: "+a.balance);
		
		a.showAccountinfo();

	}

}


/*
* Account 클래스
* - AccountNo, ownerName, balance
* - showAccountInfo() 메서드 
* - 인스턴스 생성 시
*   "Account() 생성자 호출됨!" 출력
*   accountNo에 "111-1111-111", ownerName에 "홍길동", balance에 10000
*   초기값으로 설정
*/


class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		System.out.println("Account() 생성자 호출됨!");
		accountNo = "111-1111-111";
		ownerName = "냥";
		balance = 10000;
	}
	
	// 메서드 정의
	// 계좌 정보를 출력하는 showAccountinfo() 메서드 정의
	public void showAccountinfo() {
		System.out.println("계좌번호: "+accountNo);
		System.out.println("예금주명: "+ownerName);
		System.out.println("현재잔고: "+balance);
		
		
		
	}
}