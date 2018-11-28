
public class TestCheckingAccount {

	public static void main(String[] args) {
		CheckingAccount OwenBryant = new CheckingAccount(500);
		OwenBryant.withdraw(150);
		OwenBryant.deposit(22.55);
		OwenBryant.withdraw(47.62);
		OwenBryant.withdraw(400);
		System.out.println("Your balance: $"+OwenBryant.getBalance()+"\n");
		
		CheckingAccount TimSoley = new CheckingAccount(500, 500);
		TimSoley.withdraw(150);
		TimSoley.deposit(22.50);
		TimSoley.withdraw(47.62);
		TimSoley.withdraw(400);
		System.out.println("Your balance: $"+TimSoley.getBalance());
		System.out.println("Overdraft Amount: $"+TimSoley.getOverDraftAmount());
		
		
	}

}
