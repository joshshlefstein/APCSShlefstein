
public class Account {
	private double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		balance = balance - amt;
	}
}