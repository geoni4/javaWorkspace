package ex230704;

import java.util.HashSet;


class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return age;
	}
	@Override
	public boolean equals(Object obj) {
		return name.equals(((Person)obj).name);
	}
	@Override
	public String toString() {
		return name + "(" + age+")";
	}
	
	
}

public class DocsExample {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);
		//저장된 데이터 수: 2
		//[LEE(10세), PARK(35세)]"
	}
}
