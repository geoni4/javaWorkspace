package exafter230710;


class A{
	public static int add(int a, int b) {
		return a+b;
	}
}

class B extends A{
	int b = 3;
	
	public static int add(int a, int b) {
		return (a+b)*2;
	}
	
}


public class StaticExample {
	static String str = "asdfas";

	public static void main(String[] args) {
		
		str ="asdfasdf";
		B b = new B();
		A a = new A();
		System.out.println(a.add(3, 5));
		Example e = new Example();
		System.out.println(e);
	}
}

class Example extends Object{

//	@Override
//	public String toString() {
//		return "이건 example";
//	}
	
}