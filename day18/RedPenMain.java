package partC.day18;

import java.util.Scanner;

public class RedPenMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문제의 갯수를 정해주세요.");
		int questCount = sc.nextInt();
		sc.nextLine();
//		System.out.println("문제의 타입을 정해주세요.");
//		System.out.println("덧셈 , 뺄셈 , 곱셈 , 나눗셈 중 입력");
//		String symStr = sc.nextLine();
//		char symCh = ' ';
//		if(symStr == "덧셈") symCh = '+';
//		if(symStr == "뺄셈") symCh = '-';
//		if(symStr == "곱셈") symCh = '*';
//		if(symStr == "나눗셈") symCh = '/';
//		
		
		
		
		int result[] = new int[questCount];
		int correctCount=0;
		
		
		System.out.println("초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜 입니다.");
		System.out.println("-".repeat(20));
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-".repeat(20));
		System.out.println("시작합니다.");
		
		//RedPen 클래스의 메소드를 사용하기 위해 배열 객체 생성
		RedPen[] quest = new RedPen[questCount];
		
		//각 인덱스 초기화 및 부호입력 후 문제 생성
		for (int i = 0; i < quest.length; i++) {
			quest[i] = new RedPen('+');
			quest[i].make();
			System.out.print(quest[i].problem());
			result[i] = sc.nextInt();
		}
		
		for (int i = 0; i < quest.length; i++) {
			if(quest[i].answer() == result[i]) {
				quest[i].setCorrect(true);
				correctCount +=1;
			}
			else quest[i].setCorrect(false);
		}
		//줄바꿈
		System.out.println("-".repeat(20));
		System.out.println(String.format("채점합니다. 맞은 갯수 %d/%d(%d)점",correctCount,quest.length,correctCount*(100/quest.length)));
		System.out.println(":::틀린문제 정답 보기:::");
		for (int i = 0; i < quest.length; i++) {
			if(quest[i].isCorrect()==false) {
				System.out.println(String.format("문제%d. %d %c %d = %d", i+1,quest[i].getN1(),quest[i].getOp(),quest[i].getN2(),quest[i].answer()));
			}
		}
		
		
		
	}//main end
	
	
}//main class end

