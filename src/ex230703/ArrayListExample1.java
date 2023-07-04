package ex230703;

import java.util.ArrayList;
import java.util.List;




public class ArrayListExample1 {
	public static void main(String[] args) {
		List<Circle> circleList = new ArrayList<>();
		
		circleList.add(new Circle(10));
		circleList.add(new Circle(20));
		circleList.add(new Circle(30));
		
		double sum = 0;
		
		for(Circle c: circleList)
			sum += c.getArea();
		System.out.println(sum);
	}
}
