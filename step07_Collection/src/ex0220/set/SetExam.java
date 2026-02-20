package ex0220.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExam {
//	Set<String> set = new HashSet<String>();
//	Set<String> set = new TreeSet<String>();
	Set<String> set = new TreeSet<String>(Collections.reverseOrder());
	
	public SetExam(String [] args) {
		System.out.println("---정보 출력---");
		String[] names = {
			    "희정", "희수", "희진", "희연", "희재", 
			    "수정", "수민", "수아", "수현", "수빈", 
			    "정아", "정윤", "정우", "정현", "정은", 
			    "지수", "지희", "민희", "서희", "나희"
			};
		for (String name : names) {
			set.add(name);
		}
		
		Iterator<String> it = set.iterator();
		
		
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		System.out.println("\n -- 요소 제거 --");
		boolean removed = set.remove("희정");
		System.out.println("저거 결과 = " + removed);
		
		System.out.println("제거 후 : " + set);
	}
	
	public static void main(String[] args) {
		new SetExam(args);
	}
}
