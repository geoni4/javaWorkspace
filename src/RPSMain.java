
import java.util.Arrays;
import java.util.Scanner;

class RockPaperScissors {
	private static String[] rps = new String[] { "가위", "바위", "보" };
	private String counterPart, myValue;

	private static int win, lose, draw;
	private static int versus;

	public RockPaperScissors(String myValue) {
		setCounterPart();
		setMyValue(myValue);
	}

	private String getMyValue() {
		return myValue;
	}

	private void setMyValue(String myValue) {
		for (int i = 0; i < getRps().length; i++) {
			if (Arrays.asList(getRps()).contains(myValue)) {
				this.myValue = myValue;
				return;
			}
		}
		System.out.println("잘못 입력하셨습니다. 임의로 값이 들어갑니다.");
		this.myValue = getRpsValue((int) (Math.random() * getRps().length));
	}

	private void setCounterPart() {
		counterPart = getRpsValue((int) (Math.random() * getRps().length));
	}

	private String getCounterPart() {
		return counterPart;
	}

	public void showResult() {
		System.out.println();
		System.out.println("내가 낸 것 : " + getMyValue());
		System.out.println("상대가 낸 것 : " + getCounterPart());

		System.out.println("결과 : " + versus());
		System.out.println();

		System.out
				.println("현재까지 기록 : " + (getVersus()) + "전 중 " + getWin() + "승 " + getDraw() + "무 " + getLose() + "패");

		System.out.println();

	}

	public static String[] getRps() {
		return rps;
	}

	public static String getRpsValue(int index) {
		return rps[index];
	}

	public static int getWin() {
		return win;
	}

	public static void setWin(int win) {
		RockPaperScissors.win = win;
	}

	public static int getLose() {
		return lose;
	}

	public static void setLose(int lose) {
		RockPaperScissors.lose = lose;
	}

	public static int getVersus() {
		return versus;
	}

	public static void setVersus(int versus) {
		RockPaperScissors.versus = versus;
	}

	private String versus() {
		int length = getRps().length;
		int resultIndex = ((Arrays.asList(getRps()).indexOf(getMyValue())
				- Arrays.asList(getRps()).indexOf(getCounterPart())) % length + length) % length;
		String result = "비겼습니다.";
		setVersus(++versus);
		if (resultIndex == 1) {
			setWin(++win);
			result = "이겼습니다.";
		} else if (resultIndex == 2) {
			setLose(++lose);
			result = "졌습니다.";
		} else {
			setDraw(++draw);
			result = "비겼습니다.";
		}
		return result;
	}

	public static int getDraw() {
		return draw;
	}

	public static void setDraw(int draw) {
		RockPaperScissors.draw = draw;
	}

}

public class RPSMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		RockPaperScissors rps;
		String myValue, menu;
		while (true) {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요. ");
			myValue = scanner.nextLine();

			rps = new RockPaperScissors(myValue);

			rps.showResult();

			System.out.print("계속 하시겠습니까? (yes,y/no,n) ");
			menu = scanner.nextLine();
			if ("yes".compareToIgnoreCase(menu) == 0 || "y".compareToIgnoreCase(menu) == 0) {
				continue;
			} else {
				break;
			}

		}
		System.out.println("프로그램을 종료합니다.");
	}
}
