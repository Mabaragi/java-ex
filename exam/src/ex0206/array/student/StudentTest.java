package ex0206.array.student;

public class StudentTest {
	public static void main(String[] args) {
		Student[] queryStudents;
		Student queryStudent;
		
		System.out.println("***학생 관리 프로그램 시작합니다.******");
		
		String [][] data = new String [][] {
			{"희정", "20", "서울"},
			{"미미", "25", "오리역"},
			{"홍길동", "21", "미금역"},
			{"김철수", "45", "수원"},
			{"이재용", "55", "경기"},		
		};
		
		StudentService service = new StudentService();//StudentService의 전역변수들이 초기화 
		service.init(data); // 초기치데이터 세팅
		
		//전체학생정보 출력
		queryStudents = service.selectAll();
		StudentEndView.printSelectAll(queryStudents);
		
//		//등록하기
		System.out.println("--1. 등록하기 -----");
		Student student = new Student();
		student.setName("미미");
		student.setAge(25);
		student.setAddr("오리역");
//		
//		
		service.insert(student);
//		
		System.out.println("--2. 전체검색 -----");
		queryStudents = service.selectAll();
		StudentEndView.printSelectAll(queryStudents);
//		
//		//이름으로 검색하기
		System.out.println("--3. 이름으로 검색 -----");
		queryStudent = service.selectByName("희정");
		StudentEndView.printSelectByName(queryStudent);
//		
		System.out.println("--이름이 없는경우----");
		queryStudent = service.selectByName("삼순이");
		StudentEndView.printSelectByName(queryStudent);
//		
//		//수정하기 
		System.out.println("--4. 수정하기 -----");
		Student st2 =new Student();
		st2.setName("나영");//조건
		st2.setAge(23);
		st2.setAddr("대전");
//		
		service.update(st2);
		
		System.out.println("---변경후 ---");
		queryStudents = service.selectAll();
		StudentEndView.printSelectAll(queryStudents);

	}

}








