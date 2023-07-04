package ex230703;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		System.out.println("인스턴스 수: " + set.size());
		
		
		for(Iterator<String> iter = set.iterator(); iter.hasNext();){
			System.out.print(iter.next() + "\t");
		}
		System.out.println();
		
		
		for(String str : set) {
			System.out.print(str + "\t");
		}
		System.out.println();
		
	}
}
