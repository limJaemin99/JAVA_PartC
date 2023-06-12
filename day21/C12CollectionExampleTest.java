package partC.day21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C12CollectionExampleTest {
	
	public static void main(String[] args) {
		
		//List 는 데이터를 순서(순차적 처리)를 갖도록 저장하며 인덱스 사용한다.동일한 값을 중복하여 저장할 수 있다. 
		//List 의 구현 클래스 ? ArrayList , Vector , LinkedList
		System.out.println("1. 리스트");
		List<String> list = new ArrayList<>();	//업캐스팅
		list.add("트와이스");
		list.add("뉴진스");
		list.add("에스파");
		list.add("소녀시대");
		list.add("원더걸스");
		list.add("뉴진스");
		System.out.println("list 의 크기 = " + list.size());		//6
		System.out.println("list 에 저장된 문자열 = " + list);		//[트와이스, 뉴진스, 에스파, 소녀시대, 원더걸스, 뉴진스]
		for(int i=0;i<list.size();i++)	//순서(index)를 갖고 있으므로 for문 사용 가능
			System.out.println(String.format("list[%d] 의 값 = \"%s\"", i,list.get(i)) );
		
		
		//Set(집합) 은 데이터 저장에 순서가 없다. 동일한 값을 중복하여 저장할 수 없다.
		//Set 인터페이스의 구현 클래스 ? HashSet , LinkedHashSet , TreeSet
		System.out.println("\n2. Set");
		Set<String> set = new HashSet<>();	//HashSet 을 LinkedHashSet 으로 변경해서 차이점을 보세요.
//		Set<String> set = new LinkedHashSet<>();	//데이터가 추가되는 순서를 표현할 수 있다.
		set.add("트와이스");
		set.add("뉴진스");
		set.add("에스파");
		set.add("소녀시대");
	 	set.add("원더걸스");
		set.add("뉴진스");
		System.out.println("set 의 크기 = " + set.size());	//5
		System.out.println("set 에 저장된 문자열 = " + set);	//출력순서는 컴퓨터마다 다르게 무작위
		
		//set 은 list의 get() 메소드와 같은 역할의 메소드가 없습니다.
		System.out.println("== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
		Iterator<String> setIterator = set.iterator();	//데이터를 가져오는 집게(iterator) 생성
				//<String> ▶ 가져오는 데이터의 형식
		int cnt =0;
		while(setIterator.hasNext()) {	//반복자(iterator)를 이용한 데이터 접근
			String temp =setIterator.next();
			System.out.println("cnt = " + cnt++ + ", 값 = " + temp);
		}
			
		
		//대표적인 map의 예시 : 객체의 식별값 해시코드(key)로 객체의 메모리 주소(value)를 찾아 데이터에 접근
				//객체가 생성되면 메모리에 할당됨 ▶ 주소 생성 ▶ 해시함수를 실행하면 해시코드 생성됨
				//해시테이블이라는 메모리 영역에 key와 value를 저장한다.
		//Map 은 key-value 한쌍으로 데이터를 저장하며 , key를 이용하여 value를 가져올 수 있다. 
		//		 key는 동일한 값을 중복하여 저장할 수 없다.
		//Map 인터페이스의 구현 클래스 ? TreeMap , HashMap , LinkedHashMap
		System.out.println("\n3. Map");
		Map<String,String> map = new HashMap<>();
		map.put("tw", "트와이스");
		map.put("nu", "뉴진스");
		map.put("as", "에스파");
		map.put("gr", "소녀시대");
		map.put("tw", "원더걸스");
		map.put("js", "뉴진스");
		System.out.println("map 의 크기 = " + map.size());	//5
		System.out.println("map 에 저장된 문자열 = " + map);	//key - "tw" 의 값은 "원더걸스" (두번째 값이 입력됨)
		System.out.println("== Iterator 반복자를 이용한 set 의 값 가져오기 ==");
		
		Set<String> keySet = map.keySet(); Iterator<String> tempItr = keySet.iterator();
		Iterator<String> mapIterator = map.keySet().iterator();	//↑위의 두개 문장을 합친 것↑
		//keySet() 메소드는 map에서 key 만으로 Set(집합)을 만들 수 있다.
		cnt =0;
		while(mapIterator.hasNext()) {	//집합에서만 iterator를 사용할 수 있다. (Map 자체는 iterator 사용 불가)
			String temp =mapIterator.next();	//temp = key 값
			System.out.println(String.format("count=%d , key= %s , value=%s", cnt++,temp,map.get(temp)));
		}
		
		System.out.println("[그냥 출력하면 key값이 출력된다] ");
		for (String str : keySet) {
			System.out.print(str+" ");
		}
		
		//List, Set, Map 모두 <> 안에 데이터의 타입을 지정한다(제너식 타입)
			//기본형은 래퍼 클래스 사용한다. 모든 타입을 클래스(참조)타입으로 한다.
		
		
	}

}
