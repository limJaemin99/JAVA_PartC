package partC.day17;

import java.util.Arrays;

//Member클래스의 객체를 비교 가능하도록 인터페이스 사용하기
public class Member implements Comparable<Member>{
	private String id;
	private String name;
	private int age;
	private double point;
	private String[] message;
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getPoint() {
		return point;
	}
	
	//Comparable<Member> 인터페이스의 추상메소드 정의하기
	@Override
	public int compareTo(Member o) {
		//name 필드로 비교한다면
		return this.name.compareTo(o.getName());
		//this.name 과 인자 객체인 o의 name 비교
	  //----------------------------------------//
		//age 필드로 비교한다면
//		return this.age-o.age;
		//age 필드는 int형이므로 뺄셈식으로 리턴
		
		//만약 o.name/age - this.name/age 을 서로 바꾼다면 내림차순으로 정렬 가능
	}
	
	//객체 필드값 정보 리턴
	@Override
	public String toString() {
		return String.format("[id = %s, name = %s, age = %d, point = %.2f, message = %s]\n",
				id,name,age,point,Arrays.toString(message));
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
