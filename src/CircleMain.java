

class Rectangle4{
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(width < 0)
			return;
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height <0 )
			return;
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return getClass().getName() + " [width=" + width + ", height=" + height + "]";
	}
	
	
	// int num = (int) 3.14;
	@Override
	public boolean equals(Object obj) {
		Rectangle4 rect = (Rectangle4) obj; // 자식 = 부모 되는 케이스 : 자식 = (자식)부모 캐스팅해서 부모에 있는 주소에 자식이 미리 메모리에 올라가 있어야 함
		if(this.width == rect.width && this.height == rect.height) {
			return true;
		}
		return false;
	}
	
	
	
}

public class CircleMain {
	public static void main(String[] args) {
		Rectangle4 rect = new Rectangle4();
		
		rect.setWidth(-5);
		System.out.println(rect.toString());
	}
}
