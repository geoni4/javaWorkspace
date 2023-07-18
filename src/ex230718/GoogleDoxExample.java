package ex230718;

interface Printable { // MS가 정의하고 제공한 인터페이스
	public void print(String doc);
}

class SPrinterDriver implements Printable{
	String maker = "Samsung";
	@Override
	public void print(String doc) {
		
		System.out.println("From " + maker);
		System.out.println(doc);
	}
	
}

class LPrinterDriver implements Printable {
	String maker = "LG";
	@Override
	public void print(String doc) {
		
		System.out.println("From " + maker );
		System.out.println(doc);
	}
}

public class GoogleDoxExample {
	// SPrinterDriver 와 LPrinterDriver를 만드시오
	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}

	/*
	 * 출력: From Samsung printer This is a report about ... From LG printer This is a
	 * report about ...
	 */
}
