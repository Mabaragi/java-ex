package ex0211.inheritance;

public class InheritanceExam {
	public static void main(String[] args) {
		System.out.println("hello");
	}
}

class Car{
	public String carname;
	public int cost;
	
	protected void printAttributes() {
		System.out.println("carname="+carname+"\tcost="+cost);
	}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성
// 각 클래스에 인수를 받지않는 생성자 작성
// 각 클래스의 생성자의 구현부에 carname과 cost에 적당한 값 할등

class EfSonata extends Car{
	int efSonataVersion = 100;
	
	public EfSonata() {
		this.carname = "EfSonata";
		this.cost = 1_000_000;
	}
}

class Excel extends Car{
	
	public Excel() {
		this.carname = "Excel";
		this.cost = 1_500_000;
	}
}

class Carnival extends Car{
	
	public Carnival() {
		this.carname = "Carnival";
		this.cost = 1_800_000;
	}
}