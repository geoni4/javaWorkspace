package test;


interface Shape{
	public double getArea();
}

class Circle implements Shape{

	private int rad;
	
	public Circle(int rad) {
		this.rad = rad;
	}

	@Override
	public double getArea() {
		return rad*rad*Math.PI;
	}
	
}

class Rectangle implements Shape{
	private int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height;
	}
}

public class Test5 {
	public static void main(String[] args) {
		Shape[] shape = { new Circle(10), new Rectangle(10, 20) }; // 
		double area = 0; 
		for (Shape s : shape) { 
		area = area + s.getArea(); 
		} 
		System.out.println(area); 
	}
}
