package ex0219.list;

import java.util.ArrayList;
import java.util.List;

public class ListExam02{
	
	List<Integer> list = new ArrayList<Integer>(5);  

	public ListExam02() {
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
		
		System.out.println(list.toString());
	}
	
 	public static void main(String[] args) { 		
 		new ListExam02();
 	}
 
}
