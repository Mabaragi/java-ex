package exam0205.array;

class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	static int [] intArray = new int[]{4, 2, 3, 4, 5, 5, 6, 7, 8, 8};

   /*printArrayvalue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
   
	*/
	static void printArrayValue() {
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}
	
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayvalue메소드 호출
		ArrayValue.printArrayValue();
	}
}