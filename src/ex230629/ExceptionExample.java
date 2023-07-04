package ex230629;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random()*100+1);
		int num = 0;
		int count =1;
		while(true) {
			System.out.println("1~100 사이의 숫자를 맞혀보세요");
			try {
				num = Integer.parseInt(scanner.nextLine());
			}catch(Exception e) {
				System.out.println("제대로 숫자를 입력하세요.");
				continue;
			}
			if(num > answer)		System.out.println("DOWN");
			else if(num < answer)	System.out.println("UP");
			else if(num == answer) break;
			count++;
		}
		System.out.println("정답입니다. "+ count+"회 만에 맞췄어요.");
	}
}
