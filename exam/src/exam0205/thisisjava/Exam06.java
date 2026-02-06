package exam0205.thisisjava;

class Parent{
	public String name;
	
	public Parent() {
		this("대한민국", "여성");
		System.out.println("Parent() call");
	}
	
	
	
	public Parent(String name, String sex) {
		System.out.println("Parent(name) call");
		this.name = name;
	}

}

class Child extends Parent{
	public int studentNo;
	
	public Child() {
		this.studentNo = 1;
	}
	
	public Child(String name, int studentNo) {
		super();
		this.studentNo = studentNo;
		System.out.println();
	}
}


public class Exam06 {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.name + ", " + child.studentNo);
	}   
}
