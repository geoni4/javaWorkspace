package ex230630;

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L o, R r) {
		left = o;
		right = r;
	}

	@Override
	public String toString() {
		return left + " & " + right;
	}
	
	
	
}


public class MultiTypeParam {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<>();
		DBox<Apple, Orange> box2 = new DBox<>();
		box.set("Apple", 25);
		
		
		
		System.out.println(box);
		
		box2.set(new Apple(), new Orange());
		System.out.println(box2);
		
	}
}
