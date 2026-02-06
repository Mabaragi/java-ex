package exam0205.overloading;

import java.lang.reflect.Array;
import java.util.Arrays;

class Test{
	public void aa(int... intArray) {
		for (int elem: intArray) {
			System.out.print(elem);
			System.out.print(", ");
		}
		System.out.println();
		
		String message = Arrays.toString(intArray);
		System.out.println(message);
	}
}

public class MethodVariableArgsExam {
	public static void main(String[] args) {
		Test test = new Test();
		int[] array = {1, 2, 3};
		test.aa(array);
	}
}
