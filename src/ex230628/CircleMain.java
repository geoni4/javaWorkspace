package ex230628;

class Circle{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	@Override
	public String toString() {
		return "원의 넓이는 " + getArea() +"이고 반지름은 " + getRadius() +"인 원";
	}
	
}


public class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
        
		System.out.println(circle); //원의 넓이는 314.1592 이고 반지름은 10 인원 "
	}
}
