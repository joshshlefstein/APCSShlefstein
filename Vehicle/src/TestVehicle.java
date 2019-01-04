
public class TestVehicle {

	public static void main(String[] args) {
		Vehicle Pilot = new Vehicle("Honda", "Pilot", 2018, 30900, "Red");
		System.out.println("Make: "+Pilot.getMake());
		System.out.println("Model: "+Pilot.getModel());
		System.out.println("Year: "+Pilot.getYear());
		System.out.println("Price: $"+Pilot.getPrice());
		System.out.println("Color: "+Pilot.getColor());
		

	}

}
