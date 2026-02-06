package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise12 {
	
	
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (4 * i + 5 * j == 60) {
                    System.out.println("(" + i + ", " + j + ")");
                }
            }
        }
        
        int[] array = new int[400];
        System.out.println(Arrays.toString(array));
        
        
    }
    

}

class NullClass {
	private Integer nullValue;

	public Integer getInteger() {
		return this.nullValue;
	}
}
