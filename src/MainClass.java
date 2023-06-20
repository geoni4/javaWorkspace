import org.w3c.dom.css.Rect;

class Student{
	int age;
	char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


class Rectangle{
	double width, height;
	
	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return width * height;
	}
}


class Circle{
	double radius;
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI; 
	}
	
}



public class MainClass {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setWidthHeight(4, 10);
		
		System.out.println(rect);
		System.out.println(System.identityHashCode(rect));
		System.out.println(rect.getArea());
		
		Rectangle rect2 = new Rectangle();
		rect2.setWidthHeight(10, 10);
		System.out.println(rect2.getArea());

		Rectangle rect3 = new Rectangle();
		rect3.setWidthHeight(20, 5);
		System.out.println(rect3.getArea());
		
		
		
		
		Circle circle = new Circle();
		
		circle.setRadius(10);
		
		System.out.println(circle.getArea());
		
	}
}
