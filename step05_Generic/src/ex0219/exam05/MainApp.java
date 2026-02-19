package ex0219.exam05;

public class MainApp {
	
	public static void main(String[] args) {
		
		Course course = new Course();
		Person person = new Person();
		Worker worker = new Worker();
		Student student = new Student();
		MiddleStudent middleStudent = new MiddleStudent();
		HighStudent highStudent = new HighStudent();
		
		System.out.println("-1. ? 모든 타입 허용 ------------------------");
		course.register01(new Applicant<Person>(person));
		
		
		System.out.println("-2. ? super wordker 허용 ------------------------");
		
		
		System.out.println("-3. ? extends Student 허용 ------------------------");
	}
	
	
}

