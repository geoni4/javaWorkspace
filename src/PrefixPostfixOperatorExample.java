
public class PrefixPostfixOperatorExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);		//10, 20, 30
		//10, 20, 30
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1++, ++num2, num3++);	//10, 21, 30
		//11, 21, 31
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);		//11, 21, 31
		//11, 21, 31
		System.out.printf("num1: %d, num2: %d, num3: %d\n", ++num1, num2--, --num3);	//12, 21, 30
		//12, 20, 30
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);		//12, 20, 30
		//12, 20, 30
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1--, num2++, num3--);	//12, 20, 30
		//11, 21, 29
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);		//11, 21, 29
		//11, 21, 29
		System.out.printf("num1++ + --num2 = %d, num2++ + ++num3 = %d\n", (num1++ + --num2), (num2++ + ++num3) ); // 11 + 20 = 31 계산 후, num1 = 12, num2 = 20. 20 + 30 = 50 계산 후, num2 = 21, num3 = 30
		//12, 21, 30
		System.out.printf("num1: %d, num2: %d, num3: %d\n", num1, num2, num3);		//12, 21, 30
		
	}
}
