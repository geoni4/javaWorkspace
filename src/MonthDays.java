import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("년도를 입력하세요. (정수)");
		
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		boolean leap = false;
		
		if( year % 4 == 0) {
			leap =true;
		}
		if( year % 100 == 0) {
			leap = false;
		}
		if(year % 400 == 0) {
			leap = true;
		}
		
		
		int[] months = {31, 28, 31, 30, 31, 30,
					31, 31,	30, 31, 30, 31};
		if(leap == true) {
			months[1] +=1;
		}

		if(month >= 1 && month <= 12) {
			System.out.println(year + "년 " + month + "월의 일수는 "+months[month-1] +"일 입니다.");
		} else {
			System.out.println("년도와 월을 제대로 입력해주세요.");
		}
	}
}
