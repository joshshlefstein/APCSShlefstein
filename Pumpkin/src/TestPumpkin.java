
public class TestPumpkin {

	public static void main(String[] args) {
		Pumpkin firstPumpkin = new Pumpkin(1);
		Pumpkin secondPumpkin = new Pumpkin(2);
		Pumpkin thirdPumpkin = new Pumpkin(3);
		
		System.out.println("Total W: "+((firstPumpkin.getWeight())+(secondPumpkin.getWeight())+(thirdPumpkin.getWeight())));
		System.out.println("Total PPP: "+((firstPumpkin.pricePerPound)+(secondPumpkin.pricePerPound)+(thirdPumpkin.pricePerPound)));

		System.out.println("P1. W: "+firstPumpkin.weight+" PPP: "+firstPumpkin.pricePerPound);
		System.out.println("P2. W: "+secondPumpkin.weight+" PPP: "+secondPumpkin.pricePerPound);
		System.out.println("P3. W: "+thirdPumpkin.weight+" PPP: "+thirdPumpkin.pricePerPound);
		
		
	}

}
