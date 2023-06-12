package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;


//multi-catch 설명
//Exception이 발생한 시점부터 다음 try문은 실행되지 않고 바로 catch문으로 이동
public class C17UncheckedTryCatch {
	public static void main(String[] args) {
		
		try {
			//예시 1 : java.lang.NullPointerException
			String message = "hello";
			char temp = message.charAt(0);
			System.out.println("temp = "+temp);
			
			
			//예시 2 : java.util.InputMismatchException
			Scanner sc = new Scanner(System.in);
			System.out.print("정수를 입력하세요(1) ▶ ");
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n입력 값 = "+a);
			
			
			//예시 3 : java.lang.NumberFormatException
			System.out.print("정수를 입력하세요(2) ▶ ");
			a = Integer.parseInt(sc.nextLine());
			
			System.out.println("\n입력 값 = "+a);
		} 
		
		//try{} 블럭 안에서 예외가 발생했을 때,
		//어떤 예외 타입인지 catch 에서 비교하고 타입이 일치한 catch{} 블럭을 처리한다.
		//발생한 예외 객체는 catch() 인자 변수 e로 참조한다.
		
		
//		catch (RuntimeException e) {
//			System.err.println("실행중에 생기는 예외를 처리합니다.");
//			//부모타입 RuntimeException 으로 하면 아래 '자식타입 예외'는 처리가 불가능하기 때문에 컴파일 오류 발생
//		}
		
		catch (NumberFormatException e) {
			System.err.println("숫자가 아닌 문자는 parseInt() 불가");
		} 
		
		catch (NullPointerException e) {
			System.err.println("null 객체로 메소드 실행 불가");
		}
		
		catch (InputMismatchException e) {
			System.err.println("숫자가 아닌 문자는 nextInt() 불가");
		}
		
		catch (RuntimeException e) {
			System.err.println("실행중에 생기는 예외를 처리합니다.");
			//부모타입 RuntimeException 으로 위의 3개 예외 이외의 모든 RuntimeException 을 처리한다.
		}
		
		
		
		
		
	}//main end
}//main class end
