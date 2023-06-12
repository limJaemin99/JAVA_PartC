package partC.day23;

import java.util.HashSet;
import java.util.Set;

public class C19EqualsAndHashcode {
	public static void main(String[] args) {
		
		//동일성(identity) 과 동등성(equality)
		//동일성(identity) : '해시코드값'이 같은가? if 참 = 동일하다
		//동등성(equality) : '지정된 필드값' 이 '모두' 같은가? if 참 = 동등하다
		
		//컬렉션 프레임워크의 set , map 의 key 특징 : 중복된 값이 없음
			//동일성(identity) 과 동등성(equality) 이 모두 '참'이면 같은 값으로 판단.
		
		//일반
		Set<Customer> customers = new HashSet<>();
		
		customers.add(new Customer("momo","김모모",23));
		customers.add(new Customer("jenny","이제니",22));
		customers.add(new Customer("nayeon","박나연",21));
		customers.add(new Customer("gildong","홍길동",27));
		customers.add(new Customer("jenny","이제니",22));
		
		System.out.println("set의 데이터 : \n"+customers);
		System.out.println("set의 데이터 갯수 : "+customers.size());
		
		//@EqualsAndHashCode 으로 hashcode()와 equals()메소드를 재정의했습니다.
			// ▶ 3개의 필드값으로 해시코드 계산하고
			// ▶ 3개의 필드값이 모두 같으면 equals '참'으로 리턴
		
		
		System.out.println("-".repeat(30));
		
		
		//Equals And Hashcode
		Set<CustomerENH> customers2 = new HashSet<>();
		
		customers2.add(new CustomerENH("momo","김모모",23));
		customers2.add(new CustomerENH("jenny","이제니",22));
		customers2.add(new CustomerENH("nayeon","박나연",21));
		customers2.add(new CustomerENH("gildong","홍길동",27));
		customers2.add(new CustomerENH("jenny","이제니",22));
		
		System.out.println("set의 데이터 : \n"+customers2);
		System.out.println("set의 데이터 갯수 : "+customers2.size());
		
		
		
		//EqualsAndHashCode 재정의 없는 클래스
		Customer c1 = new Customer("jenny", "이제니", 22);
		Customer c2 = new Customer("jenny", "이제니", 22);
		System.out.println("Customer 동일성 = "+(c1.hashCode() == c2.hashCode()));	//false
		System.out.println("Customer 동등성 = "+ c1.equals(c2));	//false
		
		
		//EqualsAndHashCode 재정의 한 클래스
		CustomerENH cs1 = new CustomerENH("jenny", "이제니", 22);
		CustomerENH cs2 = new CustomerENH("jenny", "이제니", 22);
		System.out.println("Customer 동일성 = "+(cs1.hashCode() == cs2.hashCode()));	//true
		System.out.println("Customer 동등성 = "+ cs1.equals(cs2));	//true
		System.out.println(cs1 == cs2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end
}//main class end
