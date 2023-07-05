
public class TimerExample {
	public static void main(String[] args) {
		System.out.println(gradChar(90.8)); // 수
		System.out.println(gradChar(80.0)); // 우
		System.out.println(gradChar(50.0)); // 가
		//result = sub(100, 20); // 빼기 100 - 20 => 80
		//System.out.println(result); // 80
		//double dresult = mult(10.0, 2.0); // 곱하기 10.0 * 2.0 => 20.0
		//System.out.println(dresult); // 20.0
		//dresult = div(5, 2); // 나누기 5.0 / 2.0 => 2.5
		//System.out.println(dresult); // 2.5
		
	}
	
	
	static char gradChar(double score) {
		char grade = '가';
		
		if(score>=90.0) {
			grade='수';
		} else if(score >=80.0) {
			grade='우';
		} else if(score >=70.0) {
			grade='미';
		} else if(score >=60.0) {
			grade='양';
		} else {
			grade='가';
		}
		
		return grade;
	}
	
	static void showStar(int n) {
		for(int i=0;i<n;i++) {
			for(int j = 0;j<=i;j++)	System.out.print("*");
			System.out.println();
		}
	}
}
