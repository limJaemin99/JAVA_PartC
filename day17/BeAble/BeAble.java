package partC.day17.BeAble;


//Cookable, Thinkable, Runnable 인터페이스와 Human, AI, Dog 구현클래스를 만든 후 
//BeAble 인터페이스를 만들어 위 3개의 인터페이스에 상속시킨다.
//위 3개의 인터페이스를 implements 했던 구현클래스들에서 오류 발생
	//이유 : BeAble을 상속받았기 때문에 BeAble의 추상메소드를 구현(오버라이드)해줘야함
//부모 인터페이스의 추상메소드도 정의가 필요하다.

//인터페이스는 다른 인터페이스를 부모로 상속받을 수 있다.
public interface BeAble {
	
	String beAble();
	
}