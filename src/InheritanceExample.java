
class A2{
	int a= 10;
	
	public A2() {
		
	}
	
	public A2(int a) {
		this.a = a;
	}
	
	public void aa() {
		System.out.println(a);
	}
	
	
}

class B extends A2{
	
	private int b;
	
	
	public B() {
		
	}
	
	public B (int b) {
		this.b = b;	
	}
	
	public B(int a, int b) {
		this.b = b;
		super.a = a;	// 부모의 멤버에 접근할 때는 보통 super로 접근.
	}
	
	public void bb() {
		System.out.println(b);
		super.aa();
	}
	
	
}

public class InheritanceExample {
	public static void main(String[] args) {
		A2 a = new A2();
		System.out.println(a.a);
		
		B b = new B();
		System.out.println(b.a);
		
	}
}
