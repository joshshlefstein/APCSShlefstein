
public class Car extends Vehicle {
	private int numberOfSeats = 0;
	private boolean ac = false;
	private boolean gps = false;

    
	public Car(String make1, String model1, int y, double p, int numSeats, boolean coolair, boolean directions) {
		super(make1, model1, y, p);
		
		numberOfSeats = numSeats;
		ac = coolair;
		gps = directions;
		
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
    }
	
	public boolean getAC() {
		return ac;
	}
	
	public boolean getGPS() {
		return gps;
	}
	

}
