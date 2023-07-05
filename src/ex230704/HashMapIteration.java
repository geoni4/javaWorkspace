package ex230704;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIteration {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> ks = map.keySet();
		
		// 전체 key 출력
		for(Integer n : ks)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		// enhanced for 기반 출력. value만
		for(Integer n : ks)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		
		// iterator 기반 출력
		for(Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			System.out.print(map.get(itr.next()) + '\t');
		}
		System.out.println();
		
		
	}
}
