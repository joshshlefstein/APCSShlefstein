
public class Customer {
	private String firstName;
	private String lastName;
	private Account account;//account object within customer object

	public Customer(String f, String l, double balance) {
		firstName = f;
		lastName = l;
		account = new Account(balance); //composition, creates an instance of account in the customer class
	}

	public String getFirstName() { //accessor methods- accessing data in the class
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return account;
	}
}
