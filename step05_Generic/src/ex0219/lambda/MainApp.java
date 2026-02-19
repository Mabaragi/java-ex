package ex0219.lambda;

public class MainApp {
	public static void main(String[] args) {
		//1. 기존 방식
//		AInterface ai = new Test();
//		ai.aa();
		
		//2. AnnonymousInnerType 으로 작성 (익명)
//		AInterface ni = new AInterface() {			
//			public void aa() {
//				System.out.println("fdsafdsa");
//			}
//		};
		
		//3. 람다식 
		AInterface ai = ()->System.out.println("");
		
		//인수가 있는 람다식
		BInterface bi = (a)->System.out.println();
		
		// 인수와 리턴이 있는 경우
		CInterface ci = (a, b)->{return a*b;};
		ci.cc(3, 4);
		
		// 인수가 있는 람다식 함수
		func((a)->{
			System.out.println(a);
			System.out.println(a+a);
		});
		
		// 리턴 있는 람다식 함수
		System.out.println(func2((a, b)->a+b));
	}
	
	static void func (BInterface bi) {
		bi.bb(1);
	}
	
	static int func2(CInterface ci) {
		return ci.cc(4, 3);
	}
}


class Test implements AInterface{
	@Override
	public void aa() {
		System.out.println("Test의 aa 구현 메소드입니다.");
	}
}