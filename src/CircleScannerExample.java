import java.util.Scanner;

class CircleEx {
	double r;

	public CircleEx(double r) {
		this.r = r;
	}

	double getArea() {
		return r * r * Math.PI;
	}

}

class RectangleEx {
	double width;
	double height;

	public RectangleEx(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

}

public class CircleScannerExample {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		double r = scanner.nextDouble();
//		
//		CircleEx circle = new CircleEx(r);
//		
//		System.out.println(circle.getArea());
		while (true) {
			System.out.print("가로 길이: ");
			double width = scanner.nextDouble();
			System.out.print("세로 길이: ");
			double height = scanner.nextDouble();

			RectangleEx rect = new RectangleEx(width, height);

			System.out.println("넓이 : " + rect.getArea());
			System.out.println();
			System.out.print("계속하시겠습니까? (yes, no)");
			
			
			scanner.nextLine();
			String menu = scanner.nextLine();
			System.out.println();
			
			if( "yes".compareToIgnoreCase(menu) == 0 || "y".compareToIgnoreCase(menu) == 0)
				continue;
			else 
				break;
		}
		System.out.println("종료되었습니다.");
	}
}