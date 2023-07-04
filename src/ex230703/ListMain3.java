package ex230703;

import java.util.ArrayList;
import java.util.List;


class Circle{
	private double rad;
	
	public Circle(double rad) {
		this.rad = rad;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
	
}

public class ListMain3 {
	public static void main(String[] args) {
		List<Circle> circleList = new ArrayList<>();
		
		for(int i = 1 ;i<=10;i++) {
			circleList.add(new Circle(i));
		}
		double sum = 0;
		for(Circle c: circleList) {
			sum += c.getArea();
		}
		System.out.println(sum);
	}
}
