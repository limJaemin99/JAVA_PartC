package partC.day20;

public class Score {
	private final String name;
	private final int java;
	private final int python;
	private final int html;
	private char grade;	//getGrade()로 충분하지만 그냥 만들어놓음
	
	//생성자
	public Score(String name, int java, int python, int html) {
		this.name = name;
		this.java = java;
		this.python = python;
		this.html = html;
	}
	
	//인스턴스 메소드
	public int sum() {
		return java+python+html;
	}
	
	public double average() {
		return (double)sum()/3;
	}
	
	//getter
	public char getGrade() {
		
		if(average() >= 90) this.grade = 'A';
		else if(average() >= 80) this.grade = 'B';
		else if(average() >= 70) this.grade = 'C';
		else this.grade = 'D';
		return grade;
	}

	@Override
	public String toString() {	//grade 부분에 \0 == null 을 의미한다.
		return "Socre [이름=" + name + ", java=" + java + ", python=" + python + ", html=" + html + ", grade=" + (grade=='\0'? getGrade():grade) + "]";
	}											
	
	
	
}
