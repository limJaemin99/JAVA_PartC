package partC.day23;

import java.util.Scanner;

//UncheckedException 예외 Test
//어떠한 RuntimeException 이 생기는지 확인하기
	//NullPointerException , InputMismatchException , NumberFormatException 의 부모클래스이다.
public class C15UncheckedExceptionTest {
	public static void main(String[] args) {
		
		//예시 1 : java.lang.NullPointerException
		String message = "Hello";
//		String message = null;			//↓message가 null값일때↓
		char temp = message.charAt(0);	//예외 발생 시점 : 객체가 지정되지 않은 null 상태. 메소드를 실행할 수 없다.
		System.out.println("temp = "+temp);
		
		
		//예시 2 : java.util.InputMismatchException
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(1) ▶ ");
//		int a = sc.nextInt();	//정수만 받을거면 nextInt() 사용해도 괜찮음
//		sc.nextLine();
		//nextInt()에 문자열을 입력시 InputMismatchException 발생
		
		//정수 받고 문자열도 받을거면 partseInt로 nextLine() 받기		//↓a 에 문자를 입력했을때↓
		int a = Integer.parseInt(sc.nextLine());	//예외 발생 시점 : 숫자가 아닌 문자열을 입력하면 정수로 처리할 수 없어서 발생
		
		System.out.println("\n입력 값 = "+a);
		
		
		//예시 3 : java.lang.NumberFormatException
		System.out.print("정수를 입력하세요(2) ▶ ");
		//만약 위의 예시 2에서 nextInt()를 사용했다면 예외 발생
		a = Integer.parseInt(sc.nextLine());	//예외 발생 시점 : nextInt()는 엔터를 인식하지 않기 때문에 현재 nextLine()에 엔터가 들어와 예외 발생
		
		System.out.println("\n입력 값 = "+a);
		
		
		
		
		
		
		
	}//main end
}//main class end
