package ex230714;


class TV2{
	String maker;
	int year, size;
	
	public TV2(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.println(maker+"에서 만든 " + year + "년형 "+ size+"인치 TV");
	}
}


public class GoogleDoxExample1 {
	public static void main(String[] args) {
		TV2 myTV = new TV2("LG", 2017, 32);
		myTV.show();
		//LG 에서 만든 2017년형 32인치 TV"
	}
}
