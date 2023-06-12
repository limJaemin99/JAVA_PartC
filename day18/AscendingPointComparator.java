package partC.day18;

import java.util.Comparator;
//얘는 이름이 있는 클래스다 (익명클래스가 아님X)
//익명 클래스와 비교하면 소스파일과 이름이 있다.
									//비교자를 구현한 클래스 정의 (익명클래스를 사용하지 않음)
//오름차순 방식으로 정렬하는 비교자			//↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
public class AscendingPointComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return (int)(o1.getPoint()-o2.getPoint());
	}
	
	
	
}
