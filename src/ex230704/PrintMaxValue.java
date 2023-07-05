package ex230704;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrintMaxValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numList = new LinkedList<>();
		int num =0;
		int maxValue=Integer.MIN_VALUE;
		System.out.print("정수(-1)이 입력될 때까지)>> ");
		while(true) {
			try {
				num = scanner.nextInt();
			} catch(Exception e) {
				System.out.println("다시 입력하세요.");
				scanner.nextLine();
				continue;
			}
			if(num == -1) break;
			numList.add(num);
		}
		for(int n : numList) {
			maxValue = maxValue > n ? maxValue : n; 
		}
		System.out.println(numList);
		System.out.println("가장 큰 수는 " + maxValue);
		
	}
}
