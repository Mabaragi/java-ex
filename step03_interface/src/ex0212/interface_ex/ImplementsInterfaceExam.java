package ex0212.interface_ex;

//이 소스를 컴파일이 되도록 수정/추가/주석처리 하세요.
interface InterfaceExam00{
	abstract void interfaceExam00();
}


interface InterfaceExam01 extends InterfaceExam00{
	final int i = 767;
	final int k = 999; // public static final 만 가능. 인터페이스는 상태를 가지면 안된다.
	
	void interfaceExam01(int i, int k);
}



interface InterfaceExam02{
	int j =747;
	int privateInt = 8; //  private 필드 가질수 없음
	private void interfaceExam02(int j) {}  // 인터페이스의 private 메서드는 구현을 가져야함
	
}



class SuperClassExam{
	String superString = "Super";

	String superMethod(){
		System.out.println("SuperClassExam.SuperMethod()가 호출되었습니다.");
		return "returnString";
	}
}

class SubClassExam01 extends SuperClassExam implements InterfaceExam01{ // 인터페이스를 구현해야함

	@Override
	public void interfaceExam00() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceExam01(int i, int k) {
		// TODO Auto-generated method stub
		
	}
	
} 



 class SubClassExam02 extends SuperClassExam // 인터페이스를 구현해야함
				implements InterfaceExam01, InterfaceExam02{

	@Override
	            public void interfaceExam00() {
		        // TODO Auto-generated method stub
		        
	            }

	            @Override
	            public void interfaceExam01(int i, int k) {
		        // TODO Auto-generated method stub
		        
	            }
				

}


abstract class SubClassExam03 extends SuperClassExam // 클래스는 extends 키워드를 써야함 
			implements InterfaceExam01, InterfaceExam02{

	@Override
	        public void interfaceExam00() {
		    // TODO Auto-generated method stub
		    
	        }

	        @Override
	        public void interfaceExam01(int i, int k) {
		    // TODO Auto-generated method stub
		    
	        }
	
}
			

class SubClassExam04 extends SubClassExam02{
	//여기에 필요한 것들을 추가하여 문제를 해결하세요..
	public void interfaceExam00(){}
	public void interfaceExam01(int i, int k){}
	public void interfaceExam02(int j){}

	SubClassExam04(){
		System.out.println("subClassExam04() 객체 생성");
		System.out.println(" i = "+i);
		System.out.println(" j = "+j);
	}
	SubClassExam04(String s1, String s2){
		System.out.println(s1+" 타입 "+"subClassExam04("+s2+") 객체 생성");
		
	}
	void printSuperString(){
//		InterfaceExam01 ie01 = new InterfaceExam01(); // 인터페이스는 초기화 불가능
		

		System.out.println(" superString = "+superString);
	}
}

//여기서부터는 하나도 고치지 마시고 그대로 쓰면 됩니다.
public class ImplementsInterfaceExam{ 
	public static void main(String args[]){		
		SubClassExam02 sub02sub04 = new SubClassExam04("SubClassExam02", "sub02sub04");
		SuperClassExam  superSub04 = new SubClassExam04("SuperClassExam", "superSub04");
		InterfaceExam01 ifc01Sub04 = new SubClassExam04("InterfaceExam01", "ifc01Sub04");
		SubClassExam04 sub04 = new SubClassExam04();
		sub04.interfaceExam00();
		sub04.interfaceExam01(1,7);
		sub04.superMethod();
	}
}
