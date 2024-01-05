package for_;

public class Test2 {

	public static void main(String[] args) {
		// 정수 1~100까지의 합을 누적변수 total에 누적 후 출력
		// 누적변수 선언 및 초기화
		int total = 0;
		
		// for문
		for(int i = 1; i <=100; i++);{
			// total에 i값을 누적
//			total += i;
		}
		
		// 누적변수 출력
		System.out.println("1~100까지 정수의 합: " + total);
		
		System.out.println("--------------------------");
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
		
		// 누적 변수 선언 및 초기화
		total = 0;
		
		
		for(int i = 1; i <=10 ; i++) {
			// 짝수일 경우에만 누적변수에 현재 값 i를 누적
			if(i % 2 ==0) { //짝수를 판별
				// 짝수일 때 누적 수행
//				total = total + i;
				total += i;
				System.out.println("i =" + i + ", total =" + total);
			}else { // 짝수가 아닐 때 (=홀수일때)
				System.out.println(i + ": 홀수이므로 누적X");
			}
		}

		// 1~10까지 정수 중 짝수의 합 출력
		System.out.println("1~10까지 정수 중 짝수의 합: " + total);
		
		System.out.println("---------------------------");
		
		// 1~10까지 정수 중 홀수의 합 계산 후 출력
		for(int i = 1; i <=10 ; i++) {// 1~10까지 1씩 증가하면서 반복
			// 홀수일 경우에만 누적변수에 현재 값 i를 누적
			if(i % 2 == 1) { //홀수를 판별
				// 짝수일 때 누적 수행
				total += i;
				System.out.println("i =" + i + ", total =" + total);
			}else { // 홀수가 아닐 때 (=짝수일때)
				System.out.println(i + ": 짝수이므로 누적X");
			}
		}

		// 1~10까지 정수 중 짝수의 합 출력
		System.out.println("1~10까지 정수 중 홀수의 합: " + total);
		
		
		}

}
