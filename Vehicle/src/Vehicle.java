
public class Vehicle {
	private String make;
	private String model;
	private int year;
	private double price;

	public Vehicle(String make1, String model1, int y, double p) {
		make = make1;
		model = model1;
		year = y;
		price = p;
	}

	public void vehicleDescription() {

	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public String toString(String x) {
		return x;
	}

}
