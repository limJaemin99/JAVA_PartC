package partC.day19.review;

public class Puppy extends Animal {
	static final String TYPE ="강아지";	//상수 필드명이 부모에 있는것과 동일하지만 상관 없다.
	
	public Puppy() {
	}
	
	public Puppy(String color) {
		super(color);
		//this.setColor(color);
	}
	
	@Override
	public String getType() {
		return "강아지";
	}

	@Override
	public void sound() {
		System.out.println(super.getColor() +" 강아지는 멍멍 🐶🐶하고 짖습니다. ");

	}

	
}
