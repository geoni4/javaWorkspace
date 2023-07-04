package ex230630;


class Box6<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
}

class BoxFactory2{
	public static <T> Box6<T> makeBox(T t){
		Box6<T> box = new Box6<T>();
		box.set(t);
		return box;
	}
}


public class ExampleMain3 {
	public static void main(String[] args) {
		Box6<String> sBox = BoxFactory2.<String>makeBox("Sweet");
        System.out.println(sBox.get());

        
        Box6<Double> dBox = BoxFactory2.<Double>makeBox(7.59);
        System.out.println(dBox.get());
	}
}
