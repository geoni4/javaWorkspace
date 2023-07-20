package exafter230720;

public class Example {
	public static void main(String[] args) {
		// 타입
		// 9 기본타입 8

		// 정수형
		// byte short (int) long
		// 1 2 4 8

		// 실수형
		// float (double)

		// 참거짓
		// boolean

		// 문자형
		// (char)
		// 타입 변수명 = 값;
		int age;
		age = 31;
		System.out.println(age);

		int kor = 90;
		int eng = 70;
		int math = 45;
		double avg = (kor + eng + math) / 3.0;
		System.out.println(90 + 70 + 45);
		System.out.println(avg);
		char grade = '가';
		if (avg > 90) {
			grade = '수';
		} else if (avg > 80) {
			grade = '우';
		} else {
			grade = '양';
		}

		System.out.println(grade);

		int num1 = -6;
		int num2 = 10;
		int num3 = 1;

		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println(max);
		/*
		 * 12,1,2,3 겨울입니다. 4,5,6 봄입니다. 7,8 여름 입니다. 9,10,11 가을입니다.
		 */
		int month = 3;
		if (month == 12 || month == 1 || month == 2 || month == 3) {
			System.out.println("겨울입니다.");
		} else if (month == 4 || month == 5 || month == 6) {
			System.out.println("봄입니다.");
		}

//		int i = 0;
//		while(i <= 100) {
//			System.out.println(i);
//			i = i + 1;
//		}
		int num = 20 % 3;
		// 20 / 3 -> 6
		// 20 % 3 -> 2
		// 3 * 6 + 2 -> 20
		// 20 % 2 = 0 --> 짝수
		// 5 % 2 = 1 --> 홀수

		int sum = 0;
		for (int idx = 1; idx <= 100; idx = idx + 1) {
			if (idx % 2 == 0) {
				sum = sum + idx;
			}
		}

		System.out.println(sum);
		int dan = 3;
		for (int i = 1; i <= 9; i++) {
			int result = dan * i;
			System.out.println(dan + " x " + i + " = " + result);
		}

	}
}
