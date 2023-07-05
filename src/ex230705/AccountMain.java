package ex230705;


class Account{
	private int balance = 1000;
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}

class RunnableAccount implements Runnable{
	Account acc = new Account();

	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300 중 한 값으로 임의로 선택해서 출금(withdraw)
			int money = (int) (Math.random()*3 + 1) * 100;
			acc.withdraw(money);
			System.out.println(Thread.currentThread().getName()+" ::balance: "+acc.getBalance());
		}
	}
	
}


public class AccountMain {
	public static void main(String[] args) {
		Runnable rn1 = new RunnableAccount();
		Thread th1 =  new Thread(rn1,"첫번째");
		Thread th2 =  new Thread(rn1,"두번째");
		
		th1.start();
		th2.start();
	}
}
