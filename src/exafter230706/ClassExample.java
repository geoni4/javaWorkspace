package exafter230706;


class Person {
	String name;
	int age, height, weight;
	

	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	void showInfo() {
		System.out.println("이름: "+name +",나이: " +age+",키: " + height+ ",몸무게: " +weight);
	}
}

class Song{
	String title, composer, year;
	int length;
	
	void play() {
		System.out.println("제목: " + title+", 작곡가: " + composer + ", 발매년도: " + year + ", 재생시간: " + length);
	}
}

public class ClassExample {
	public static void main(String[] args) {

		Person lee = new Person("이원건", 32, 172, 63);
		lee.showInfo();
		lee.name = "이아무개";
		lee.showInfo();
		//		lee.printPerson();
		
		Person kim = new Person("김용현", 23, 185, 70);
		// kim
		// - String name;
		// - int age, height, weight;
		// - Person(name, age, height, weight)
		// - void printPerson();
		Song song = new Song();
		// song
		// - String title, composer, year;
		// - int length;
		// - void play();
		
		song.play();
		
		

	}
}



