class TV5 {
	private int size;

	public TV5(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}


class ColorTV2 extends TV5{

	private int color;
	
	public ColorTV2(int size, int color) {
		super(size);
		this.color = color;
	}
	
	public void printProperty() {
		System.out.println(super.getSize() + "인치 " + color + "컬러");
	}
	
}

public class TVMain2 {

	public static void main(String[] args) {
		   ColorTV2 myTV = new ColorTV2(32, 1024);
		   myTV.printProperty();
//		"1. 아래 문제를 푸시오.
//		
//		[1번] 다음 main() 메소드와 실행 결과를 참고하여 
//		TV를 상속받은 ColorTV 클래스를 작성하라.
//
//		public static void main(String[] args) {

//		}
//		32인치 1024컬러
//		 "
	}
}
