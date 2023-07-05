package ex230704;

import java.util.HashSet;


class Num{
	private int num;

	public Num(int num) {
		this.num = num;
	}

	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		return num == ((Num)obj).num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	
}

public class GoogleDocsExample2 {
	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println("인스턴스 수: " + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();
	}
}
/*

"                HashSet<Num> set = new HashSet<>();
        set.add(new Num(7799));
        set.add(new Num(9955));
        set.add(new Num(7799));

        System.out.println(""인스턴스 수: "" + set.size());

        for(Num n : set)
            System.out.print(n.toString() + '\t');

        System.out.println();

/*
====출력
인스턴스 수: 2
7799        9955"

*/