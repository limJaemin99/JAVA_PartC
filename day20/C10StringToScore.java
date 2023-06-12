package partC.day20;

import java.util.Arrays;
import java.util.StringTokenizer;

public class C10StringToScore {
	public static void main(String[] args) {
		
		//문자열 1개를 토크나이저로 분리하여 Score 객체 만들기
		
		String str = "모모:90/88/99";
		String[] temp = new String[4];
		
		//Score 객체 생성 초기값을 name = 모모, java = 90, python = 88, html = 99 로 만들어보기
		//1)토크나이저 분리기호 정규식?
		//2)분리된 토큰을 객체의 필드로 주는 방법?
			//문자열을 정수로 변환하는것은 Integer.parseInt(문자열) 리턴값은 정수
		//3)생성된 객체의 필드값 출력하기 (toString)
		
		
		StringTokenizer stk = new StringTokenizer(str,":/");
		
		
		int i = 0;
		while(stk.hasMoreElements()) {
			temp[i++] = stk.nextToken();	//배열에 대입 후 증가(++)
		}
		System.out.println(Arrays.toString(temp));
		
		Score momo = new Score(temp[0],
						Integer.parseInt(temp[1]),	//java
						Integer.parseInt(temp[2]),	//python
						Integer.parseInt(temp[3]));	//html
		System.out.println(momo.toString());
		
		
		
		
		//4) 배열, 반복문 사용하지 않고 만들기
		str = "쯔위:92/77/85";
		stk = new StringTokenizer(str,":/");
		
		Score zuwi = new Score(stk.nextToken(),
				Integer.parseInt(stk.nextToken()),
				Integer.parseInt(stk.nextToken()),
				Integer.parseInt(stk.nextToken()));
		
		
		//같은 말인데 변수에 담은 차이임
//		String a = stk.nextToken();
//		int s1 = Integer.parseInt(stk.nextToken());
//		int s2 = Integer.parseInt(stk.nextToken());
//		int s3 = Integer.parseInt(stk.nextToken());
		
//		Score zuwi = new Score(a,s1,s2,s3);
		
		System.out.println(zuwi.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end
}//main class end