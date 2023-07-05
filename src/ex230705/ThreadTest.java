package ex230705;

//
//class MyThread1 extends Thread{
//	public void run() {
//		for(int i =0;i<300;i++) {
//			System.out.println("-");
//		}
//	}
//}
//
//class MyThread2 extends Thread{
//	public void run() {
//		for(int i =0;i<300;i++) {
//			System.out.println("|");
//		}
//	}
//}



public class ThreadTest {
	public static void main(String[] args) {
		
		
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start();
		th2.start();
		
//		for(int i =0;i<300;i++) {
//			System.out.println("-");
//		}
//		for(int i =0;i<300;i++) {
//			System.out.println("|");
//		}
	}
}
