
class BankAccount{
	int balance = 0;
	
	
	
	public BankAccount() {
		System.out.println("생성자 시작");
	}
	public BankAccount(int balance) {
		this.balance = balance;
		System.out.println("생성자 시작2");
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
    public int checkMyBalance() {
        System.out.println("잔액 : " + balance);
        return balance;
    }
	
}





public class ClassExample2 {
	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		ref1.deposit(3000);
		ref1.withdraw(300);
		
		check(ref1);
	}
	
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}
	
}
