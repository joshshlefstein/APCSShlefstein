
public class TestAccount {

	public static void main(String[] args) {

		Account myAccount = new Account(100);
		System.out.println("Initial balance: $" + myAccount.getBalance()+"\n");

		System.out.println("---Deposit $50---\n");
		myAccount.deposit(50);
		System.out.println("Balance after deposit: $" + myAccount.getBalance()+"\n");
		
		System.out.println("---Withdraw $147---\n");
		myAccount.withdraw(147);
		System.out.println("Balance after withdrawal: $" + myAccount.getBalance());
	}
}
