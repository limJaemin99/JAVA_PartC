package partC.day21;

import java.io.File;	//io는 input과 output.	입출력 클래스들의 패키지이다.
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C13FileReadTest {
	public static void main(String[] args) {
		// D:\icalss0419 에 저장된 words.txt 파일로부터 입력(읽어오기)
		String path = "D:\\iclass0419\\words.txt";
		File file = new File(path);	//[1] 읽어올 파일에 대한 객체를 생성한다.
		
//		Scanner fsc1 = new Scanner(file);	//[2] 파일을 다루는 Scanner 객체 생성(파일 입력)
//		[3] 입출력을 다루는 객체들은 Exception 처리를 개발자가 해야한다.
		
		Scanner fsc = null;
		try {	
			//[4] try { } 명령문을 실행하다가  Exception(예외)가 생기면 catch { } 를 실행한다.
			fsc = new Scanner(file);
			
			//[7] 파일에서 읽어온 데이터를 콘솔에 출력하기
			while(fsc.hasNext()) {
				System.out.println(fsc.nextLine());	//한줄씩(엔터까지) 읽어오는 메소드
			}
			
			System.out.println("▶ 정상적으로 파일 읽어오기 끝!");
		} catch (FileNotFoundException e) {	//[5] 예외가 발생한 정보를 Exception 객체에 저장한다.
			//예외의 원인을 사용자에게 알려주기
			System.out.println("파일로부터 읽어오기 - 입력 예외 : "+e.getMessage());
		} finally {
			//[6] 정상실행과 예외발생 모두 사용한 자원(txt파일같은것들)을 종료하기 위한 명령문을 작성한다.
			if(fsc != null)fsc.close();
		}
		
		//※ 참고 : 예외처리에 try - catch 와 throws (떠넘기기?)
				//main 메소드에서 throws를 하면 JVM이 처리한다.
				//JVM은 자바프로그램 실행하는 가상머신
		
		
		/*
		[words 파일 내용]
		public/공공의,공적인,대중/
		private/사적인,개인적인/
		anonymous/익명의,신원불명의/
		inheritance/상속 재산/
		chat/잡담,수다 떨다,채팅하다./
		event/사건,행사/
		method/방법,체계,질서/
		class/공통적인 성질을 가진 종류,부류,학급,강습/
		static/정적인,고정된,변화가 없는/
		dynamic/동적인,힘,동력/
		instance/사례,경우,실례/
		object/물건,물체,대상/
		main/주된,주요한,중심을 이루는/
		*/
		
		
		
	}//main end
}//main class end
