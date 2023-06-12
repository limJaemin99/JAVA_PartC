package partC.day17;

//인터페이스 형식 연습
//자바 라이브러리의 많은 인터페이스와 그것을 사용한 클래스들을 이해하는것이 목적.
//그 후에는 우리도 인터페이스를 사용하게 됩니다.
public interface InterfaceA {
	
	
	// 1) 필드는 상수만 있다. (public static final을 생략한다. 인스턴스 필드 없다.)
	int SIZE = 10;	//상수필드		//인스턴스필드 없다.
					//outline을 보면 S,F가 붙어있다(static, final이라는 뜻)
	
	
	// 2) 추상메소드를 갖고있다. (public abstract를 생략한다.)
	void methodA();
	int methodB(int num);
	//outline을 보면 A가 붙어있다(abstract라는 뜻)
	
	
	// 3) static 메소드 사용 가능하다.
	static void methodC() {
		System.out.println("나는 static 메소드 입니다.");
	}
	//outline을 보면 S가 붙어있다(static이라는 뜻)
	
	
	// 4) 인스턴스메소드(반드시 키워드 default 사용) 를 사용할 수 있다. (접근한정자는 모두 public이다.)
	default void methodD(int message) {	//★★★ 접근한정자의 default와 다르다 (인스턴스 메소드를 나타낸다) ★★★
		System.out.println("수신된 메세지는 '"+message+"' 입니다.");
	}
	
	
	
}
