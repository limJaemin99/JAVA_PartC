package partC.day18;

import java.util.Arrays;
import java.util.Comparator;

//Member 객체의 compare(비교)
public class C07UserComparatorTest {
	public static void main(String[] args) {
		
		User m1 = new User("김OO", 23);
		User m2 = new User("최OO", 20);
		
		
		System.out.println("\n1. 기본타입 배열 정렬(sort)에 사용된다.");
		int[] numbers = {56,34,89,45,99,88};
		String[] names = {"김OO","김XX","최OO","박OO","정OO","이OO"};
		
		Arrays.sort(numbers);
		Arrays.sort(names);
		System.out.println("int 배열 정렬 결과\n"+Arrays.toString(numbers));
		System.out.println("String 배열 정렬 결과\n"+Arrays.toString(names));
		
		
		System.out.println("\n2. User 타입 배열 정렬 - Comparator(비교자) 인터페이스 사용");
		User[] users = new User[5];
		users[0] = m1;
		users[1] = m2;
		users[2] = new User("정OO", 22);
		users[3] = new User("최XX", 21);
		users[4] = new User("이OO", 25);
		
		//비교할 기준이 없으므로 sort() 에서 오류 발생
//		Arrays.sort(users);
		
		//위에서 String 배열은 sort()가 된 이유?
			//String 클래스는 이미 Comparable 인터페이스를 구현했다.
		
		System.out.println("\n[★중요★]");
		System.out.println("[users 배열 초기 상태] "+"━".repeat(30)+"┓"+"\n"+Arrays.toString(users));
		System.out.println("━".repeat(49)+"┛"+"\n");
		
		
		System.out.println("★User 클래스 객체의 sort 기능을 위해 비교자를 구현한다★");
		System.out.println("int return 조건은 순서(위치)를 교환하지 않는 조건으로 작성한다.\n");
		
		
		
		//asc : 오름차순 , des : 내림차순
		
		//Comparator<User> 인터페이스의 익명내부구현 클래스
		Comparator<User> ascName =new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
				//문자열 compareTo는 사전순 비교 o1 < o2 이면 음수, o1>o2 이면 양수 리턴
			}
		};//ascName 비교자 익명클래스
		
		Arrays.sort(users,ascName);
		System.out.println("[ascName 비교자 적용 정렬 결과] "+"━".repeat(23)+"┓"+"\n"+Arrays.toString(users));
		System.out.println("━".repeat(49)+"┛"+"\n");
		
		
		
		
		
		Comparator<User> desName = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};//desName 비교자 익명클래스
		
		Arrays.sort(users,desName);
		System.out.println("[desName 비교자 적용 정렬 결과] "+"━".repeat(23)+"┓"+"\n"+Arrays.toString(users));
		System.out.println("━".repeat(49)+"┛"+"\n");
		
		
		
		
		
		Comparator<User> ascAge = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o1.getAge()-o2.getAge();
			}
		};//ascAge 비교자 익명클래스
		
		Arrays.sort(users,ascAge);
		System.out.println("[ascAge 비교자 적용 정렬 결과] "+"━".repeat(23)+"┓"+"\n"+Arrays.toString(users));
		System.out.println("━".repeat(49)+"┛"+"\n");
		
		
		
		
		
		Comparator<User> desAge = new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o2.getAge()-o1.getAge();
			}
		};//desAge 비교자 익명클래스
		
		Arrays.sort(users,desAge);
		System.out.println("[desAge 비교자 적용 정렬 결과] "+"━".repeat(23)+"┓"+"\n"+Arrays.toString(users));
		System.out.println("━".repeat(49)+"┛"+"\n");

		
		users[0].setPoint(1234.23);
		users[1].setPoint(945.33);
		users[2].setPoint(888.11);
		users[3].setPoint(9991.23);
		users[4].setPoint(3456.67);

		//얘는 별로 안쓴다(또한 compareTo를 override하는 방법도 잘 사용하지 않는다)
		Arrays.sort(users,new AscendingPointComparator());	//sort 메소드 2번째 인자는 업캐스팅이다. 
		System.out.println("\npoint 필드 오름차순 비교자 구현 클래스 적용 정렬 = \n"+Arrays.toString(users));
		
		
		//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★//
		//아래와 같이 사용하는 것이 가장 많이 사용하는 유형이다.//
		//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★//
		Arrays.sort(users,
				new Comparator<User>(){
					@Override
					public int compare(User o1, User o2) {
					return (int)(o2.getPoint()-o1.getPoint());
				}
		});
		System.out.println("\n point 필드 내림차순 비교자 sort 메소드 2번째 인자로 익명 구현 = \n"+Arrays.toString(users));
		
	}//main end
}//main class end
