package partC.day22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class CustomerAddressBook implements AddressBook{

	//Customer 객체들을 저장할 컬렉션필드 Map과
	//AddressBook 인터페이스 기능을 구현하기
	
	//필드
	private Map<String, Customer> customer;
	
	//생성자
	public CustomerAddressBook() {
		customer = new TreeMap<>();
	}
	
	
	
	
	@Override
	public Map<String, Customer> getCustomer() {
		return customer;
	}//getCustomer end

	@Override
	public void add(Customer cs) {
		customer.put(cs.getName(), cs);
	}//add end

	@Override
	public List<Customer> group(String grade) {
		List<Customer> result = new ArrayList<>();
		grade = switch(grade) {
		case "1" -> "일반고객";
		case "2" -> "직원";
		case "3" -> "VIP";
		default -> throw new IllegalArgumentException("Unexpected (value = 1 or 2 or 3) : "+grade);
//		default -> "" 예외로 처리하지 않고 넘어가고싶을때 사용
		};
		
		for (String key : customer.keySet()) {
			Customer cs = customer.get(key);
			if(cs.getGrade().equals(grade)) result.add(cs);
		}
		
		return result;
	}//group end

	@Override
	public void print() {
		System.out.println("━".repeat(55));
		System.out.println(String.format("%-20s\t%-20s\t%s", "이름","주소","등급"));
		System.out.println("-".repeat(55));
		for (String key : customer.keySet()) {
			Customer cs = customer.get(key);
			System.out.println(String.format("%-20s\t%-20s\t%s", cs.getName(), cs.getAddress(), cs.getGrade()));}
		}//print end

	@Override
	public void load(String path) {
		File file = new File(path);
		Scanner fsc = null;
		try {
			fsc = new Scanner(file);
			
			while(fsc.hasNext()) {
				String temp = fsc.nextLine();	
				System.out.println(temp);
				StringTokenizer stk = new StringTokenizer(temp,"\t_");
				String name = stk.nextToken();
				customer.put(name, new Customer(name, stk.nextToken(), stk.nextToken()));
			}
			System.out.println("━━━━━━━━━━━━━━━━━ 고객 주소 파일 읽어오기 완료 ━━━━━━━━━━━━━━━━━┛");
		} catch (FileNotFoundException e) {
			System.out.println("▶ 파일로부터 읽어오기 - 입력 예외 : "+e.getMessage());
		} finally {
			if(fsc != null) fsc.close();
		}
	}//load end




	@Override
	public void save(String path) {
		File file = new File(path);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(file);
			Iterator<String> iter = customer.keySet().iterator();
			while(iter.hasNext()) {
				String key = iter.next();
				Customer cs = customer.get(key);
				pw.println(cs);
			}
			System.out.println("▶ 고객 주소가 정상적으로 저장되었습니다.");
		} catch (Exception e) {
			System.out.println("▶ 파일 저장 중 오류가 발생했습니다 : \"+e.getMessage()");
		} finally {
			if(pw != null) pw.close();
		}
		
		
	}

	
	/*
	@Override
	public void save(String path) {
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(path));
			for (Customer cs : customer.values()) {
				writer.println(cs);
			}
			writer.close();
			System.out.println("▶ 고객 주소가 정상적으로 저장되었습니다.");
		} catch (IOException e) {
			System.out.println("▶ 파일 저장 중 오류가 발생했습니다 : "+e.getMessage());
		}
	}//save end
	*/
	
	
	
	
	
}
