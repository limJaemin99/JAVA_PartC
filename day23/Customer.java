package partC.day23;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
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
public class Customer {
	
	private String id;
	private String name;
	private int age;
	@Override
	public String toString() {
		return "(id=" + id + ", name=" + name + ", age=" + age + ")\n";
	}
	
	


	
	
	
	
	
}
