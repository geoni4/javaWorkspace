package ex230718;

class Circle{
	int rad;

	public Circle(int rad) {
		this.rad = rad;
	}

	public double getArea() {
		return rad*rad*Math.PI;
	}
	
	@Override
	public String toString() {
		return "원의 넓이는 " + getArea() +"이고 반지름은 " +rad+"인 원";
	}
	
	
}

public class GoogleDoxExample2 {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
        
		System.out.println(circle); //원의 넓이는 314.1592 이고 반지름은 10 인원 "
	}
}
