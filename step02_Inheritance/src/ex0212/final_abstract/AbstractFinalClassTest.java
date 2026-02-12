package ex0212.final_abstract;

//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{
 final int i = -999999; // 반드시 초기화, 값변경 불가 
}


abstract class AbstractClassExam{ // 상속 가능, 생성 불가
    abstract String abstractMethodExam(int i,String s); // 재정의를 위한 메소드    
    final int finalMethodExam(int i, int j){  // 재정의 불가 final 접근제한다
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	int finalMethodExam2(int i, int j){ // final 메서드는 재정의 불가
		return i*j;
	}
	
}

//class Sample02 extends FinalClassExam{  } // final 클래스는 상속 불가


 
 class Sample03 extends AbstractClassExam{
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }
//	abstract String abstractMethodExam(int i,String s);  // 재정의만 할수 있음

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
//		AbstractClassExam ace = new AbstractClassExam();  // 추상 클래스는 객체 생성 불가능. abstract 메서드 구현이 안되어있어서 사용 못하잖아
		FinalClassExam fce = new FinalClassExam();
//		fce.i=100000; // final 필드는 수정 불가능
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}