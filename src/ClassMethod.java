
class A {
	public void a() {
		System.out.println("함수 a");
	}
}

class Person {
	private int regiNum;
	private int passNum;

	public Person(int regiNum, int passNum) {
		this.regiNum = regiNum;
		this.passNum = passNum;
	}

	public Person(int regiNum) {
		this(regiNum, 0);
	}

	void showPersonalInfo() {
		System.out.print("주민등록번호 : " + regiNum);
		if (passNum != 0)
			System.out.println(" 여권 번호 : " + passNum);
		else
			System.out.println(" 여권 없음");

	}

}

class TV3{
	String maker;
	int year;
	int size;
	
	
	
	public TV3(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}



	void show() {
		System.out.println(maker + "에서 만든 " + year + "년형 "+size+"인치 TV");
	}
}


class Accumulator{
	private static int sum =0;
	
	public static void add(int i) {
		sum += i;
	}
	
	public static void showResult() {
		System.out.println("최종 값 : " +sum);
	}
}

public class ClassMethod {
	
	
	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++)
	         Accumulator.add(i); // 전달되는 값을 모두 누적

	      Accumulator.showResult(); // 최종 누적 결과를 출력
		
//		TV3 myTV = new TV3("LG", 2017, 32);
//		myTV.show();
//		//LG 에서 만든 2017년형 32인치 TV;

//		Person jung = new Person(335577, 112233);
//		Person hong = new Person(775544);
//
//		jung.showPersonalInfo();
//		hong.showPersonalInfo();
//
//		A a = new A();
//		a.a();
	}
}
