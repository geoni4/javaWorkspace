package ex230703;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		
		
		for(int i =1 ;i<=10;i++) {
			numList.add(i);
		}
		int sum=0;
		for(int n: numList)
			sum += n;
		System.out.println(sum);
	}
}
