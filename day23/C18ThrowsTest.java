package partC.day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C18ThrowsTest {
	public static void main(String[] args) {
		
		//어떠한 RuntimeException 이 생기는지 확인하기
			//NullPointerException , InputMismatchException , NumberFormatException 의 부모클래스
		//아래와 같은 catch도 multi-catch이다
		try {
			
			inputData();
			
			
		} catch (InputMismatchException | NumberFormatException e) {
			// (&& ▶ And) , (|| ▶ Or) , (| ▶ 비트단위의 or연산(논리연산 or가 아님))★★★★★★★★★★
			//catch에서 여러개의 예외를 다룰 때에는 비트연산 or를 사용해야 한다.
			//여러 예외처리에 대해 처리할 내용이 같을 때 쓰는 방식이다.
			
			System.err.println("정수 입력 예외 : 반드시 숫자만 입력해야 합니다.");
			
		}
		
		
		
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
