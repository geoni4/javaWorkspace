
public class PPOP {
	public static void main(String[] args) {
		int num1 = 7;
		
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(num1);
		
		int num2 = 5;
		System.out.println(num2++);
		System.out.println(num2++);
		System.out.println(num2);
		
		
		int num3 = 10;
		int num4 = 10;
		int num5 = 10;
		System.out.println(++num3 + num4++ + num5++);
		System.out.println(num3 + " " + num4 + " " + num5);
		System.out.println(++num3 + --num4 + num5--);
		System.out.println(num3 + " " + num4 + " " + num5);
		System.out.println(num3++ + ++num4 + num5++);
		System.out.println(num3 + " " + num4 + " " + num5);
		
		
	}
}
