package ex230630;

// java 5 이전의 코드는 어노테이션이 붙을 수 없다.
class Apple{

	@Override
	public String toString() {
		return "I am an apple.";
	}
	
}

class Orange{

	@Override
	public String toString() {
		return "i am an orange.";
	}
	
}

class Box{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}


class Box2<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
	
}


// generic = 타입을 컴파일 시점에서 미리 정하고 들어감
public class FruitAndBox2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		// 모든 Object가 들어갈 수 있기 때문에 일단 문자열도 들어갈 수 있다.
		
		aBox.set("Apple");
		
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
		
		
		
		Box2<Apple> aBox2 = new Box2<>();
		Box2<Orange> oBox2 = new Box2<>();
		
		aBox2.set(new Apple());
		oBox2.set(new Orange());
		
		Apple ap2 = aBox2.get();
		Orange og2 = oBox2.get();
		
		System.out.println(ap2);
		System.out.println(og2);
		
		
		
		
		
	}
}
