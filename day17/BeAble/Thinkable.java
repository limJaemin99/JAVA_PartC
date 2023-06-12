package partC.day17.BeAble;

public interface Thinkable extends BeAble{
	
	// 1) 필드는 상수만 있다.
	// 2) 추상메소드를 갖고있다.
	// 3) static 메소드 사용 가능하다.
	// 4) 인스턴스메소드(반드시 키워드 default 사용) 를 사용할 수 있다.
	
	void think();		//생각하다
	int calculate(int a, int b);	//계산하다
	
}
