package ex230629;

import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		int count = 1;
		int answer = (int) (Math.random() * 100 + 1);
		while (true) {
			try {
				System.out.print("1~100 사이의 숫자를 맞혀보세요 :");
				num = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("숫자를 제대로 입력해주세요.");
				continue;
			}

			if (num > answer)
				System.out.println("DOWN");
			else if (num < answer)
				System.out.println("UP");
			else if (num == answer) {
				System.out.println("정답입니다." + count + "회 안에 맞혔어요.");
				break;
			}
			count++;
		}

	}
}

/*
 * "1~100 사이에 숫자를 맞춰보세요 : 50 Down 1~100 사이에 숫자를 맞춰보세요 : 25 UP 1~100 사이에 숫자를
 * 맞춰보세요 : 43 Down 1~100 사이에 숫자를 맞춰보세요 : 30 UP 1~100 사이에 숫자를 맞춰보세요 : 35 정답입니다.5회
 * 만에 맞췄어요."
 * 
 */