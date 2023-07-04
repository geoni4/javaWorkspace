package ex230629;


class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		if(person.name.equals(this.name) && person.age == this.age)
			return true;
		return false;
	}
	
	
}
	

public class PersonMain {
	public static void main(String[] args) {
		Person kim = new Person("홍길동",35);
		Person park = new Person(new String("홍길동"),35);
		Person heo = new Person("홍길동",34);
		        
		if(kim.equals(park))
		        System.out.println("같은 사람입니다.");
		else
		        System.out.println("다른 사람입니다.");
		if(kim.equals(heo))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
	}
}

/*
=========================
같은사람입니다."
다른사람입니다.
*/