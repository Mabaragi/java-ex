package exam0205.array;

import java.util.Iterator;

class MultiArray{
	//정수형 2차원 배열 8*9
	private static int[][] array = new int[8][9];
	//메소드이름 :array99
		//for loop 를 사용하여 
		//배열에 곱한 (구구단)결과저장
	public static void array99() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = (i + 2) * (j + 1);
			}
			
		}
		//배열에 결과를 꺼내출력
		for (int[] is : array) {
			for (int i : is) {
				System.out.printf("%2d ", i);
			}
			System.out.println();
		}
	}
			
		
			
			
	}
	public class MemoryApart{
	//main메소드에서 
	//MultiArray객체의 array99메소드호출
		public static void main(String[] args) {
			System.out.println(args);
//			for (int i = 0; i < args.length; i++) {				
//				System.out.print(args[i] + " ");
//				
//			}
//			System.out.println();
			MultiArray.array99();
		}
	}

