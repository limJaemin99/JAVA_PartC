package partC.day22;

public class Customer {
	
	//홍길동		서울시 서초구(VIP)
	//강쯔위		경기도 성남시 분당구(직원)
	//이모모		서울시 종로구 종로1가(일반고객)
	//위와 같은 데이터를 객체로 생성하기 위한 클래스 정의
		//단, 이름(name)은 중복되지 않도록 한다. ex)홍길동1, 홍길동2
	
	
	//필드
	private String name;
	private String address;
	private String grade;
	
	//생성자
	public Customer(String name, String address, String grade) {
		this.name = name;
		this.address = address;
		this.grade = grade;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%-20s\t%-20s\t%s", name,address,grade);
	}




	//name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Address
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//Grade
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = switch(grade) {
		case "1" -> "일반고객";
		case "2" -> "직원";
		case "3" -> "VIP";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : "+grade);
//		default -> "" 예외로 처리하지 않고 넘어가고싶을때 사용
		};
	}
	
	
	
	
	
	
	
}
