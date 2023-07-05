package test;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();
		
		while(true) {
			lotto.add((int)(Math.random()*45+1));
			
			if(lotto.size()>=6) break;
		}
		System.out.println(lotto);
	}
}
