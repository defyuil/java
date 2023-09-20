package access_modifier;

public class Test {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account();
		// Setter() 메서드로 111-1111-111, 홍길동, 10000 입력
		acc.setOwnerName("홍길동");
		acc.setAccountNo("111-1111-111");
		acc.setBalance(10000);
		// Getter() 메서드를 활용하여 계좌번호, 예금주명, 현재 잔고를 출력
       System.out.println("계좌번호: "+acc.getAccountNo());
       System.out.println("예금주명: "+acc.getOwnerName());
       System.out.println("현재잔고: "+acc.getBalance()+"원");
	}

}



/*
* Account 클래스 정의
* - 멤버변수(private 접근제한자로 선언)
*   accountNo(문자열), ownerName(문자열), balnace(정수)
* - Getter/Setter 메서드 정의(단축키 사용 가능1)
*/

class Account{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}