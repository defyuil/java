package variable;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * < 식별자 작성 규칙 >
		 * 
		 * < 필수 >
		 * 1. 첫 글자는 숫자 사용 불가
		 * 2. 특수 문자는 $(달러) 또는 _(언더스코어)만 사용 가능
		 * 3. 대소문자 구별
		 * 4. 키워드(예약어) 사용 불가
		 * 5. 공백 사용 불가
		 * ------------------
		 * < 권장 사항 >
		 * - 의미가 있는 단어 사용
		 * - 변수명의 첫 단어는 소문자로 작성, 두 번째 단어부터는
		 *   첫 글자를 모두 대문자로 작성
		 *   -> camel-case 표기법 사용
		 *   ex) studentName
		 *   참고) 클래스명은 첫 단어의 첫 글자를 대문자 표기
		 *   -> Pascal-case 표기법
		 * - 길이 제한 없음
		 * - 한글 사용이 가능하지만 사용하지 않음
		 */
		
		// 1. 첫 글자는 숫자 사용 불가
//		int 7eleven;    // 사용 불가
		// -> Invalid float literal number
		int sevenEleven;
		
		// 2. 특수문자는 $(달러) 또는 _(언더스코어)만 사용 가능
		int $system; // 사용 가능
		int my_name; // 사용 가능
//		int channel#5; // 사용 불가! ($또는 _만 사용가능)
		// -> Syntax error on token  "Invalid Character", = expexted
		
		// 3. 대소문자 구별
		int age; // 소문자 age와
		int AGE; // 대문자 AGE는 다른 식별자로 취급됨
		
		// 4. 키워드(예약어) 사용 불가
//		int int;       //  키워드 int 사용 불가
//		int switch;    // 키워드 switch 사용 불가
//		int char;      // 키워드 char 사용 불가
		
		// 5. 공백 사용 불가
//		int my name;   // 사용 불가
//		int my, name;  // int형 변수 my와 int형 변수 name을 동시에 선언
		
		// 6. 한글 사용 가능(하지만 변수명으로 사용하지 않음)
		int 나이; 
		
		
		
		
		
		

	}

}
