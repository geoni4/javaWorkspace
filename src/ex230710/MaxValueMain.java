package ex230710;

public class MaxValueMain {
	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		int maxValue = num1;
		maxValue = maxValue > num2? maxValue:num2;
		maxValue = maxValue > num3? maxValue:num3;
		
		System.out.println("최대값 : " +maxValue);
	}
}
