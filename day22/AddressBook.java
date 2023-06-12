package partC.day22;

import java.util.List;
import java.util.Map;



public interface AddressBook {
	
	//기능 정의 - 추가, 등급별 검색, 전체보기 , 파일 입력, 파일 출력
	
	Map<String, Customer> getCustomer();
	void add(Customer name);
	List<Customer> group(String group);
	public void print();
	void load(String path);
	void save(String path);

}
