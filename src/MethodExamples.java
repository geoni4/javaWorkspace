
public class MethodExamples {
	public static void main(String[] args) {
		double area = getCircleArea(10);
		System.out.println(area); // 314.0
		
		area = getRectangleArea(10, 20);
		System.out.println(area);	// 200.0;
		
		area = getTriangleArea(40, 20);
		System.out.println(area);
		
		int code = getAsciiCode('A');
		System.out.println(code);	//65
		
		code = getAsciiCode(' ');
		System.out.println(code);	//32
		
		code = getAsciiCode('\n');
		System.out.println(code);	//10
		
		code = getAsciiCode('1');
		System.out.println(code);	//49

	}
	
	static int getAsciiCode(char ch) {
		return (int)ch;
	}
	
	
	static double getTriangleArea(int w, int h) {
		return 0.5*w*h;
	}
	
	static double getRectangleArea(int x, int y) {
		return x*y;
	}
	
	static double getCircleArea(int r) {
		final double PI = 3.14;
		return r*r*PI;
	}
	
}
