package exam0205.array;

import java.util.Iterator;

class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
	static int[] intArray = new int[5];
	static double[] doubleArray = new double[5];
	static char[] charArray = new char[5];
	static boolean[] boolArray = new boolean[5];
	static String[] stringArray = new String[5];

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	private static void printArrayValue01() {
		for (int i = 0; i < 5; i++) {
			System.out.print(intArray[i] + " ");
		
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(doubleArray[i] + " ");
		
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(charArray[i] + " ");
		
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(boolArray[i] + " ");
		
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			System.out.print(stringArray[i] + " ");
		
		}
		System.out.println();
	}

	
	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	public static void main(String[] args) {
		printArrayValue01();
	}
}