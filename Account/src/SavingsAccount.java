
public class SavingsAccount extends Account {//subclass
	
	private double interestRate;
	
	public SavingsAccount(double balance, double rate){
		super(balance + (balance*rate));
		interestRate = rate;
		
	}
}
