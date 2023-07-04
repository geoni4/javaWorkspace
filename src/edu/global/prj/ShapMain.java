package edu.global.prj;

import edu.global.prj.shape.Circle;
import edu.global.prj.shape.Rectangle;
import edu.global.prj.shape.Shape;

class Price{
	private double price = 0;	
	
	public Price(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

class Computer extends Price{

	public Computer(double price) {
		super(price);
	}
	
	
}

class Speaker extends Price{

	public Speaker(double price) {
		super(price);
	}
	
	
}


public class ShapMain {
	public static void main(String[] args) {
		Shape[] shape = {new Circle(10.0), new Rectangle(20.0, 10.0)};
		
		for(Shape s : shape) {
			System.out.println(s.getArea());
		}
	}
}
