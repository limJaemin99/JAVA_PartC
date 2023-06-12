package partC.day17;

public class C01InterfaceATest {
	public static void main(String[] args) {
		
		System.out.println("1. InterfaceA의 상수 필드 확인");
		System.out.println("SIZE = "+InterfaceA.SIZE);
		
		
		System.out.println("\n2. 인터페이스는 직접 객체 생성은 하지 않는다.");
//		InterfaceA ia = new InterfaceA();	//오류(추상클래스가 직접 객체생성을 하지 않는것과 동일)
		
		
		System.out.println("\n3. static 메소드 실행하기");
		InterfaceA.methodC();
		
		
		System.out.println("\n4. InterfaceA의 구현클래스로 객체 생성하기");
		System.out.println("4-1) 구현 클래스 타입 변수로 선언하기");
		ClassA ca = new ClassA();
		System.out.println("4-2) 인터페이스 타입 변수로 선언하기");
		InterfaceA ia = new ClassA();
		
		
		System.out.println("\n5. 구현클래스의 오버라이드 메소드 실행하기");
		ca.setName("김OO");
		ca.methodA();
		System.out.println("━".repeat(44)+"┛");
		
		
		
//		ia.setName("이OO");	//오류 : 현재 참조변수가 InterfaceA 이므로 구현클래스의 메소드 실행 못함
								//(상속에서 부모가 자식의 필드를 사용할 수 없는것과 동일)
		//오류 해결 방법 : InterfaceA의 추상메소드 구현한 것 실행(ClassA 사용하라는 뜻)
		
		//다운캐스팅 후 setName 하는 방법
		System.out.println("ia변수의 타입체크 >>>"+ (ia instanceof ClassA));
		ClassA cia = (ClassA)ia;
		cia.setName("이OO");		//▶ ia의 name이 "이OO"이 된 것이므로
		ia.methodA();			//cia가 아닌 ia를 써도 된다.
		System.out.println("━".repeat(44)+"┛");
		
		System.out.println(ca.methodB(123));
		System.out.println("━".repeat(44)+"┛");
		
		System.out.println(ia.methodB(124));
		System.out.println("━".repeat(44)+"┛");
		
	}//main end
}//main class end
