package partC.day21.example;

import java.util.List;
import java.util.Scanner;

//★★★★★★★★★★★숙제 내용★★★★★★★★★★★
/*
  숙제로 수정한 부분
  JavaVocaApp (현재 파일) 54번 라인 - [s]save 기능을 추가하면서 기존 [s] 를 [f] 로 변경
  JavaVocaApp (현재 파일) 62번 라인 - 단어 삭제 기능 추가하기
  JavaVocaApp (현재 파일) 88번 라인 - 단어장 삭제 기능을 추가했으므로 단어장이 비어있을때 출력문을 추가함
  JavaVocaNote - save 메소드 완성
*/

//단어장 프로그램
public class JavaVocaApp {
	public static void main(String[] args) {
		
		JavaVocaNote myNote = new JavaVocaNote();
		
		
		Scanner sc = new Scanner(System.in);
		
		String english;
		String korean;
		String level;
		String sel;
		boolean run = true;
		String path = "D:\\iclass0419\\javavoca.txt";
		
		//1. 프로그램을 시작하면 저장된 단어들을 파일에서 읽어옵니다.
		myNote.load(path);
		
		while(run) {
			System.out.println("━".repeat(82)+"┓");
			System.out.println("선택 기능 👉🏻 [n]새 단어 저장 | [f]단어 찾기 | [d]단어 삭제 | [g]그룹선택 보기 | [a]전체보기 | [s]현재 단어장 저장하기 | [e]프로그램 끝내기");
			System.out.print("선택 ✏ ->");
			sel = sc.nextLine();
			
			switch(sel) {
				case "n":
					System.out.println("단어 입력 ✏ ");
					english = sc.nextLine();
					System.out.println("뜻(의미) ✏ ");
					korean = sc.nextLine();
					System.out.println("그룹(1:기초,2:중급,3:고급) ✏ ");
					level = sc.nextLine();
					//add() 메소드 실행하기
//					myNote.add(new JavaVoca(english, korean, level));
					JavaVoca newVoca = new JavaVoca(english, korean, level);
				    newVoca.setLevel(level);
				    myNote.add(newVoca);
					break;
				case "f":	//[s]현재 단어장을 저장하기 때문에 s ▶ f로 변경함★★★★★★★★★★★숙제 내용★★★★★★★★★★★
					System.out.println("찾을 JAVA 단어 입력 ✏ ");
					english = sc.nextLine();
					JavaVoca f = myNote.getVoca().get(english);
					if(f == null) System.out.println("찾는 단어가 없습니다.");
					else System.out.println("찾으시는 단어는 "+f+" 입니다.");
					break;
				case "d":
					//단어 삭제 기능 추가하기(숙제)★★★★★★★★★★★숙제 내용★★★★★★★★★★★
					System.out.println("삭제할 JAVA 단어 입력 🗑 __ ALL을 입력 시 전체 삭제");
					english = sc.nextLine();
					if(english.equals("ALL")) {
						myNote.getVoca().clear();
						System.out.println("단어장이 전체 삭제 되었습니다.");
					} else {JavaVoca delete = myNote.getVoca().remove(english);
					if(delete != null) System.out.println(english+" 단어가 삭제되었습니다.");
					else System.out.println("삭제할 단어가 없습니다.");
					}
					break;
				case "g":
					System.out.println("검색할 레벨(1:기초,2:중급,3:고급) ✏ ");
					level = sc.nextLine();		//1,2,3 중 하나를 입력
					List<JavaVoca> results = myNote.group(level);
					//List<E> 는 내가만든 인터페이스가 아니므로(자바라이브러리) toString 재정의 불가
						//따라서 예쁘게 출력하려면 for문 사용해야함
					for (int i = 0; i < results.size(); i++) {
						System.out.println(results.get(i));
					}
					
					System.out.println("검색 결과 ▶ "+results);
					System.out.println("결과 개수 ▶ "+results.size());

					break;
				case "a":
					//단어장 삭제 기능을 추가했으므로 단어장이 비어있을때 출력문을 추가함★★★★★★★★★★★숙제 내용★★★★★★★★★★★
				    if (myNote.getVoca().isEmpty()) 
				    	System.out.println("⚠단어장에 데이터가 없습니다⚠");
					else myNote.print();
					break;
				case "s":
					myNote.save(path);
					System.out.println("현재 단어장을 저장했습니다");
					break;
				case "e":
					run = false;	//종료 조건
					break;
				default :
					System.out.println("잘못 입력하셨습니다.\n");
					break;
			}
			
			
			
			
		}//while end
		System.out.println("\\\\━━━━━━━ 단어장을 종료합니다 ━━━━━━━//");
		sc.close();
		
		
	}//main end

}//main class end
