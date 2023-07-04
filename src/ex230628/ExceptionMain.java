package ex230628;

import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("정수를 입력하세요 : ");
				int num = Integer.parseInt(scanner.nextLine());
				
				System.out.println(num);
			} catch(Exception e){
				System.out.println("정수를 넣어줘야합니다.");
				
			} finally {
				
			}
		}
		
		
	}
}
