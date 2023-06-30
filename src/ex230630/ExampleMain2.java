package ex230630;


class DBox2<S, N>{
	private S str;
	private N num;
	
	public void set (S s, N n) {
		str = s;
		num =n;
	}

	@Override
	public String toString() {
		return str +" & " + num;
	}
}

public class ExampleMain2 {
	public static void main(String[] args) {
		DBox2<String, Integer> box = new DBox2<String, Integer>();        
        box.set("Apple", 25);
        System.out.println(box);// Apple & 25
	}
}
