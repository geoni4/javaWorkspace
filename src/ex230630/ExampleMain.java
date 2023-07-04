package ex230630;

class Box5<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}


public class ExampleMain {
	public static <T extends Number> void swapBox(Box5<T> t1, Box5<T> t2) {
		T tmp = t1.get();
		t1.set(t2.get());
		t2.set(tmp);
	}
	
	public static void main(String[] args) {
		Box5<Integer> box1 = new Box5<>();
		box1.set(99);
		
		Box5<Integer> box2 = new Box5<>();
		box2.set(55);
		
		System.out.println(box1.get()+ " & " +box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());
		
		
	}
}
