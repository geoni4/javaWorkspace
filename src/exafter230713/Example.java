package exafter230713;



class DBox<Key, Value>{
	Key k;
	Value v;
	public void set(Key k, Value v) {
		this.k = k;
		this.v = v;
	}
	@Override
	public String toString() {
		return k.toString() + " & " + v.toString();
	}
	
	
	
}

public class Example {
	public static void main(String[] args) {

		DBox<String, Integer> box = new DBox<String, Integer>();       
        box.set("Apple", 25);
        System.out.println(box.toString()); 
        // Apple & 25
        
        

	}
}
