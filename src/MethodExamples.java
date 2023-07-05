
public class MethodExamples {
	public static void main(String[] args) {
		double area = getCircleArea(10);
		System.out.println(area); // 314.0
		//area = 400.0;
		// 1. getRectangleArea(10, 20);
		// 	double getRectangleArea(int x=10, int y=20) {
		//		return 200;
		//	}
		//  getRectangleArea(10, 20) => 200.0;
		//area = 200.0;
		area = getRectangleArea(10, 20);
		System.out.println(area);	// 200.0;
		
		area = getTriangleArea(40, 20);
		System.out.println(area);
		

	}
	
	
	static double getTriangleArea(int w, int h) {
		return 0.5 * w * h;
	}
	
	static double getRectangleArea(int x, int y) {
		return x*y;
	}
		
	static double getCircleArea(int r) {
		final double PI = 3.14;
		return r*r*PI;
	}
	
}
