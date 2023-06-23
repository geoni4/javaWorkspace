
public class ImmutableString {
	public static void main(String[] args) {
		
		
		String str = new String("two");
		String str2 = new String("two");
		
		System.out.println(str.hashCode()); // String의 hashcode는 주소값이 아니라 문자열을 문자 하나씩 해싱한 값
		System.out.println(str2.hashCode());
		System.out.println("two".hashCode());
		
		
		
		
		
		
		switch(str) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		default:
			System.out.println("default");
		}
		
		
		
//		String str1 = "Simple String";
//		System.out.println(str1.hashCode());
//		str1 = null;
//		str1 = "Simple String";
//		System.out.println(str1.hashCode());
//		
//		String str3 = new String("Simple String");
//		String str4 = new String("Simple String");

//		if(str1 == str2)
//			System.out.println("str1과 str2는 동일 인스턴스 참조");
//		else
//			System.out.println("str1과 str2는 다른 인스턴스 참조");
		
//		if(str3 == str4)
//			System.out.println("str3과 str4는 동일 인스턴스 참조");
//		else
//			System.out.println("str3과 str4는 다른 인스턴스 참조");
		
	}
}
