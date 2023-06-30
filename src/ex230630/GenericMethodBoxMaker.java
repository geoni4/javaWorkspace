package ex230630;

class Box4<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	
}

class BoxFactory {
	public static <T> Box4<T> makeBox(T t){
		Box4<T> box = new Box4<>();
		box.set(t);
		return box;
	}
}


public class GenericMethodBoxMaker{
	public static void main(String[] args) {
		Box4<String> sBox = BoxFactory.<String>makeBox("Sweet");
		System.out.println(sBox.get());
		
		Box4<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}
}