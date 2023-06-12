package partC.day19.review;

public class Rabbit extends Animal {
	
	static final String TYPE ="토끼";	//상수 필드명이 부모에 있는것과 동일하지만 상관 없다.
	
	@Override
	public String getType() {
		return "토끼";
	}

	
	@Override
	public void sound() {
		System.out.println(super.getColor() + "토끼는 🐰🐰조용합니다.");
	}

}
