package thread;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 프로그램(Program)
		 * - 디스크에 설치되어 있는 실행되기 전 상태의 소프트웨어
		 * 
		 * 프로세스(Process)
		 * - 설치된 프로그램을 실행하여 메모리에 로딩된 상태(=실행중인 프로그램)
		 * - 자원(resources)과 쓰레드로 구성
		 * 
		 * 멀티태스킹(Multi Tasking)
		 * - 프로세스가 여러 개일 때 해당 프로세스들이 동시에 수행되는 것
		 *   (정확히는 CPU가 빠른 속도로 프로세스들을 번갈아가면서 수행)
		 * - 예를 들어 동영상을 재생하면서 웹페이지 표시, 음악 재생하는 것
		 * 
		 * 스레드(Thread)
		 * - 프로세스 내에서 작업의 최소 단위
		 * - 프로세스 내에서 실제 작업의 수
		 * - 하나의 프로세스 내에는 최소 한 개의 스레드가 동작함(=Single Thread)
		 *   -> 동시에 수행 가능한 작업은 단 한 개 뿐이다
		 * - 하나의 프로세스 내에서 동시에 수행 가능한 작업을 늘리려면
		 *   멀티 스레드(Multi Thread)로 구현해야 한다!
		 *   ex) 메신저 내에서 파일 전송과 동시에 메시지, 송수신 하는 것
		 * - 하나의 새로운 프로세스를 실행하는 것보다 하나의 새로운 스레드를
		 *   생성하는 것이 더 적은 비용이 듦
		 */
		
		NoThread nt1 = new NoThread("★A작업★", 1000000);
		NoThread nt2 = new NoThread("○B작업○", 500000);
		NoThread nt3 = new NoThread("→C작업←", 1000000);
		
		nt1.run();
		nt2.run();
		nt3.run();
		

	}

}

class NoThread {
	String name;
	int count;
	
	public NoThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}