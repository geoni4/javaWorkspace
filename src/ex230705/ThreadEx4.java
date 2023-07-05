package ex230705;


class MyThread1 extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
		for(int i =0;i<500;i++) {
			System.out.printf("%s", new String("-"));
		}
	}
	
}

class MyThread2 extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
		for(int i =0;i<500;i++) {
			System.out.printf("%s", new String("|"));
		}
	}
	
}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for(int i =0;i<500;i++) {
			System.out.printf("%s", new String("\\"));
		}
	}
	
}


public class ThreadEx4 {
	public static void main(String[] args) {
		//long startTime = System.currentTimeMillis();
		
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		Runnable rn3 = new MyThread3();
		Thread th3 = new Thread(rn3);
		th3.start();
		th1.start();
		th2.start();
		
		//for(int i =0;i<500;i++)
		//	System.out.printf("%s", new String("-"));
		
		
		
		
		//System.out.println();
		//System.out.println("쇼오시간1: " +(System.currentTimeMillis()));
		
	}
}
