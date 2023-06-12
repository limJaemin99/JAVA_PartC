package partC.day17;

//자바 라이브러리의 비교 기능 인터페이스를 활용하기 위한 선행 연습
public class C03ComparToTest {
	public static void main(String[] args) {
		
		//비교는 sort(정렬) 메소드에서 사용하게 된다.
		
		int num1 = 23;
		int num2 = 45;
		
		System.out.println("1. int 기본 자료형 비교 방식은?");

		System.out.println("num1 = "+num1+", num2 = "+num2);
		System.out.println(num1-num2 < 0);	// 23 - 45 = -22	▶	num1 < num2
		System.out.println(num1-num2 < 0 ? "num1이 num2보다 작다" : "num1이 num2보다 크거나 같다");
		
		System.out.println("-".repeat(30));
		
		num1 = 45;
		num2 = 23;
		System.out.println("num1 = "+num1+", num2 = "+num2);
		System.out.println(num1-num2 < 0);	// 45 - 23 = 22	▶	num1 > num2
		System.out.println(num1-num2 < 0 ? "num1이 num2보다 작다" : "num1이 num2보다 크거나 같다");
		
		System.out.println("\n▶ 결론 : 기본 자료형은 값의 비교를 두 값의 뺄셈 결과와 0을 비교해서 판단한다");
		
		
		
		System.out.println("━".repeat(65));
		
		
		
		
		String name1 = "Kim";
		String name2 = "Lee";
		//문자열은 뺄셈 불가능 ▶ compareTo 메소드 사용
		System.out.println("2. String");
		System.out.println("name1 = "+name1+", name2 = "+name2);
		System.out.println("[K = 11 , L = 12]");
		System.out.println("name1 과 name2 : "+name1.compareTo(name2));	//-1
		System.out.println("name2 와 name1 : "+name2.compareTo(name1));	//1
		System.out.println("name1 과 name1 : "+name1.compareTo(name1));	//0
		System.out.println("name2 와 name2 : "+name2.compareTo(name2));	//0
		System.out.println("(Kim의 'K' 와 Lee의 'L'의 순서의 뺄셈 결과)");
		
		System.out.println("-".repeat(30));

		name1 = "Aaa";
		name2 = "Ggg";
		System.out.println("name1 = "+name1+", name2 = "+name2);
		System.out.println("[A = 1 , G = 7]");
		System.out.println("name1 과 name2 : "+name1.compareTo(name2));	//-6
		System.out.println("name2 와 name1 : "+name2.compareTo(name1));	//6
		System.out.println("name1 과 name1 : "+name1.compareTo(name1));	//0
		System.out.println("name2 와 name2 : "+name2.compareTo(name2));	//0
		System.out.println("(Aaa의 'A' 와 Ggg의 'G'의 순서의 뺄셈 결과)");

		System.out.println("\n▶ 결론 : 문자열은 사전 순서로 비교");
		System.out.println("문자열 name1.compareTo(name2) 결과가 \n"
				+ " - 음수이면 "
				+ "사전 순으로 name1의 문자열이 name2의 문자열보다 앞에 나온다.\n"
				+ " - 양수이면 "
				+ "사전 순으로 name1의 문자열이 name2의 문자열보다 뒤에 나온다.");
		
		
		
		System.out.println("━".repeat(65));
		
		
		
		
		
		
	}//main end
}//main class end




