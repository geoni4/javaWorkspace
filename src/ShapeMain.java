
class ShapeS{
	
	
	public double getArea() {
		return 0;
	}
}

class CircleS extends ShapeS{
	private double radius;

	public CircleS(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}

class RectangleS extends ShapeS{
	private double width, height;

	public RectangleS(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
	
	
}


public class ShapeMain {
	public static void main(String[] args) {
		ShapeS[] shape = { new CircleS(10), new RectangleS(10, 20) };
		
		//
		double area = 0;
		
		for (ShapeS s : shape) {
			area = area + s.getArea();
		}
		
		System.out.println(area);
		
	}
}
