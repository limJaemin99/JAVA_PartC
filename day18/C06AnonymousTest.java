package partC.day18;

import partC.day17.InterfaceA;
import partC.day17.BeAble.Runnable;
import partC.day17.BeAble.Thinkable;

//익명 클래스
//한번만 쓰고 말거면 굳이 클래스 파일을 만들 필요가 없기때문에 익명클래스를 사용한다
public class C06AnonymousTest {
	public static void main(String[] args) {
		
		//new InterfaceA() 실행시점에서 inner type(내부 타입)의 구현 클래스를 정의
			// ▶ 객체 생성. ia는 객체를 참조하는 변수명
			//실행시점에서 구현클래스 정의 + 객체 생성을 동시에 함
		
		// ex) 예시는 맨 밑에 Runnable run1 로 들었음
		
		InterfaceA ia = new InterfaceA() {
			
			@Override
			public int methodB(int num) {
				System.out.println("InterfaceA 의 익명 클래스 구현 methodB");
				return 777+num;
			}
			
			@Override
			public void methodA() {
				System.out.println("InterfaceA 의 익명 클래스 구현 methodA");
				
			}
		};//InterfaceA 인터페이스 - ia 익명클래스
		
		Thinkable chatGPT = new Thinkable() {
			
			@Override
			public String beAble() {
				return null;
			}
			
			@Override
			public void think() {
			}
			
			@Override
			public int calculate(int a, int b) {
				return 0;
			}
		};//Thinkable 인터페이스 - chatGPT 익명클래스
		
		
		Runnable run1 = new Runnable() {
	//여기부터 ////////////////////////////////
			@Override
			public String beAble() {
				return "Anonymous";
			}
			
			@Override
			public String run(int speed) {
				return "Anonymous run!!";
	//여기까지 ////////////////////////////////
	//이 부분이 클래스의 정의. 그런데 이름이 없으니 익명. 그리고 inner(내부)
		//참고 : inner class 는 클래스 안에 클래스가 정의되는 형식
			}
		};//Runnable 인터페이스 - run1 익명클래스
		
		System.out.println(run1.beAble());
		System.out.println(run1.run(50));
		
		
	}//main end
}//main class end
