package partC.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import partC.day18.RedPen;

public class RedPenMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//day18 예제에서 배열 사용을 ArrayList 로 바꾸겠습니다.
		
		
		List<Integer> result = new ArrayList<>();	//답변 작성용
		int correctCount=0;
		
		
		System.out.println("초등학교 2학년을 위한 2자리 사칙연산 문제 프로그램 빨간펜 입니다.");
		System.out.println("-".repeat(20));
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-".repeat(20));
		System.out.println("시작합니다.");
		
		//앞으로 List 선언은 인터페이스 타입으로 합니다.
		RedPen[] quest = new RedPen[5];
		List<RedPen> prob = new ArrayList<>();	//업캐스팅 , 이 객체는 List에 정의된 메소드만 실행 가능
		
		//각 인덱스 초기화 및 부호입력 후 문제 생성
		for (int i = 0; i < quest.length; i++) {
			prob.add(new RedPen('+'));
			prob.get(i).make();
			System.out.print(prob.get(i).problem());
			result.add(sc.nextInt());
		}
		
		for (int i = 0; i < quest.length; i++) {
			if(prob.get(i).answer() == result.get(i)) {
				prob.get(i).setCorrect(true);
				correctCount +=1;
			}
			else prob.get(i).setCorrect(false);
		}
		//줄바꿈
		System.out.println("-".repeat(20));
		System.out.println(String.format("채점합니다. 맞은 갯수 %d/%d(%d)점",correctCount,quest.length,correctCount*(100/quest.length)));
		System.out.println(":::틀린문제 정답 보기:::");
		for (int i = 0; i < quest.length; i++) {
			if(prob.get(i).isCorrect()==false) {
				System.out.println(String.format("문제%d. %d %c %d = %d", i+1,prob.get(i).getN1(),prob.get(i).getOp(),prob.get(i).getN2(),prob.get(i).answer()));
			}
		}
		
		
		
	}//main end
	
	
}//main class end

