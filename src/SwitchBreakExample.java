import java.util.Scanner;

public class SwitchBreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = 0;
		
		String str;
		
		
		System.out.println("1에서 12까지 정수를 입력하세요.");
		str = scanner.nextLine();
		month = Integer.parseInt(str);



		
		
		//12, 1, 2, 3 겨울
		// 4, 5, 6 봄
		// 7, 8 여름
		// 9, 10, 11 가을
		
		switch(month) {
		case 12:
		case 1:
		case 2:
		case 3:
			System.out.println("겨울입니다.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("봄입니다.");
			break;
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘못 입력했습니다. 1에서 12까지 정수를 입력하세요.");
		}
		
		System.out.println("프로그램 종료.");
	}
}
