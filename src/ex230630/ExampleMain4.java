package ex230630;

class Box7<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
}

class BoxFactory3{
	public static <T> Box7<T> makeBox(T t){
		Box7<T> box = new Box7<>();
		box.set(t);
		return box;
	}
}

public class ExampleMain4 {
	public static void main(String[] args) {
		Box7<String> sBox = BoxFactory3.<String>makeBox("Sweet");
        System.out.println(sBox.get());

        
        Box7<Double> dBox = BoxFactory3.<Double>makeBox(7.59);
        System.out.println(dBox.get());
	}
}
