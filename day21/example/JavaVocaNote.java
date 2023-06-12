package partC.day21.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

//VocaNoteBook의 구현클래스
public class JavaVocaNote implements VocaNoteBook{

	//단어장의 기능을 정의한 인터페이스 사용하기
	
	
	//파일에서 읽어온 데이터를 저장할 자료구조가 필요하다.
	private Map<String, JavaVoca> voca;
	
	public JavaVocaNote() {	//데이터를 1개씩 map에 추가할 때 어떤 방식으로 저장할 것인지?
		voca = new TreeMap<>();			//(Key값 기준)오름차순
//		voca = new HashMap<>();			//랜덤
//		voca = new LinkedHashMap<>();	//원본 순서대로
	}
	
	@Override
	public Map<String, JavaVoca> getVoca() {
		return voca;
	}//getVoca end
	
	@Override
	public void load(String path) {	//파일에서 단어들 불러오기
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			
			while(fsc.hasNext()) {
			String temp = fsc.nextLine();	
			System.out.println(temp);
			//public		공공의,공적인,대중			Beginner
			//읽어온 문자열로 JavaVoca 객체를 만들어서 map에 저장해야 합니다.
			StringTokenizer stk = new StringTokenizer(temp,"\t_");
			String name = stk.nextToken();
			voca.put(name, new JavaVoca(name, stk.nextToken(), stk.nextToken()));
			}
			
			System.out.println("━━━━━━━━━━━━━━━━━━━━ 단어장 파일 읽어오기 완료 ━━━━━━━━━━━━━━━━━━━━┛");
		} catch (FileNotFoundException e) {
			System.out.println("파일로부터 읽어오기 - 입력 예외 : "+e.getMessage());
		} finally {
			if(fsc != null) fsc.close();
		}
		
	}//load end
	
	@Override
	public void add(JavaVoca vo) {
		voca.put(vo.getEnglish(), vo);
	}//add end
	
	@Override
	public void print() {
		System.out.println("━".repeat(75));
		System.out.println(String.format("%-20s\t%-20s\t%-20s", "JAVA 단어","뜻","level"));
		System.out.println("-".repeat(75));
		for (String key : voca.keySet()) {
			//Set 출력은 iterator 나 for-each문으로만 가능(map의 key값만으로 set을 만들어야한다)
			JavaVoca vo = voca.get(key);	//key값으로 value를 가져오기
			System.out.println(String.format("%-20s\t%-20s\t%-20s", vo.getEnglish(),vo.getKorean(),vo.getLevel()));
		}
		
		/*
		Set<Map.Entry<String, JavaVoca>> entrySet = voca.entrySet();
	    for (Map.Entry<String, JavaVoca> entry : entrySet) {
	    	System.out.println(entry);
	    }	// entrySet() 을 사용한 방법★★★★★
		*/
		
	}//print end

	@Override
	public List<JavaVoca> group(String level) {	//그룹 검색 메소드
		List<JavaVoca> result = new ArrayList<>();
		//그룹 검색은 key값만으로 안되고 하나씩 검사과정이 필요합니다.
		level = switch(level) {
		case "1" -> "Beginner";
		case "2" -> "Intermediate";
		case "3" -> "Advanced";
		default -> throw new IllegalArgumentException("Unexpected value : "+level);
		};
		for (String key : voca.keySet()) {
			JavaVoca vo = voca.get(key);
			if(vo.getLevel().equals(level)) result.add(vo);
		}
		return result;
	}


	@Override
	public void save(String path) {	//★★★★★★★★★★★숙제 내용★★★★★★★★★★★
		 try {
		        PrintWriter writer = new PrintWriter(new FileWriter(path));
		        for (JavaVoca vo : voca.values()) {
		            writer.println(vo);
		        }
		        writer.close();
		        System.out.println("단어장이 성공적으로 저장되었습니다.");
		    } catch (IOException e) {
		        System.out.println("파일 저장 중 오류가 발생했습니다 : " + e.getMessage());
		    }
	}//save end
	
	/* 선생님이 작성하신 save 메소드
	@Override
	public void save(String path) {	//Map 에 있는 데이터를 파일로 저장하기
		File file = new File(path);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
	//		pw.println(voca);		//출력 테스트용
	//Map 데이터 1개를 1줄로 출력하기: Map 데이터 1개식 가져오기는 iterator 또는 향상 for 사용
			Iterator<String> iterator = voca.keySet().iterator();
			while(iterator.hasNext()) {
				String key = iterator.next();    //Map의 key
				JavaVoca vo = voca.get(key);	 //key 로 가져온 value
				pw.println(vo);		//JavaVoca의 toString 리턴 문자열로 출력하니 확인해보세요.!!
			}
			System.out.println("단어 " +  voca.size() +" 개를 파일에 저장했습니다.");  //Map->파일에 저장
			System.out.println("정상적으로 단어장 파일 저장하기 끝!!");
		}catch (Exception e) {
			System.out.println("파일에 저장하기 - 출력 예외 : " + e.getMessage());
		}finally {
			if(pw !=null) pw.close();
		}
	*/
	
	
	
	
}
