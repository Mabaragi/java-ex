package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListExam01 extends ArrayList<Integer>{
 

	public ListExam01() {
		this(5);
		super.add(10);
		this.add(5);
		add(7);
		add(5);
		super.add(7);
		this.add(10);
		System.out.println(this.size());
		
//		for (int i = 0; i < this.size(); i++) {
//			System.out.println(this.get(i));
//		}
		
		System.out.println(this.toString());
//		System.out.println(this.remove((Integer)10));
		
		System.out.println(this.toString());
		
		System.out.println(this.toString());
		
	}	
	
	public ListExam01(int initialCapacity) {
		super(initialCapacity);
	}
	
 	public static void main(String[] args) {
 		ListExam01 list = new ListExam01();
 	}
 
}