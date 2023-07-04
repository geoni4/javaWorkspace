package ex230628;



class Member{
	private String color;

	public Member(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		Member Mcolor = (Member) obj;
		if(this.color.equals(Mcolor.color)) {
			return true;
		}
		return false;
	}
}

public class MemberMain {
	public static void main(String[] args) {
		Member obj1 = new Member("Black");
		Member obj2 = new Member("Black");
		Member obj3 = new Member("White");

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출력"
		
	}
}
/*
"
*/