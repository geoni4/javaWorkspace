
public class StringExample {
	public static void main(String[] args) {
		String str1 = "Happy";
		String str2 = "Birthday";
		System.out.println(str1 + " " + str2);
		
		printString(str1);
		printString(str2);
	}

	private static void printString(String str) {
		System.out.print(str);
	}
}
