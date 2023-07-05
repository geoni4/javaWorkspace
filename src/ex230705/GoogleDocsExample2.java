package ex230705;


class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i =0;i<300;i++) {
			System.out.print("-");
		}
	}
	
}

class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<300;i++) {
			System.out.print("|");
		}
	}
	
}

public class GoogleDocsExample2 {
	public static void main(String[] args) {
		Thread2 th1 = new Thread2();
		Thread3 th2 = new Thread3();
		
		
		th1.start();
		th2.start();
	}
}
