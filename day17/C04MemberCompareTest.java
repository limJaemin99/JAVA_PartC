package partC.day17;

import java.util.Arrays;

//Member 객체의 compare(비교)
public class C04MemberCompareTest {
	public static void main(String[] args) {
		
		Member m1 = new Member("김OO", 23);
		Member m2 = new Member("최OO", 20);
		
		System.out.println("m1 참조객체와 m2 참조객체를 비교할 수 있나요?");
		System.out.println("답 : 객체 자체로는 비교 불가. 객체의 특정 필드로 비교해야함.");
		
		
		System.out.println("\n2. 객체의 특정 필드로 어떻게 비교할 수 있나요?");
		System.out.println("답 : Member 클래스를 비교할 수 있는 클래스로 구현한다.");
		
		//name 비교 : 음수 (김 < 최), age 비교 : 3 (23 > 20)
		System.out.println("m1과 m2를 비교 : "+m1.compareTo(m2));
		
		//name 비교 : 양수 (최 > 김), age 비교 : -3 (20 < 23)
		System.out.println("m2와 m1을 비교 : "+m2.compareTo(m1));
		
		
		//같은 내용이 들어있는 compareTo
		System.out.println("\n※같은 내용이 들어있는 compareTo");
		String str = "abcd";
		System.out.println("abcd 와 a : "+str.compareTo("a"));		//3
		System.out.println("abcd 와 ab : "+str.compareTo("ab"));	//2
		System.out.println("abcd 와 abc : "+str.compareTo("abc"));	//1
		System.out.println("abcd 와 abcd : "+str.compareTo("abcd"));	//0
		//위와 같이 기준값에 비교대상이 포함되어있을 경우 서로의 ★문자열 길이의 차이값을 리턴★해준다.
		
		
		
		System.out.println("\n3. 이렇게 비교하는 것은 정렬(sort)에 사용된다.");
		int[] numbers = {56,34,89,45,99,88};
		String[] names = {"김OO","김XX","최OO","박OO","정OO","이OO"};
		
		Arrays.sort(numbers);
		Arrays.sort(names);
		System.out.println("int 배열 정렬 결과\n"+Arrays.toString(numbers));
		System.out.println("String 배열 정렬 결과\n"+Arrays.toString(names));
		
		
		Member[] members = new Member[5];
		members[0] = m1;
		members[1] = m2;
		members[2] = new Member("정OO", 22);
		members[3] = new Member("최XX", 21);
		members[4] = new Member("이OO", 25);
		
		//Member 클래스에 재정의된 compareTo 있으므로 sort 할 수 있다.
		Arrays.sort(members);
		System.out.println("Member 배열 정렬 결과\n"+Arrays.toString(members));
		//compareTo가 있으면 sort는 무조건 compareTo메소드 내에서 비교한 변수를 기준으로 오름차순/내림차순 한다.
		
		
		//Comparable<Member> 은 Member클래스를 Comparable 로 하겠다.
		//<T> 제너릭 타입으로 설정
		//고정된 필드로 compareTo를 미리 코드에 작성해야하며 정렬 필드를 변경하려면
		//하드 코딩(노가다)으로 변경해줘야 한다.
			//▶ Comparator 인터페이스로 sort 실행 시점에서 필드를 결정할 수 있게 변경한다.
		
		
		
	}//main end
}//main class end
