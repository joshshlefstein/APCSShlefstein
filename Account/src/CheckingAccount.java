
public class CheckingAccount extends Account {
	private double overdraftAmount;

	public CheckingAccount(double balance, double overdraft) {
		super(balance);
		overdraftAmount = overdraft;
	}

	public CheckingAccount(double balance) {
		super(balance);
	}

	public boolean withdraw(double amt) {
		boolean afford = true;
		double total = balance + overdraftAmount;

		if (total - amt < 0) {
			afford = false;
			System.out.println("Enough funds for this withdrawl = " + afford);
		} 
		else {
			if (amt > balance) {
				overdraftAmount = overdraftAmount - (amt - balance);
				balance = 0;
			} else {
				balance = balance - amt;
			}
			afford = true;
			System.out.println("Enough funds for this withdrawl = " + afford);
		}
		return afford;
	}

	public double getOverDraftAmount() {
		return overdraftAmount;
	}
}
