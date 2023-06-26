import java.util.Scanner;

public class A2DRespectX {
	static Scanner scanner = new Scanner(System.in);
	
	static char respectX[][] = new char[6][6]; 
	
	public static void practice9( ) {
		int row, col;
		
		System.out.print("행 인덱스 입력: ");
		row = scanner.nextInt();
		System.out.print("열 인덱스 입력: ");
		col = scanner.nextInt();
		
		scanner.nextLine();
		respectX[row][col] = 'X';
	
		
		showRespectX();
	}
	
	public static void showRespectX() {
		System.out.print("  ");
		for(int i =0;i<respectX.length;i++) {
			System.out.print( i + " ");
		}
		System.out.println();
		for(int i =0;i<respectX.length;i++) {
			System.out.print(i + " ");
			for(int j =0;j<respectX[i].length;j++) {
				System.out.print(respectX[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String menu;
		while(true) {
			practice9();
			
			System.out.print("계속 하시겠습니까?(y, n) ");
			menu = scanner.nextLine();
			
			if("n".compareToIgnoreCase(menu)== 0 || "no".compareToIgnoreCase(menu) == 0) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
