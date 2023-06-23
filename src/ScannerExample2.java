import java.util.Scanner;

class StudentGrade{
	private String name;
	private double kor;
	private double eng;
	private double math;
	
	public StudentGrade(String name, double kor, double eng, double math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public double getAvg() {
		return (kor + eng + math)/3.0;
	}
	
	public char getGrade() {
		double avg = getAvg();
		char grade='가';
		
		if(avg >= 90.0) {
			grade='수';
		} else if(avg >= 80.0) {
			grade='우';
		} else if(avg >= 70.0) {
			grade='미';
		} else if(avg >= 60.0) {
			grade='양';
		} else  {
			grade='가';
		}
		
		return grade;
		
	}
	
	public void showInfo() {
		System.out.println(name +"님의 평균은 " + getAvg() + "이고 성적은 " + getGrade() + "입니다." );
	}
	
	
}
public class ScannerExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StudentGrade st;
		
		String name;
		double kor;
		double eng;
		double math;
		
		String menu = "no";
		
		while(true) {
			
			System.out.print("이름 : ");
			name = scanner.nextLine();
			System.out.print("국어 : ");
			kor = scanner.nextDouble();
			System.out.print("영어 : ");
			eng = scanner.nextDouble();
			System.out.print("수학 : ");
			math = scanner.nextDouble();
			
			st = new StudentGrade(name, kor, eng, math);
			
			st.showInfo();
			
			System.out.print("계속하시겠습니까? (yes,y/no,n) : ");
			scanner.nextLine();
			menu = scanner.nextLine();
			
			if("yes".compareToIgnoreCase(menu) == 0 || "y".compareToIgnoreCase(menu) ==0 )
				continue;
			else
				break;
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
}
