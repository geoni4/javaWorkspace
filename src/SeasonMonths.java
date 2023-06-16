
public class SeasonMonths {
	public static void main(String[] args) {
		int month = 6;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
		case 3:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 4:
		case 5:	
		case 6:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 1~12월을 입력해주세요.");
		}
	}
}
