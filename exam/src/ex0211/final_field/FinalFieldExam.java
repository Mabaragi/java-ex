package ex0211.final_field;

public class FinalFieldExam {
	int i; //인스턴스 필드 0
	
	//final 필드는 반드시 명시적 초기화 필수
	//객체 생성시 값을 초기화 가능
	final int j;
	static final int k;
	
	// static 블록에서 초기화 가능
	static {
		k=100;
	}
	
	public static void main(String[] args) {
		// static 필드 접근
		System.out.println(FinalFieldExam.k);
		FinalFieldExam fe = new FinalFieldExam();
		System.out.println(fe.i);
		System.out.println(fe.j);
		System.out.println(fe.k);
		
		fe.i=20;
//		fe.j=30; //변경 불가
//		fe.k=40; //변경 불가
	}
	
	public FinalFieldExam() {
		j=10;
	}
	public FinalFieldExam(int j) {
		this.j = j;
	}
	
}
