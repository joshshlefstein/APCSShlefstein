
public class TestBank {

	public static void main(String[] args) {

		Bank piggyBank = new Bank();
//		Customer Jane = new Customer("Jane", "Simms", 100);
//		Customer Owen = new Customer("Owen", "Bryant", 5);
//		Customer Tim = new Customer("Tim", "Soley", 2);
//		Customer Maria = new Customer("Maria", "Soley", 4);

		piggyBank.addCustomer("Jane", "Simms", 100);
		piggyBank.addCustomer("Owen", "Bryant", 5);
		piggyBank.addCustomer("Tim", "Soley", 2);
		piggyBank.addCustomer("Maria", "Soley", 4);

		for (int i = 0; i < piggyBank.getNumOfCustomers(); i++) {
			System.out.println(piggyBank.getCustomer(i).getFirstName() + " balance is " + piggyBank.getCustomer(i).getAccount().getBalance());
		}
	}

}
