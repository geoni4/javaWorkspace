
public class FindMaxValue {
	public static void main(String[] args) {
		int num1 = -6;
		int num2 = 10;
		int num3 = 1;
		
		int MIN_VALUE = -2100000000;
		
		
		
		int maxValue = MIN_VALUE;
		
		/* 
		 * if(num1 >= num2) { if( num1 >= num3 ) { maxValue = num1; } else { maxValue =
		 * num3; } } else { if( num2 >= num3 ) { maxValue = num2; } else { maxValue =
		 * num3; } }
		 */
		
		
		int maxValueTmp = num2 >= num3 ? num2 : num3;
		maxValue = num1 >= maxValueTmp ? num1 : maxValueTmp;
		
		System.out.println(maxValue);
		
	}
	
	
	
}
