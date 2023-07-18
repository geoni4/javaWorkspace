package exafter230717;

import java.util.ArrayList;
import java.util.List;

class DBox<K, V>{
	K key;
	V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value= value;
	}

	@Override
	public String toString() {
		return key.toString() + " & " + value.toString();
	}
	
	
}

class Box<T>{
	T t;

	public Box(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}

class BoxFactory{
	public static <T> Box<T> makeBox(T t){
		Box<T> box = new Box<T>(t);
		return box;
	}
}

class Circle{
	int rad;

	public Circle(int rad) {
		this.rad = rad;
	}
	
	public double getArea() {
		return rad*rad*Math.PI;
	}
}
public class Example {
	public static void main(String[] args) {
		List<Circle> circleList = new ArrayList<>();
				circleList.add(new Circle(10));
				circleList.add(new Circle(20));
				circleList.add(new Circle(30));
		double sum =0;
		for(Circle circle: circleList) {
			sum += circle.getArea();
		}
		System.out.println(sum);
        //반지름이 각각 10,20,30 원을 List에 넣어서 
        //총 넓이를 구하시오."
        //1.부터 10 까지(List 에 넣어서)의 합을 
        //구하시오.
	}
}
