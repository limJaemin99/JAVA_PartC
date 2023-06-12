package partC.day17.BeAble;

public class AI implements Thinkable{
	
	protected char op;
	
	@Override
	public void think() {
		System.out.println("학습된 정보를 수집해서 알려드립니다.");
	}

	@Override
	public int calculate(int a, int b) {
		int result=0;
		boolean isTrue=true;
		
		while(isTrue) {
		switch(op) {
		case '+':
			result = a+b;
			isTrue = false;
			break;
		case '-':
			result = a-b;
			isTrue = false;
			break;
		case '*':
			result = a*b;
			isTrue = false;
			break;
		case '/':
			result = a/b;
			isTrue = false;
			break;
		default :
			op='+';
			
			//throw 사용하여 잘못된 op 필드값은 오류를 발생. (op필드의 초기값 = ' ')
//			throw new IllegalArgumentException("Unexpected value : "+op);
		}
		}
		return result;
	}

	@Override
	public String beAble() {
		return "Thinkable";
	}
	
	
	
}
