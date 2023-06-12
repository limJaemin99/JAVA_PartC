package partC.day20;
//★/★/★/★/★/★/★/★//
//함수형 인터페이스 정의
//인터페이스 중에 *추상메소드가 1개인것*은 다른 프로그래밍 언어에서 사용되는 __함수__의 형식으로 표현할 수 있습니다.
	//함수와 메소드의 공통점 : 인자와 리턴값이 있다.
	//함수와 메소드의 차이점 : 클래스(또는 객체)에 구성요소로 포함
//자바 라이브러리에는 인자의 형식과 개수와 리턴타입 등 여러 유형에 따라
//Consumer, Supplier(구 Producer), Function, Predicate 등의 함수형 인터페이스가 미리 정의되어 있습니다.
//소비자		공급자	느낌?

@FunctionalInterface	//함수형 인터페이스에 사용합니다. 애노테이션이라는 주석으로 [코드를 체크하는 기능]을 합니다.
public interface FunctionEx {
	
	int exmethod(int a, int b);
	
//	void print(String abc);		//추상메소드가 1개여야하는데 2개 만들면
								//@FunctionalInterface 애노테이션 주석이 오류를 발생시켜준다.
								//애노테이션 : 실수를 방지하기 위해 사용
	
	
	
}
