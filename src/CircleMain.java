

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
		return "Rectangle4 [width=" + width + ", height=" + height + "]";
	}
	
	
	
}

public class CircleMain {
	public static void main(String[] args) {
		Rectangle4 rect = new Rectangle4();
		
		rect.setWidth(-5);
		System.out.println(rect.toString());
	}
}
