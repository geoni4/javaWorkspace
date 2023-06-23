import java.util.Scanner;

class RectangleArr{
	private int width;
	private int height;
	
	public RectangleArr(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}
}

public class RectangleArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		RectangleArr[] rectArr = new RectangleArr[2];
		
		
		for(int i =0;i<rectArr.length; i++) {
			System.out.println((i+1) +"번째 사각형");
			System.out.print("폭을 입력하세요: ");
			int width = scanner.nextInt();
			System.out.print("높이를 입력하세요: ");
			int height = scanner.nextInt();
			rectArr[i] = new RectangleArr(width, height);
			System.out.println((i+1)+"번재 사각형의 넓이 : " + rectArr[i].getArea());
			System.out.println();
		}
		
		double sumArea = 0;
		
		for(int i = 0 ; i <rectArr.length ; i++) {
			sumArea += rectArr[i].getArea();
		}
		System.out.println("사각형 넓이의 총합: " + sumArea);
		
	}
}
