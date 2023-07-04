package ex230703;

import java.util.HashSet;
import java.util.Set;

class Num{
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if(num == ((Num)obj).num)
			return true;
		return false;
	}

}

public class SetHashCodeEqualsExample {
	public static void main(String[] args) {
		Set<Num> set = new HashSet<>();
		
		set.add(new Num(4));
		set.add(new Num(8));
		set.add(new Num(12));
		set.add(new Num(16));
		set.add(new Num(20));
		set.add(new Num(24));
		set.add(new Num(28));
		set.add(new Num(32));
		
		System.out.println(set.size());
		
	}
}
