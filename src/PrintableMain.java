


interface Movable{
	public void move();
}

class Printer implements Printable, Movable{

	@Override
	public void move() {
		System.out.println("움직입니다..");
	}

	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
	
}

//interface Printable { // MS가 정의하고 제공한 인터페이스
// 	public void print(String doc);
// }
// 
// 	//SPrinterDriver 와 LPrinterDriver를 만드시오
// 	public static void main(String[] args) {
// 		String myDoc = "This is a report about...";
// 
// 		// 삼성 프린터로 출력
// 		Printable prn = new SPrinterDriver();
// 		prn.print(myDoc);
// 		System.out.println();
// 
// 		// LG 프린터로 출력
// 		prn = new LPrinterDriver();
// 		prn.print(myDoc);
// 	}

class SamsungPrinter implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터 " + doc + " 프린트 되었습니다.");
	}
}

class LGPrinter implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("LG 프린터 " + doc + " 프린트 되었습니다.");
	}
}

public class PrintableMain {
	public static void main(String[] args) {
//		Printer printer = new Printer();
//		printer.move();
//		printer.print("아아아");
		
//		SamsungPrinter samsung = new SamsungPrinter();
//		samsung.print("안녕하세요.");
//		
//		LGPrinter lg = new LGPrinter();
//		lg.print("안녕하세요.");
//		Printable printer = new SamsungPrinter();
//		printer.print("프린트 합니다.");
		
 		String myDoc = "This is a report about...";
 
 		// 삼성 프린터로 출력
 		Printable prn = new SPrinterDriver();
 		prn.print(myDoc);
 		System.out.println();
 
 		// LG 프린터로 출력
 		prn = new LPrinterDriver();
 		prn.print(myDoc);
		
		
	}
}


interface Printable{
	public void print(String doc);
}

class SPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println(	"From Samsung printer");
		System.out.println(doc);
	}
	
}
class LPrinterDriver implements Printable{

	@Override
	public void print(String doc) {
		System.out.println(	"From LG printer");
		System.out.println(doc);
	}
	
}
