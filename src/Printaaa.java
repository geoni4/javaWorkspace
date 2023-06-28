
interface Printable2 { // MS가 정의하고 제공한 인터페이스
	public void print(String doc);
}

class SPrinterDriver2 implements Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}

}

class LPrinterDriver2 implements Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}

}

public class Printaaa {
	// SPrinterDriver 와 LPrinterDriver를 만드시오
	public static void main(String[] args) {
		String myDoc = "This is a report about...";

		// 삼성 프린터로 출력
		Printable2 prn = new SPrinterDriver2();
		prn.print(myDoc);
		System.out.println();

		// LG 프린터로 출력
		prn = new LPrinterDriver2();
		prn.print(myDoc);
	}
}

/*
출력: 
From Samsung printer
This is a report about ...
From LG printer
This is a report about ...
*/
