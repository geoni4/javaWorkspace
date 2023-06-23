import java.util.Scanner;

class StudentAcc{
	private String name;
	private int kor, eng, math;
	
	
	public StudentAcc(String name, int kor, int eng, int math) {
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
		char grade = '가';
		
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

	
	public void showInfo() {
		System.out.println(name + "님의 평균은"+ getAvg() + ", 성적은"+getGrade()+"입니다.");
	}
}



class Accumulator2{
	private static int sum;
	 
	public static void add(int num) {
		sum += num;
	}
	
	public static void showResult() {
		System.out.println("합계 : " + sum);
	}
}

public class AccumulatorExample {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++)
			Accumulator2.add(i); // 전달되는 값을 모두 누적

        Accumulator2.showResult(); // 최종 누적 결과를 출력"
        Scanner scanner = new Scanner(System.in);
        StudentGrade sg;
        String name;
        int kor, eng, math;
        String menu;
        
        while(true) {
        	
        	System.out.print("이름 : ");
        	name = scanner.nextLine();
        	System.out.print("국어 : ");
        	kor = scanner.nextInt();
        	System.out.print("영어 : ");
        	eng = scanner.nextInt();
        	System.out.print("수학 : ");
        	math = scanner.nextInt();
        	
        	sg= new StudentGrade(name, kor, eng, math);
        	
        	sg.showInfo();
        	System.out.print("계속하시겠습니까? (yes,y/no,n)");
        	scanner.nextLine();
        	
        	menu = scanner.nextLine();
        	if("yes".compareToIgnoreCase(menu) == 0 || "y".compareToIgnoreCase(menu) == 0) {
        		
        	} else {
        		break;
        	}
        	
        }
        
        System.out.println("프로그램이 종료되었습니다.");
	}
	
	
	
	
	//"이름:kom
//	국어:80
//	영어:90
//	수학:100
//	kom님의 평균은90.0성적은수입니다.
//	계속?y
//	이름:yun
//	국어:90
//	영어:70
//	수학:55
//	yun님의 평균은71.66666666666667성적은미입니다.
//	계속?yes
//	이름:한글
//	국어:90
//	영어:75
//	수학:80
//	한글님의 평균은81.66666666666667성적은우입니다.
//	계속?klsjdaf
//	종료되었습니다.
//
//	종료되었습니다."
	
}
