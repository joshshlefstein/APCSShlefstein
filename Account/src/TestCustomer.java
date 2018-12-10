
public class TestCustomer {
	public static void main(String[] args) {
		
		Customer leeman = new Customer("Josh", "Leeman", 1000);
		Account leemanAccount = leeman.getAccount();//this is kinda unnecessary
		leeman.getAccount().deposit(500);
		leeman.getAccount().withdraw(100);
		System.out.println(leeman.getAccount().getBalance());
		// leeman.deposit(30); this won't work because leeman is only a customer object, not an account object
		
		Customer Noa = new Customer("Noa", "Rogoszinski", 500);
		Account NoaAccount = Noa.getAccount();
		
		NoaAccount.deposit(1000);//shortcut to line 7
		NoaAccount.withdraw(10);
		System.out.println(Noa.getFirstName()+" balance is "+NoaAccount.getBalance());
		
	}
}
