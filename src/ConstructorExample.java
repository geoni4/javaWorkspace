class TV{
	String maker;
	int year;
	int size;
	
	public TV(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}
	
	void show() {
		System.out.println(maker +"에서 만든 " + year+"년형 " + size+"인치 TV");
	}
	
}

class Song{
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
	}
	
	public Song(String title, String artist, int year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public Song(int year, String country , String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
		
}

public class ConstructorExample {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
		Song song = new Song( "Dancing queen", "ABBA", 1978,  "스웨덴");
		song.show();
		
		song = new Song("Let it be, Hey jude", "beatles", 1963,  "영국");
		song.show();
		
	}
}
