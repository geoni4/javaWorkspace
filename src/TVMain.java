
class TV4{
	private int size;
	
	public TV4(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
}

class ColorTV extends TV4{
	
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(super.getSize() +"인치 "+ color+"컬러");
	}
}

class IPTV extends ColorTV{
	private String address;

	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	
	@Override
	public void printProperty() {
		System.out.print("나의 IPTV는 "  + address + " 주소의 ");
		super.printProperty();
	}
	
}

public class TVMain {
	public static void main(String[] args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
		
		IPTV ipTV = new IPTV("192.1.1.2", 32, 2048);
		ipTV.printProperty();
	}
}
