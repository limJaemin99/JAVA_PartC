package partC.day20;

//함수형 인터페이스 테스트
public class C11FunctionTest {
	public static void main(String[] args) {
		//자바를 비롯한 다른 프로그래밍 언어에서 '->' 기호로 줄여서 씁니다.(람다식 문법)	가독성, 간결성을 위해서 사용합니다.
		//-> 화살표 왼쪽은 매개변수선언(인자) , 화살표 오른쪽은 메소드 내용.
		
		System.out.println("1. 익명 클래스로 인터페이스 구현체 정의");
		FunctionEx fex1 = new FunctionEx() {
			
			@Override
			public int exmethod(int a, int b) {
				System.out.println("exmethod 정의 a+b*a : a = "+a+", b = "+b);
				return a+b*a;
			}
		};
		//1번 문제 출력
		System.out.println("▶ fex1 함수 인터페이스 실행 결과 = "+fex1.exmethod(3, 4));
		
		
		
		
		System.out.println("\n2. 람다식으로 (익명 클래스로 인터페이스 구현체) 메소드 정의");
		FunctionEx fex2 = (int a, int b) ->{	//추상메소드가 1개이므로 메소드이름이 굳이 필요가 없다.
			System.out.println("exmethod 정의 a+b*a : a = "+a+", b = "+b);
			return a*b+11;
		};
		//2번 문제 출력
		System.out.println("▶ fex2 함수 인터페이스 실행 결과 = "+fex2.exmethod(3, 4));
		
		
		
		System.out.println("\n3. switch 문을 람다식으로 해보기");
		char op = '*';
		int result = 0;
		
		switch(op) {
		case '+' -> result = 11+22;
		case '-' -> result = 55-22;
		case '*' -> result = 11*22;
		case '/' -> result = 66/22;
		}	// break; 필요없음
		//3번 문제 출력
		System.out.println("▶ "+result);
		
		
		
		
		System.out.println("\n4. IShape 테스트");
		System.out.println("=== 익명 클래스 정의(구현체)를 삼각형으로 한다면 ===");
		IShape triangle = (int a , int b) -> {
			return a*b/2;
		};
		
		IShape circle = (int radius , int dummy) -> {	//매개변수 개수 맞추기 위해 사용하지 않을 더미 변수를 선언해줬다.
			return (int)(radius*radius*Math.PI);
		};
		
		System.out.println("triangle.area(10, 20) = "+triangle.area(10, 20));
		System.out.println("circle.area(10, 0) = "+circle.area(10, 0));
		
	}//main end
}//main class end
