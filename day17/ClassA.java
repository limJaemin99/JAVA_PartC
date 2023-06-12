package partC.day17;


			 //★★★★★★★★★
//InterfaceA 의 ★구현 클래스★ (구현체, 실체)
//InterfaceA 의 추상메소드를 꼭 정의(구현)(오버라이드)해야한다. (추상클래스와 동일)
public class ClassA implements InterfaceA {

	//인스턴스 필드
	private String name;
	
	
	//인스턴스 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String hello() {
		return "Hello~ " + name;
	}
	
	//Object 클래스 toString 재정의
	@Override
	public String toString() {
		return "[name = "+name+"]";
	}


	//InterfaceA 의 추상메소드 구현
	@Override
	public void methodA() {
		System.out.println("InterfaceA 의 methodA 를 정의(구현)합니다. => "+name);
	}

	@Override
	public int methodB(int num) {
		System.out.println("InterfaceA 의 methodB 를 정의(구현)합니다. => "+name);
		return 999+num;
	}
	
	
	
	
}
