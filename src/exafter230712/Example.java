package exafter230712;


class Circle  {// c1
	String name ;

	public Circle(String name) {
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		Circle c2 = (Circle)obj;
		boolean true_false = this.name.equals(c2.name);
		return true_false;
	}

	@Override
	public String toString() {
		return name;
	}

}

public class Example {
	public static void main(String[] args) {
        Circle c1 = new Circle(new String("str")); //new String("str")
        Circle c2= new Circle(new String("Circle2")); //new String("str")
        //Rectangle
        System.out.println(c1);
        System.out.println(c2);
	}
}
