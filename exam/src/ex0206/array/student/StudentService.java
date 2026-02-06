package ex0206.array.student;

/**
 * 학생의 정보를 관리 하는 서비스(등록, 수정, 검색,....)
 * */
public class StudentService {
	
	// 학생의 정보를 저장할 배열
	private int maxStudentCount = 10;
	Student[] studentArray= new Student[maxStudentCount];
	public static int count = 0; // 배열에 저장된 객체의 개수를 체크하는 필드
	
	/**
	 * 초기치데이터 3명 정도 세팅하기 
	 * */
	public void init(String[][] studentsInfo) {
		for (int i = 0; i < studentsInfo.length; i++) {
			Student student = createStudent(studentsInfo[i]);
			this.insert(student);
		}
	}
	
	
	/**
	 *  Student 객체를 생성해서 리턴해주는 메소드 작성
	 * */
	private Student createStudent(String[] studentInfo) { //{"name", "age", "addr"}
		Student student = new Student();
		student.setName(studentInfo[0]);
		student.setAge(Integer.parseInt(studentInfo[1]));
		student.setAddr(studentInfo[2]);
		return student;
	}
	

	 /**
	   학생의 정보 등록하기 
	    : 배열의 경계를 벗어나면 더이상 추가할수 없습니다. 메시지출력.
	      추가가 성공하면 "등록되었습니다" 메시지를 출력
	    @return: 1이면 성공, 0이면 중복, -1이면 배열 경계 벗어남
	  **/
	public int insert(Student student) {
		// 범위 체크
		if (this.count >= this.maxStudentCount) {
			return -1;
		}
		// 중복 체크
		if (this.selectByName(student.getName())!=null) {
			return 0;
		}
		studentArray[count] = student;
		count++;
		return 1;
	}
		
	
	/**
	 * 전체 학생의 정보 조회하기
	 * */
	public Student[] selectAll() {
//		System.out.printf("|%5s|%5s|%5s|", "이름" , "나이", "주소");
//		System.out.println();
//		this.printStudentInfo(0, this.count);
		return this.studentArray;
	}
	
	/**
	 * 이름에 해당하는 학생의 정보 검색하기
	 *  : 이름에 해당하는 학생이 있으면 학생의 이름, 나이, 주소를출력하고
	 *     없으면 "찾는정보가 없습니다." 출력한다.
	 *  @return 찾은 학생의 정보 Student 리턴, 없으면 null 리턴
	 * */
	public Student selectByName(String queryName) {
		for (int i = 0; i < count; i++) {
			Student student = studentArray[i];
			if (student.getName().equals(queryName)) {
//				printStudentInfo(i, i+1);
				return student;
			}
		}
		// 찾지 못했을 경우
//		System.out.println("찾는정보가 없습니다.");
		return null;
		
	}
	private void printStudentInfo(int startIndex, int lastIndex) {		
		System.out.printf("|%5s|%5s|%5s|", "이름" , "나이", "주소");
		System.out.println();
		for (int i = startIndex; i < lastIndex; i++) {
			Student student = studentArray[i];
			System.out.printf("|%5s|%5d|%5s|", student.getName(), student.getAge(), student.getAddr());
			System.out.println();
		}
	}
	
	/**
	 * 이름에 해당하는 학생의 나이와 주소 변경하기 
	 *  : 이름에 해당하는 학생이 있는지 찾아서 없으면 "수정할수 없습니다." 출력
	 *   있으면  setAge() , setAddr() 이용해서 전달된 인수의 값으로 변경하고
	 *   "수정되었습니다" 출력
	 *   @param : Student
	 *   @return : boolean
	 * */
	public boolean update(Student student) {
		Student targetStudent =this.selectByName(student.getName()); 
		if (targetStudent!=null) {
			targetStudent.setAge(student.getAge());
			targetStudent.setAddr(student.getAddr());
			return true;
		}					
		return false;
	}
	 

}

