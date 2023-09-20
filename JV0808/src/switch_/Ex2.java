package switch_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 입력받은 월(month) 이 다음과 같을 때 월의 일수 출력
		 * - 1, 3, 5, 7, 8, 10, 12월일 경우 : "한 달은 31일" 출력
		 * - 4, 6, 9, 11월일 경우 : "한달은 30일" 출력
		 * - 2월일 경우 : "한 달 28일" 출력
		 */
		
		int month = 9;
		switch(month) {
			case 1 : System.out.println(month + "월 한달은 31일");
			break;
			case 3 : System.out.println(month + "월 한달은 31일");
			break;
			case 5 : System.out.println(month + "월 한달은 31일");
			break;
			case 7 : System.out.println(month + "월 한달은 31일");
			break;
			case 8 : System.out.println(month + "월 한달은 31일");
			break;
			case 10 : System.out.println(month + "월 한달은 31일");
			break;
			case 12 : System.out.println(month + "월 한달은 31일");
			break;
			case 4 : System.out.println(month + "월 한달은 30일");
			break;
			case 6 : System.out.println(month + "월 한달은 30일");
			break;
			case 9 : System.out.println(month + "월 한달은 30일");
			break;
			case 11 : System.out.println(month + "월 한달은 30일");
			break;
			case 2 : System.out.println(month + "월 한달은 28일");
			break;
		}

	}

}
