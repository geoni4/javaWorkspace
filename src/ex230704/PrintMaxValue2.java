package ex230704;

import java.util.Scanner;

public class PrintMaxValue2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =0;
		int maxValue = Integer.MIN_VALUE;
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true) {
			try {
				num = scanner.nextInt();
			}catch(Exception e) {
				System.out.println("정수를 입력하세요.");
				continue;
			}
			if(num == -1) break;
			maxValue = maxValue > num ? maxValue : num; 
		}
		System.out.println("가장 큰 수는 " + maxValue);
		
	}
}
