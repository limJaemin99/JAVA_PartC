package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C18ThrowsTest2 {
	public static void main(String[] args) throws Exception {
		//main 메소드에서 throws Exception 했을때
		//main에서 예외를 throws 하면 JVM이 위임받게 되고, 결국은 try-catch 처리하기 이전과 같은 결과가 된다.
			//main에서 throws Exception 하는 경우는 테스트용일때 주로 사용한다
		
			inputData();
			
	
		
	}//main end

	
	private static void inputData() throws InputMismatchException , NumberFormatException {
		//InputMismatchException 예외는 inputData 메소드를 호출한 main 으로 위임(떠넘기기) 한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 ▶ ");
		int a = sc.nextInt();	//java.util.InputMismatchException
								//숫자가 아닌 문자 입력하면 정수로 처리(nextInt)할 수 없어서 발생
		System.out.println("\n입력 값 (1) = "+a);
		
		sc.nextLine();			//위의 nextInt()가 가져가지 않은 문자 엔터를 처리하기 위한 명령
		
		//예시 3 : java.lang.NumberFormatException
		System.out.print("정수를 입력하세요(2) ▶ ");
		//만약 위의 예시 2에서 nextInt()를 사용했다면 예외 발생
		a = Integer.parseInt(sc.nextLine());	//예외 발생 시점 : nextInt()는 엔터를 인식하지 않기 때문에 현재 nextLine()에 엔터가 들어와 예외 발생
		
		System.out.println("\n입력 값 = "+a);
	}//inputData end
	
	
}//main class end
