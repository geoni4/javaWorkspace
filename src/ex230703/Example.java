package ex230703;

import java.util.Iterator;
import java.util.LinkedList;

public class Example {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next();
			System.out.println(n + "\t");
		}
		System.out.println();
		
		
	}
}
