package exafter230706;


class Thread1 extends Thread{

	@Override
	public void run() {
		for(int i =0;i<300;i++) {
			System.out.print("-");
		}
	}
	
}

class Thread2 extends Thread{

	@Override
	public void run() {
		for(int i =0;i<300;i++) {
			System.out.print("|");
		}
	}
	
}


public class GoogleDocsExample2 {
	public static void main(String[] args) {
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th1.start();
		th2.start();
	}
}
