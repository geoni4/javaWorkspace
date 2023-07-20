package ex230704;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;


public class DocsExample2 {
	public static void main(String[] args) {
		//아래의 TreeMap의 Value를 확인 하기 위한 소스를 짜시오.(필수)
		//- 순차적으로 나오도록 돌리시오
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> set = map.keySet();
//
//		for(Integer s: set)
//			System.out.println(s + " " + map.get(s).toString());
		
		for(Iterator<Integer> iter = set.iterator(); iter.hasNext();) {
			Integer num = iter.next();
			System.out.println(num + " " + map.get(num));
		}
		
		
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer num = iter.next();
			System.out.println(num + " " + map.get(num));
		}
	}
}
