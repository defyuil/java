package abstract_;

public class Test1 {
	
	public static void mian(String[] args) {
		
		/*
		* 슈퍼맨, 새, 비행기의 공통점: 비행 가능
		* -> 공통점을 추출하여 상위클래스로 정의하되,
		*    각 서브 클래스에서 비행 기능을 반드시 구현하도록 강제성을 부여
		*    
		*  Flyer 추상 클래스 정의
		*  -> 이륙(takeOff), 비행(fly), 착륙(land) 추상 메서드 정의
		*  -> 슈퍼맨, 새, 비행기 서브 클래스 생성
		*     각 메서드 호출 시 "슈퍼맨(or 새 or 비행기) 이륙!",
		*     "슈퍼맨 비행", "슈퍼맨 착륙" 출력
		*/
		
		// Flyer 클래스를 상속받은 SuperMan, Bird, AirPlane 인스턴스 생성
		SuperMan a = new SuperMan();
		a.takeOff();
		a.fly();
		a.land();
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		AirPlane c = new AirPlane();
		c.takeOff();
		c.fly();
		c.land();
		
		System.out.println("==================================");
		
		// SuperMan, Bird, AirPlane -> Flyer 타입으로 업캐스팅하여 다형성 활용
		Flyer f = new SuperMan();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new AirPlane();
		f.takeOff();
		f.fly();
		f.land();
		
		
		
	}

}



abstract class Flyer {
	
	// 모든 날아다니는 것에 대한 이륙, 비행, 착륙 메서드 정의
	// -> 슈퍼클래스로 사용할 Flyer 클래스의 메서드들에는
	//    실행할 코드가 불필요하므로 추상 메서드로 정의하고
	//    추상 메서드를 포함하는 Flyer 클래스를 추상 클래스 정의
	public abstract void takeOff();
	public abstract void fly();
	public abstract void land();
	
}

// Flyer 클래스를 상속받는 SuperMan, Bird, Airplane 클래스 정의

class SuperMan extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("슈퍼맨 이륙!");
		
	}

	@Override
	public void fly() {
		System.out.println("슈퍼맨 비행!");
		
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨 착륙!");
		
	}


	
}

class Bird extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("새 이륙!");
		
	}

	@Override
	public void fly() {
		System.out.println("새 비행!");
		
	}

	@Override
	public void land() {
		System.out.println("새 착륙!");
		
	}


	
}

class AirPlane extends Flyer {

	@Override
	public void takeOff() {
		System.out.println("비행기 이륙!");
		
	}

	@Override
	public void fly() {
		System.out.println("비행기 비행!");
		
	}

	@Override
	public void land() {
		System.out.println("비행기 착륙!");
		
	}


	
}


