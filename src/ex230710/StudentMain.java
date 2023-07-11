package ex230710;

import java.util.Scanner;

class Student{
	private int kor, eng, math;

	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public double getAvg() {
		return getTotal()/3.0;
	}
	
	public char getGrade() {
		char grade= '가';
		double avg = getAvg();
		
		if(avg >= 90.0) {
			grade = '수';
		} else if(avg >= 80.0) {
			grade = '우';
		} else if(avg >= 70.0) {
			grade = '미';
		} else if(avg >= 60.0) {
			grade = '양';
		} else {
			grade = '가';
		
		}
		return grade;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 > ");
		int kor = scanner.nextInt();
		System.out.print("영어 > ");
		int eng = scanner.nextInt();
		System.out.print("수학 > ");
		int math = scanner.nextInt();
		Student s = new Student(kor, eng, math);
		System.out.println("==============");
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAvg());
		System.out.println("성적 : " + s.getGrade());
	}
}
