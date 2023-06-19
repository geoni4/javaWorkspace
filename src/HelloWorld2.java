
public class HelloWorld2 {
	public static void main(String[] args) {
		
		/*
		 * showAge(19, 170); // value = 값 = 변수값 showAge(17, 169);
		 * 
		 * int height = 190;
		 * 
		 * 
		 * showAge(22, height);
		 */
		
		
//		System.out.println( add(3, 5));
//		System.out.println( sub(3, 5));
//		System.out.println( mul(3, 5));
//		System.out.println(gradChar(90.8));
//		System.out.println(gradChar(80.0));
//		System.out.println(gradChar(50.0));
		
		 
		 showStar(1);
		 showStar(2);
		 showStar(5);
	}
	
	public static void showStar(int n) {
		for(int i =0;i<n;i++) {
			for(int j =0;j<=i;j++) 
				System.out.print("*");
			System.out.println();
		}
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
	
	
	
	
	
	
	public static void showStar1() {
		for(int i =0;i<5;i++){
			for(int j =0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void showFunction() {
		System.out.println("함수1");
		System.out.println("함수2");
	}
	
	
	static void showAge(int age, int height) {
		System.out.println("제 나이는 " + age + "세 입니다." );
		System.out.println("제 키는 " + height + "cm입니다." );
	}
	
	
	static void hiCar() {
		System.out.println("안녕하세요, 함수입니다.");
	}
	
	
}
