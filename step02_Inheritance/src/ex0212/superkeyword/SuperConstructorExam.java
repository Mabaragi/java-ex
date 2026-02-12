package ex0212.superkeyword;

class Parent{
	Parent() {
		System.out.println("Parent default Constructor");
	}
	Parent(int i){
		System.out.println("Parent int Constructor");
	}
}
/////////////////////////////////////
class Child  extends Parent{//Child은 Parent , Object이다 
	Child(){
		super();
	   System.out.println(4);
	}
	Child(int i){
		//super();
	   System.out.println(5);
	}
	Child(boolean b){
		//super();
		System.out.println(6);
	}
}
////////////////////////////////////////////////////////
public class SuperConstructorExam {
	public static void main(String[] args) {
		new Child();// 1 4
		new Child(10);// 1 5
		new Child(true); //1 6
		/* 모든 자식생성자 구현부 첫번째 줄에 super()생략되어있다.*/
		
		///////////////////////////////////////////////////////
		//만약, 부모의 생성자 하나도 없다면 
		//new Child(); // 4
		//new Child(10); //5
		//생성자를 하나도 작성하지 않으면 기본생성자 자동으로 삽입
		
		////////////////////////////////////////////
	}

}



