package exafter230718;

import java.util.HashSet;



class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode 들어옴");
		System.out.println("name : " + name + " age : " + age);
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Person)obj).name);
	}

	@Override
	public String toString() {
		return name + "("+ age+"세)";
	}
}

public class Example {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
        hSet.add(new Person(new String("LEE"), 10));
        hSet.add(new Person(new String("LEE"), 10));
        hSet.add(new Person(new String("PARK"), 35));
        hSet.add(new Person(new String("PARK"), 35));

        int iii = 3; 
        double ddd = (double)iii;
        System.out.println(iii);
        System.out.println(ddd);
        System.out.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet);
        //저장된 데이터 수: 2
        //[LEE(10세), PARK(35세)]
	}
}
