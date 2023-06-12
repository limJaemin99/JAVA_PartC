package partC.day23;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//lombok.jar 사용 예시
//OutLine 참고하며 활용해보기

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor

//@Data	>> 종합

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class CustomerENH {
	
	private String id;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "(id=" + id + ", name=" + name + ", age=" + age + ")\n";
	}
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;	//소수
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {	//this 와 인자로 받은 obj를 비교
		if (this == obj)	//비교 대상과 완전 같은 주소의 객체일때
			return true;
		if (obj == null)	//비교 대상이 null 일때
			return false;
		if (getClass() != obj.getClass())	//클래스 타입이 다르면
			return false;
		
		CustomerENH other = (CustomerENH) obj;	//위의 3가지에 해당하지 않으면 업캐스팅
		if(age != other.age) return false;	//age 필드값이 다를때
		
		if(id == null) {	//this와 비교대상 id가 다를때
			if(other.id != null) return false;
		} else if (! id.equals(other.id)) return false;
		
		if(name == null) {	//this의 name이 null이고 비교대상 name 이 null이 아닐때
			if(other.name != null) return false;
		} else if (! name.equals(other.name)) return false;	//this와 비교대상 name이 다를때
		
		return true;
		//위의 6개 이외의 나머지 경우
		//즉, id 와 name,age 필드값이 모두 같을 때(null 제외)는 '참'
	}
	
	
	
	
	
}
