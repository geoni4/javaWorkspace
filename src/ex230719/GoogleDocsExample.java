package ex230719;

class Member{
	String color;

	public Member(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		return this.color.equals(((Member)obj).color);
	}

	
}


public class GoogleDocsExample {
	public static void main(String[] args) {
		Member obj1 = new Member(new String("Black"));
		Member obj2 = new Member(new String("Black"));
		Member obj3 = new Member(new String("White"));

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출력
		

	}
}
