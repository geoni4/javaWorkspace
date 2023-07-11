package exafter230711;

import java.io.PrintStream;

class B {
	int num = 3;

	public int add(int a, int b) {
		return 2 * (a + b);
	}
}


class Circle implements Shape{
	int rad;

	public Circle(int rad) {
		this.rad = rad;
	}

	@Override
	public double getArea() {
		return rad*rad*Math.PI;
	}

	
	
}



class Triangle implements Shape{
	int width = 10;
	int height = 20;

	
	public Triangle(int a, int b) {
		this.width = a;
		height = b;
	}
	
	@Override
	public double getArea() {
		return width * height /2.0;
	}
	
}

class Rectangle implements Shape{
	int width;
	int height;
	
	public Rectangle(int a, int b){
		width = a;
		height = b;
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
}

interface Shape{
	public double getArea();
}

public class Example {
	public static void main(String[] args) {

        Shape[] shape = { new Circle(10), new Rectangle(10, 20), new Triangle(10, 20) };

        //
        for(Shape s: shape)
        	System.out.println(s.getClass().getName() + " : " + s.getArea());
	}
}

class TV {
	private int size;

	public TV(int size) { this.size = size; }

	public int getSize() {
		return size;
	}
}
