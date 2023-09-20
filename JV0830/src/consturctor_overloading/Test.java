package consturctor_overloading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mydate a = new Mydate();
		System.out.println(a.year + "/" + a.month + "/" + a.day);
		
		System.out.println("------------------------");
		
		Mydate a2 = new Mydate(2023);
		System.out.println(a2.year + "/" + a2.month + "/" + a2.day);
		
       System.out.println("------------------------");
		
		Mydate a3 = new Mydate(2023, 8);
		System.out.println(a3.year + "/" + a3.month + "/" + a3.day);
		
        System.out.println("------------------------");
		
		Mydate a4 = new Mydate(2023, 8, 30);
		System.out.println(a4.year + "/" + a4.month + "/" + a4.day);

	}

}

/*
* 날짜를 관리하는 Mydate 클래스 정의
* - 멤버변수: 연도(year, 정수), 월(month, 정수), 일(day, 정수)
* - 생성자
*   1) 기본 생성자: 1999년 1월 1일로 초기화
*   2) 파라미터 생성자
*      2-1. 연도(year)를 전달받아 초기화하고 1월 1일로 초기화
*      2-2. 연도(year), 월(month)을 전달받아 초기화하고, 1일로 초기화
*      2-3. 연도(year), 월(month), 일(day)을 전달받아 초기화
*      
*   생성자 자동 단축키: 알+시프트+S -> O
*/

class Mydate{
	int year;
	int month;
	int day;
	
	// 1. 기본 생성자: 1999년 1월 1일로 초기화
	public Mydate() {
		System.out.println("Mydate() 생성자 호출됨!");
		year = 1999;
		month = 1;
		day = 1;
	}
	
	// 2-1) 연도를 전달받아 초기화하고, 1월 1일로 초기화
	public Mydate(int newYear) {
		System.out.println("Mydate(int)  생성자 호출됨");
		year = newYear;
		month = 1;
		day = 1;
	}
	
	// 2-2) 연도, 월을 전달받아 초기화하고, 1일로 초기화
	public Mydate(int newYear, int newMonth) {
		System.out.println("Mydate(int, int) 생성자 호출됨");
		year = newYear;
		month = newMonth;
		day = 1;
	}
	
	// 2-3) 연도, 월, 일을 전달받아 초기화
	// 자동 생성 단축키: 알+스+S -> O
	public Mydate(int year, int month, int day) {
		System.out.println("Mydate(int, int, int) 생성자 호출됨");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	public void showMydatenInfo() {
		System.out.println("연도: "+ year);
		System.out.println("월: "+ month);
		System.out.println("일: "+ day);
	}

	
}