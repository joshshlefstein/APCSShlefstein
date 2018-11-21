
public class TestPumpkin {

	public static void main(String[] args) {

		Pumpkin skinnyPumpkin = new Pumpkin(5);
		Pumpkin averagePumpkin = new Pumpkin(10);
		Pumpkin fatPumpkin = new Pumpkin(15);

		System.out.println("Total Weight: " + (skinnyPumpkin.getWeight() + averagePumpkin.getWeight() + fatPumpkin.getWeight()) + "\n");
		System.out.println("Total Price: " + (skinnyPumpkin.getPrice() + averagePumpkin.getPrice() + fatPumpkin.getPrice()) + "\n");

		System.out.println("Skinny Pumpkin Weight: " + skinnyPumpkin.getWeight());
		System.out.println("Average Pumpkin Weight: " + averagePumpkin.getWeight());
		System.out.println("Fat Pumpkin Weight: " + fatPumpkin.getWeight() + "\n");

		System.out.println("Skinny Pumpkin Price: " + skinnyPumpkin.getPrice());
		System.out.println("Average Pumpkin Price: " + averagePumpkin.getPrice());
		System.out.println("Fat Pumpkin Price: " + fatPumpkin.getPrice() + "\n");

		for (int i = 1; i <= 5; i++) {
			skinnyPumpkin.grow();
			averagePumpkin.grow();
			fatPumpkin.grow();
		}
		
		System.out.println("New weight of skinny pumpkin: " + skinnyPumpkin.getWeight());
		System.out.println("New weight of average pumpkin: " + averagePumpkin.getWeight());
		System.out.println("New weight of fat pumpkin: " + fatPumpkin.getWeight());

	}

}