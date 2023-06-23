
public class StringConcat {
	public static void main(String[] args) {
		String str1 = "Coffee";
		String str2 = "Bread";
		
		String str = str1+str2;
		String str3 = str1.concat(str2);
		String str5 = str1.concat(str2);
		System.out.println(str3);
		
		System.out.println(str.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str5.hashCode());
		
		StringBuilder stbuf = new StringBuilder("123");
		
		stbuf.replace(0, 0, str3);
		
		String str4 = "Fresh".concat(str3);
		if(str == str3) {
			System.out.println("str과 str3는 같다");
		} else
			System.out.println("str과 str3는 다르다");
		
		if(str3 == str5) {
			System.out.println("str3과 str5는 같다");
		} else
			System.out.println("str3과 str5는 다르다");
		
		
		str5.startsWith(str4);
		System.out.println(str4);
		
		
		
	}
}
