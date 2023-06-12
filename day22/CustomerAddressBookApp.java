package partC.day22;

import java.util.List;
import java.util.Scanner;

public class CustomerAddressBookApp {
	public static final String FONT_PURPLE = "\u001B[35m";
	public static final String RESET = "\u001B[0m"; 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CustomerAddressBook addressBook = new CustomerAddressBook();
		
		String path = "D:\\iclass0419\\CustomerAddressBook.txt";
		String name;
		String address;
		String grade;
		String sel;
		boolean run=true;
		
		//-------------------------------------------//
		//왜 중복이 가능한지? 찾아보기
		//-------------------------------------------//
		//시작
		addressBook.load(path);
		
		while(run) {
			System.out.println(FONT_PURPLE+"\n[원하는 메뉴의 번호를 입력하세요]"+RESET);
			System.out.print("[1] 고객 정보 추가 | [2] 고객 등급별 검색 | [3] 전체 고객 보기 | [4] 삭제하기 | [5] 저장하기 | [6] 종료\n☞");
			sel = sc.nextLine();
			
			switch(sel) {
			case "1":
				System.out.print("추가할 고객의 이름을 입력하세요.\n☞");
				name = sc.nextLine();
				System.out.print("추가할 고객의 주소를 입력하세요.\n☞");
				address = sc.nextLine();
				System.out.print("추가할 고객의 등급을 입력하세요.[1:일반고객 2:직원 3:VIP]\n☞");
				grade = sc.nextLine();
				Customer newCS = new Customer(name, address, grade);
				newCS.setGrade(grade);
				addressBook.add(newCS);
				System.out.println("▶ "+name+" 님의 고객 정보가 등록되었습니다.");
				break;
				
			case "2":
				System.out.print("검색할 고객의 등급을 입력하세요.[1:일반고객 2:직원 3:VIP]\n☞");
				grade = sc.nextLine();
				List<Customer> csGrade = addressBook.group(grade);
				
				System.out.println("검색 결과");
				for (int i = 0; i < csGrade.size(); i++) {
					System.out.println("▶ "+csGrade.get(i));
				}
				
				System.out.println("검색 결과 개수 ▶ "+csGrade.size());
				break;
			
			case "3":
				if(addressBook.getCustomer().isEmpty()) System.out.println("▶ Error : 출력할 데이터가 없습니다!");
				else addressBook.print();
				break;
				
			case "4":
				System.out.print("삭제할 고객의 이름을 입력하세요.(\"전체\" 입력시 전체 삭제)\n☞");
				name = sc.nextLine();
				if(name.equals("전체")) {
					addressBook.getCustomer().clear();
					System.out.println("▶ 고객 정보가 전체 삭제 되었습니다.");
				}
				else {
					System.out.print("정말 "+name+" 님의 고객 정보를 삭제하시겠습니까? [1:Yes 2:No]\n☞");
					sel = sc.nextLine();
					if(sel.equals("1")){
						Customer delete = addressBook.getCustomer().remove(name);
						if(delete != null) System.out.println("▶ "+name+" 님의 고객 정보가 삭제되었습니다.");
						else System.out.println("▶ Error : "+name+" 님의 고객 정보를 찾을 수 없습니다!");
					}else if(sel.equals("2")) {
						System.out.println("▶ 고객 정보 삭제를 취소합니다.");
					}
				}
				break;
				
			case "5":
				System.out.print("현재 내용을 저장하시겠습니까? [1:Yes 2:No]\n☞");
				sel = sc.nextLine();
				if(sel.equals("1")) {
					addressBook.save(path);
				} else System.out.println("▶ 저장을 취소합니다.");
				break;
			
			case "6":
				run = false;
				System.out.println("★고객 정보 시스템을 종료합니다★");
				break;
			}//switch end
		}//while end
		sc.close();
		
		
		
		
	}//main end
}//main class end
