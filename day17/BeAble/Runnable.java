package partC.day17.BeAble;

public interface Runnable extends BeAble{

	// 1) 필드는 상수만 있다.
	// 2) 추상메소드를 갖고있다.
	// 3) static 메소드 사용 가능하다.
	// 4) 인스턴스메소드(반드시 키워드 default 사용) 를 사용할 수 있다.
	
	String run(int speed);		//달리다
	
	
	//이 시점까지 정상적으로 인터페이스를 사용하여 클래스를 정의했습니다.(프로그램 버전v1)
	//그런데 애플리케이션 개발 후에 재정의가 필요한 메소드가 생겼고, 이것을 추상메소드로 정의한다면?
	
//	void temporary();
	
	//위의 추상메소드를 작성 후 프로그램 버전v1의 Dog, Human에 오류 발생
	//그래서 이럴때는 버전v2에서 새로운 기능을 추가해 필요한 메소드를 default로 정의한다.(프로그램 버전v2)
	
	default void temporary() {
		//오류가 생기지 않도록 default 메소드로 정의하고 나중 버전의 클래스들이 사용하도록 한다.
		//default를 사용하는 이유 : 이전 버전에서 오류를 발생하지 않게 하기위해
	}
	
}
