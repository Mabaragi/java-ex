package ex0220.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	Map<Integer, String> map = new HashMap<Integer, String>();
	
	public MapExam() {
		map.put(10, "희정");
		map.put(30, "너정");
		map.put(15, "너수");
		
		System.out.println("저장된 개수: " + map.size());
		System.out.println("map = " + map);
		
		// 모든 key 정보 가져온다
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while (it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(key + "와 " +value);
		}
	}	
	public static void main(String[] args) {
		new MapExam();
	}	
}
