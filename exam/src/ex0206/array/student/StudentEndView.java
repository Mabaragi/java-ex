package ex0206.array.student;

public class StudentEndView {
	/**
	 *  전체 검색 결과 출력
	 */
	public static void printSelectAll(Student[] studentArray) {
		System.out.println("*******학생의 정보 (" + StudentService.count + ")명****");
		for (int i = 0; i < StudentService.count; i++) {
			System.out.printf("이름: %s, |", studentArray[i].getName());
			System.out.printf("나이: %s, |", studentArray[i].getAge());
			System.out.printf("주소: %s\n", studentArray[i].getAddr());			
		}
	}
	
	/**
	 *  이름에 해당하는 학생 정보 출력
	 */
	public static void printSelectByName(Student student) {
		if (student == null) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		System.out.printf("이름: %s, |", student.getName());
		System.out.printf("나이: %s, |", student.getAge());
		System.out.printf("주소: %s\n", student.getAddr());			
	
	}
	/**
	 *  요청결과의 성공여부 메시지 출력
	 */
	public static void printMessage() {
		
	}
}
