import java.util.Scanner;

class Students{
	String name;
	int kor, eng, math;
	
	
	double getAvg(){
		return (kor + eng + math)/3.0;
	}
	
	
	void getInfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = scanner.nextLine();
		System.out.print("국어: ");
		kor = scanner.nextInt();
		System.out.print("영어: ");
		eng = scanner.nextInt();
		System.out.print("수학: ");
		math = scanner.nextInt();
		
	}
	
	
	public Students() {
	}


	char getGrade() {
		double avg = getAvg();
		char grade = '가';
		
		if(avg>=90) {
			grade= '수';
		} else if(avg>=80) {
			grade= '우';
		} else if(avg>=70) {
			grade= '미';
		} else if(avg>=60) {
			grade= '양';
		} else  {
			grade= '가';
			
		}		
		
		return grade;
	}
	
	public void showInfo() {
		System.out.println(name + "님의 평균은 " +getAvg() +" 성적은 " + getGrade()+"입니다.");
	}
	
	
}

public class StudentGradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int kor, eng, math;
		Students st;
		String menu;
		
		while(true) {
			
			st=new Students();
			
			st.getInfo();
			
			st.showInfo();
			
			System.out.print("계속 하시겠습니까?(y,n) ");
			menu = scanner.nextLine();
			if("n".compareToIgnoreCase(menu) == 0 || "no".compareToIgnoreCase(menu) ==0) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}

/*
"이름:kom
국어:80
영어:90
수학:100
kom님의 평균은90.0성적은수입니다.
계속?y
이름:yun
국어:90
영어:70
수학:55
yun님의 평균은71.66666666666667성적은미입니다.
계속?yes
이름:한글
국어:90
영어:75
수학:80
한글님의 평균은81.66666666666667성적은우입니다.
계속?klsjdaf
종료되었습니다.

종료되었습니다."
*/
