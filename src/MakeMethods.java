
public class MakeMethods {
	public static void main(String[] args) {
		System.out.println( add(3, 5));
		System.out.println( sub(3, 5));
		System.out.println( mul(3, 5));
		System.out.println(gradChar(90.8));
		System.out.println(gradChar(80.0));
		System.out.println(gradChar(50.0));
	}
	
	static char gradChar(double score) {
		char grade='가';
		if(score>=90.0) {
			grade='수';
		} else if(score >= 80.0) {
			grade='우';
		} else if(score >= 70.0) {
			grade='미';
		} else if(score >= 60.0) {
			grade='양';
		} else {
			grade='가';
		}
		
		return grade;
	}
	
	
	static int mul(int num1, int num2) {
		return num1*num2;
	}
	
	
	
	static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
}
