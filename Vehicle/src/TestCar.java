
public class TestCar {

	public static void main(String[] args) {
		Car myCar = new Car("Honda", "Accord", 2018, 23570, 5, true, false);
		
		System.out.println("Make: "+myCar.getMake());
		System.out.println("Model: "+myCar.getModel());
		System.out.println("Year: "+myCar.getYear());
		System.out.println("Price: $"+myCar.getPrice());
		System.out.println("Number of seats: "+myCar.getNumberOfSeats());
		System.out.println("AC: "+myCar.getAC());
		System.out.println("GPS: "+myCar.getGPS());

	}

}
