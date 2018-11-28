
public class Account {
	protected double balance;

	public Account(double initialBalance) {
		balance = initialBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public boolean withdraw(double amt) {
		
		if((balance-amt)<0){
			return false;
		}
		else {
			balance = balance - amt;
			return true;
			
			
		}
	}
}