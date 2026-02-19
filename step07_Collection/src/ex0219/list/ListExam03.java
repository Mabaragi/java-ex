package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListExam03 extends ArrayList<Emp> {

	// 초기치 사원정보 5명 추가
	public ListExam03() {
		this.add(new Emp(1008, "강민준", 31, "서울시 강남구"));
		super.add(new Emp(1002, "이서연", 26, "경기도 성남시"));
		this.add(new Emp(1010, "박지민", 34, "서울시 강남구"));
		this.add(new Emp(1005, "최유진", 29, "부산시 해운대구"));
		this.add(new Emp(1001, "정태양", 32, "경기도 성남시"));
		this.add(new Emp(1007, "윤도현", 27, "서울시 강남구"));
		this.add(new Emp(1003, "한소희", 30, "제주도 제주시"));
		this.add(new Emp(1009, "임채원", 25, "부산시 해운대구"));
		this.add(new Emp(1004, "조현우", 33, "경기도 성남시"));
		this.add(new Emp(1006, "송미경", 28, "서울시 강남구"));
	}
	
	/**
	 * 저장된 모든 사원정보 리턴
	 */
	public List<Emp> selectAll(){
		return this;
	}
	
	/**
	 * 사원번호에 해당하는 사원정보 리턴
	 */
	public Emp selectByNo(int empNo) {
//		for (Emp emp : this) {
//			if (empNo == emp.getEmpno()) {
//				return emp; 	
//			}
//		}
//		return null;
		return this.stream()
					.filter(emp -> emp.getEmpno() == empNo)
					.findFirst()
					.orElse(null);
	}
	
	/**
	 * 주소를 인수로 전달받아 동일한 주소인 모든 사원정보 리턴
	 */
	public List<Emp> selectByAddr(String addr){
//		List<Emp> list = new ArrayList<Emp>();
//		for (Emp emp : this) {
//			if (addr.equals(emp.getAddr())) {
//				list.add(emp);
//			}
//		}
//		return list;
		return this.stream()
				.filter(emp->Objects.equals(emp.getAddr(), addr))
				.toList();
	}
	
	public List<Emp> sortByEmpno(){
		List<Emp> shallowCopy = new ArrayList<Emp>(this);
		//Comparator : 비교 기준을 정의하는 도구 (인터페이스) comparing : 정적 메서드. 비교용 키를 추출하는 공장 
		shallowCopy.sort(Comparator.comparing(Emp::getEmpno));
		return null;
	}

	public static void main(String[] args) {
		ListExam03 list = new ListExam03();
		System.out.println("------------ 모든 사원 출력 ----------");
		System.out.println(list.selectAll());
		System.out.println("------------ 번호해당 사원 출력 ----------");
		int searchNo = 1002;
		System.out.println(searchNo + "번 사원: "+list.selectByNo(searchNo));
		searchNo = 0;
		System.out.println(searchNo + "번 사원: "+list.selectByNo(searchNo));
		System.out.println("------------ 주소해당 사원 출력 ----------");
		System.out.println(list.selectByAddr("서울시 강남구"));
	}
}


