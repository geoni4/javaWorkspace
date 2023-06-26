import java.util.Scanner;

class RandomArray{
	public static Scanner scanner = new Scanner(System.in);
	private int row, col;

	public RandomArray() {
		setRow();
		setCol();
	}

	public int getRow() {
		return row;
	}

	public void setRow() {
		int row;
		while(true) {
			System.out.print("행 크기: ");
			row = scanner.nextInt();		
			if(row >= 1 && row<=10) break;
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol() {
		int col;
		while(true) {
			System.out.print("열 크기: ");
			col = scanner.nextInt();		
			if(col >= 1 && col<=10) break;
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		this.col = col;
	}
	
	public char[][] createArray() {
		char charArr[][] = new char[getRow()][getCol()];
		for(int i =0;i<charArr.length;i++) {
			for(int j =0;j<charArr[i].length;j++) {
				charArr[i][j] = (char)(Math.random()*26+65);
			}
		}
		return charArr;
	}
	
	public void showArray() {
		char[][] charArr = createArray(); 
		for(int i =0 ;i<charArr.length;i++) {
			for(int j =0;j<charArr[i].length;j++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}


public class RandomArrayMain {
//	public static int getArr() {
//		Scanner sc = null;
//		int num = 0;
//		while(true) {
//			sc = new Scanner(System.in);
//			
//			num = Integer.parseInt(sc.nextLine());
//			if(num >0 && num <= 10) break;
//			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
//		}
//		
//		return num;
//	}
	public static void main(String[] args) {
//		int row, col;
//		char[][] charArr;
//		
//		System.out.print("행 크기: ");
//		row = getArr();
//		System.out.print("열 크기: ");
//		col = getArr();
//		
//		charArr = new char[row][col];
//		
//		for(int i =0;i<charArr.length;i++) {
//			for(int j =0;j<charArr[i].length; j++) {
//				charArr[i][j] = (char)(Math.random() * 26 + 65);
//				System.out.print(charArr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		

		
		RandomArray ra;
		String menu;
		while(true) {
			ra = new RandomArray();
			ra.showArray();
			
			
			
			System.out.print("계속 하시겠습니까? (y,n)");
			RandomArray.scanner.nextLine();
			menu = RandomArray.scanner.nextLine();
			if("no".compareToIgnoreCase(menu) == 0 || "n".compareToIgnoreCase(menu) == 0) {
				break;
			} else {
				
			}
		}
		System.out.println("프로그램 종료");
	}
}
