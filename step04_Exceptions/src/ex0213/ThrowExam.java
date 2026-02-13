package ex0213;

public class ThrowExam {
	public static void main(String[] args) {
		System.out.println("-------메인 시작-----------");
		try {
			new Test().aa(0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안된다.");
		}
		System.out.println("-------메인 끝 -----------");
	}
}

class Test{
	public void aa(int i) {
		System.out.println("aa 시작");
		try {
			this.bb(i);
		} finally {
			System.out.println("aa 끝");				
		}
		
	}
	public void bb(int i) {
		System.out.println("bb 시작");
		try {			
			int result = 100/i;
			System.out.println("result = " + result);
		} finally {
			System.out.println("bb 끝");			
		}
	}
}

