
class Gugudan2{
	public void printGugu(int n) {
		for(int i =1;i<=n;i++) {
			for(int j =1;j<10;j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}


class GetSum2{
	
	int num;
	
	public void setNum(int n) {
		this.num = n;
	}
	
	public int sum() {
		int sum = 0;
		for(int i = 1;i<=num;i++) {
			sum += i;
		}
		return sum;
	}
	
	
}


class Grade2{
	int kor;
	int eng;
	int math;
	
	
	
	public Grade2(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public double getAvg() {
		return (kor + eng + math) / 3.0;
	}
	
	public char getGrade() {
		double avg = getAvg();
		
		char grade ='가';
		
		if( avg >= 90.0) {
			grade='수';
		} else if(avg >= 80.0) {
			grade='우';
		} else if(avg >= 70.0) {
			grade='미';
		} else if(avg >= 60.0) {
			grade='양';
		} else {
			grade='가';
		}		
		return grade;
	}
	
}

public class MainClass2 {
	public static void main(String[] args) {
//		Gugudan2 gugudan2 = new Gugudan2();
//		gugudan2.printGugu(10);
//		gugudan2.printGugu(20);
		
//		GetSum2 getsum2 = new GetSum2(); // 1)객체 생성
//		int num; // 2)num 변수 선언
//
//		num = 100;
//
//		getsum2.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장
//
//		num = getsum2.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
//		System.out.println(num);
//
//		getsum2.setNum(1000);
//		num = getsum2.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
//		System.out.println(num);
		
		
//		- 클래스 Grade
//		- 데이타멤버 : 국어, 영어,수학,총점,평균
//		- 함수 : 생성자//국어영어수학 초기화
//		- getAvg() // 평균
//		- getGrade() //평균에 따른 수우미양가
		
//		Grade2 kim = new Grade2(60, 80, 90);
//		System.out.println(kim.getAvg());
//		System.out.println(kim.getGrade());
//		
//		Grade2 lee = new Grade2(50, 40, 20);
//		System.out.println(lee.getAvg());
//		System.out.println(lee.getGrade());
//		
//		Grade2 choi = new Grade2(90, 90, 80);
//		System.out.println(choi.getAvg());
//		System.out.println(choi.getGrade());
		
//		TV2 myTV = new TV2("LG", 2017, 32);
//		myTV.show();
//		//LG 에서 만든 2017년형 32인치 TV
		
		Song2 song = new Song2("Dancing Queen", "ABBA", 1978, "스웨덴");
		
		song.show();
		
	}
}



class Song2{
	String title;
	String artist;
	int year;
	String country;
	
	public Song2() {
	}
	
	public Song2(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "년, " + country + " 국적의 " + artist + "가 부른 " + title);
	}
	
}



class TV2{
	String maker;
	int year;
	int size;
	
	
	public TV2(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}


	public void show() {
		System.out.println(maker + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

