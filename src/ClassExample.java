


class StarPrint{
	void printTriangle(int n) {
		for(int i =0;i<n;i++) {
			for(int j =0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
	}
	
	void printReverseTriangle(int n ) {
		for(int i =0;i<n;i++) {
			for(int j =i;j<n;j++) System.out.print("*");
			System.out.println();
		}
	}
	
}

class GetSum{
	int num;

	public void setNum(int num) {
		this.num = num;
	}
	
	
	public int sum() {
		int sum =0;
		for(int i =1; i<=num; i++) {
			sum +=i;
		}
		return sum;
	}
	
}


class Gugudan{
	void printGugu(int n) {
		for(int i =2;i<=n;i++) {
			for(int j =1;j<10;j++) {
				System.out.println(i + " x "+ j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}


class Grade{
	int kor;
	int eng;
	int math;
	
	void setGrade(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math =  math;
	}
	
	double getAvg() {
		return (kor + eng + math) / 3.0;
	}
	
	char getGrade() {
		double avg = getAvg();
		char grade ='가';
		if(avg >= 90.0) {
			grade= '수';
		} else if(avg >= 80.0 ) {
			grade= '우';
		} else if(avg >= 70.0 ) {
			grade= '미';
		} else if(avg >= 60.0 ) {
			grade = '양';
		} else {
			grade= '가';
		}
		return grade;
	}
	
	
}



public class ClassExample {
	public static void main(String[] args) {
		

		Grade grade = new Grade();
		
		grade.setGrade(80, 55, 100);
		
		
		double avg = grade.getAvg();
		char result =grade.getGrade();
		System.out.println(avg);
		System.out.println(result);
		
		grade.setGrade(85, 80, 80);
		avg=grade.getAvg();
		result = grade.getGrade();
		System.out.println(avg);
		System.out.println(result);
		
		grade.setGrade(70, 85, 40);
		avg = grade.getAvg();
		result = grade.getGrade();
		System.out.println(avg);
		System.out.println(result);
		
		grade.setGrade(70, 85, 100);
		avg = grade.getAvg();
		result = grade.getGrade();
		System.out.println(avg);
		System.out.println(result);
		
		
		grade.setGrade(40, 85, 40);
		avg = grade.getAvg();
		result = grade.getGrade();
		System.out.println(avg);
		System.out.println(result);
		
		
		Gugudan gugudan = new Gugudan();
		
		gugudan.printGugu(10);
		gugudan.printGugu(20);
		
		
		GetSum getSum = new GetSum();
		int num;
		
		num = 100;
		
		getSum.setNum(num);
		
		num = getSum.sum();
		
		System.out.println(num);
		
		
		
		StarPrint starPrint = new StarPrint();
		 
		starPrint.printTriangle(3);
		System.out.println();
		starPrint.printReverseTriangle(3);
		
	}
}
