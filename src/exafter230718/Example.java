package exafter230718;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



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
//		HashSet<Person> hSet = new HashSet<Person>();
		Map<String, Integer> map = new HashMap<>();
//        hSet.add(new Person(new String("LEE"), 10));
//        hSet.add(new Person(new String("LEE"), 10));
//        hSet.add(new Person(new String("PARK"), 35));
//        hSet.add(new Person(new String("PARK"), 35));
        
        map.put(new String("LEE"), 10);
        map.put(new String("LEE"), 10);
        map.put(new String("PARK"), 35);
        map.put(new String("PARK"), 35);
        
        Set<String> keyset = map.keySet();
        
        Iterator<String> iter= keyset.iterator();
        while(true) {
        	boolean trueOfFalse = iter.hasNext();
        	if(trueOfFalse == false) {break;}
        	String key = iter.next();
        	System.out.println("key : " + key + ", value : " + map.get(key));
        }
        map.entrySet();
        
        
//        int iii = 3; 
//        double ddd = (double)iii;
//        System.out.println(iii);
//        System.out.println(ddd);
//        System.out.println("저장된 데이터 수: " + hSet.size());
//        System.out.println(hSet);
        //저장된 데이터 수: 2
        //[LEE(10세), PARK(35세)]
	}
}
