package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

//Unchecked Try-catch Test
public class C16UncheckedTryCatch {
	public static void main(String[] args) {

		// 예시 1 : java.lang.NullPointerException
		try {
			String message = null;
			char temp = message.charAt(0);

			System.out.println("temp = " + temp);
		} catch (NullPointerException e) {	//NullPointerException 만 catch(처리) 한다.
			System.err.println("예외 : NullPointerException");	//Null 객체로 메소드를 실행하였습니다.
		} //catch (RuntimeException e) {	//RuntimeException 의 자식 클래스 Exception catch(처리) 한다.
//			System.err.println("예외 : RuntimeException");
//		}
		
		//try-catch로 예외를 처리하면 계속 프로그램이 진행된다.
		//try{} 블럭 이후의 명령어들 실행

		// 예시 2 : java.util.InputMismatchException
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수를 입력하세요(1) ▶ ");
			int a =  sc.nextInt();
			sc.nextLine();
			
			System.out.println("\n입력 값 = " + a);
		} catch (InputMismatchException e) {
			System.err.println("예외 : InputMismatchException");
			sc.nextLine();
		}

		// 예시 3 : java.lang.NumberFormatException
		try {
			System.out.print("정수를 입력하세요(2) ▶ ");
			int a = Integer.parseInt(sc.nextLine());
			
			System.out.println("\n입력 값 = " + a);
		} catch (NumberFormatException e) {
			System.err.println("예외 : NumberFormatException");
		}

	}// main end
}// main class end
