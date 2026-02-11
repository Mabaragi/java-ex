package ex0211.enum_test;

public class EnumExam {
	public static void main(String[] args) {
		Grade g = Grade.BASIC;
		print(g);
	}
	
	private static void print(Grade g) {
		System.out.println(g.getName());
	}
}
