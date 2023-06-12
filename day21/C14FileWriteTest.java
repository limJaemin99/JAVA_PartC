package partC.day21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C14FileWriteTest {
	public static void main(String[] args) {
		// D:\icalss0419 에 저장된 note.txt 파일로 출력(저장하기.쓰기(write))
				String path = "D:\\iclass0419\\note.txt";
				File file = new File(path);
				Scanner sc = new Scanner(System.in);	//표준입력을 위한 스캐너 객체
				
				//파일 출력 클래스
				PrintWriter fpw = null;	//초기값 없으면 오류 발생함★★★★★
				try {
					fpw = new PrintWriter(file);	//파일 출력을 위한 PrintWriter 객체
					
					//테스트용
//					fpw.print("테스트");
//					fpw.println("TEST");
//					fpw.print("테스트");
					System.out.println("[종료 : _end_ 입력]");
					while(true) {
						System.out.print("자바에서 쓰는 영어 단어 입력 ● ");
						String english = sc.nextLine();
						if(english.equals("_end_")) break;	//종료 조건
						System.out.print("단어의 의미를 입력하세요 ○ ");
						String korean = sc.nextLine();
						
						fpw.print(english);		//fpw에서 지정한 파일로 쓰기
						fpw.print("/");
						fpw.println(korean);
						
						System.out.println("▶ 단어 추가 완료!");
					}
					
					//저장할때마다 새로 입력한 내용이 덮어쓰기가 되어버림
						//이어서 쓰는 방법은 따로 있음
					System.out.println("▶ 단어장 텍스트파일 저장 완료!");
				} catch (FileNotFoundException e) {
					System.out.println("파일로 저장하기 - 출력 예외 : "+e.getMessage());
					e.printStackTrace();
				} finally {
					if(fpw != null) fpw.close();
					sc.close();
				}
				
				
				
				
				
	}//main end
}//main class end
