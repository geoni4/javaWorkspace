package ex230703;

import java.util.ArrayList;
import java.util.List;

public class ListMain2 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		strList.add("Spring");
		strList.add("Summer");
		strList.add("Fall");
		strList.add("Winter");
		int sum =0;
		for(String str: strList) {
			sum += str.length();
		}
		
		System.out.println(sum);
		
	}
}
