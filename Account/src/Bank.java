
public class Bank {
	private Customer[] customers = new Customer[100];
	private int numberOfCustomers;// just because you have 100 spots, doesn't mean you will fill the whole thing.
									// this variable helps you keep track of the current amount of customers

	public Bank() {
		numberOfCustomers = 0;
	}

	public void addCustomer(String f, String l, double initBalance) {
		Customer c = new Customer(f, l, initBalance); //new customer object with the attributes f,l, initBalance
		customers[numberOfCustomers] = c; //placed the new customer object into the array
		numberOfCustomers = numberOfCustomers + 1;// updates the number of customers objects
		
	}

	public int getNumOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) {
		return customers[index];//returning the instance of the object at that index value
	}
}
