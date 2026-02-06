package exam0205.staticex;


class Test {
	int a; // 전역변수
	static int b; // 전역변수 b
}

public class StaticVariableExam {
	public static void main(String[] args) {
		System.out.println("메인 시작");
	    Test test1 = new Test();
	    Test test2 = new Test();
	    Test test3 = new Test();
	    
	    System.out.println("test1 = " + test1);
	    System.out.println("test2 = " + test2);
	    System.out.println("test3 = " + test3);
	    
	    System.out.println("non static 접근");
	    
	    System.out.println("test1.a = " + test1.a);
	    System.out.println("test2.a = " + test2.a);
	    System.out.println("test3.a = " + test3.a);
	    
	    test2.a = 100;
	    
	    System.out.println("test1.a = " + test1.a);
	    System.out.println("test2.a = " + test2.a);
	    System.out.println("test3.a = " + test3.a);
	    
	    System.out.println("스태틱 접근");
	    
	    System.out.println("test1.b = " + test1.b);
	    System.out.println("test2.b = " + test2.b);
	    System.out.println("test3.b = " + test3.b);
	    
	    test2.b = 50;
	    
	    System.out.println("test1.b = " + test1.b);
	    System.out.println("test2.b = " + test2.b);
	    System.out.println("test3.b = " + test3.b);
	}
}
