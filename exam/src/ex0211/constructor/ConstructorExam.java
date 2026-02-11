package ex0211.constructor;

class Test{
	
	
	private static final Test t = new Test();
	// 생성자에 접근 제한
	private Test() {};
	
	public static Test getInstance() {
		return t;
	}
}

public class ConstructorExam {
	public static void main(String[] args) {
//		Test test = new Test(); // 생성자로 생성 불가
		Test test = Test.getInstance();
	}
}
