package ex230704;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocsExample3 {
	public static void main(String[] args) {
		
		List<Integer> numList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			num = 0;
			try {
				num = scanner.nextInt();
			}catch(Exception e) {
				scanner.nextLine();
				System.out.println("정수를 다시 입력하세요.");
				continue;
			}
			if(num == -1) break;
			
			numList.add(num);
			
		}
		int maxValue = Integer.MIN_VALUE;
		for(Integer n : numList)
			maxValue = maxValue > n ? maxValue : n;
		System.out.println(numList);
		System.out.println("가장 큰 수는 " + maxValue);
		
		
//		"Scanner 클래스로 -1이 입력될 때까지 
//		양의 정수를 입력 받아 저장하고 
//		검색하여 가장 큰 수를 출력하는 
//		프로그램을 작성하라.
//		==================
//		정수(-1이 입력될 때까지)>> 10 6 22 6 88 77 -1
//		가장 큰 수는 88"
	}
}
