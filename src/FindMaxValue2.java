
public class FindMaxValue2 {
	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		/*
		 * int maxValue = num1;
		 * 
		 * if( maxValue < num2) { maxValue = num2; } if( maxValue < num3) { maxValue =
		 * num3; }
		 */
		
		int maxValue = num1 > num2 ? num1 : num2;
		maxValue = maxValue > num3 ? maxValue : num3;
		
		System.out.println("최댓값: " + maxValue);
		
	}
}
