import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class TestTruck extends Applet {

	public  void paint(Graphics g) {
		Truck myTruck = new Truck(g, 500, "Ram", "1500", 2019, 31795, Color.cyan, 2, "Pickup", 200);
		
		System.out.println("Make: "+myTruck.getMake());
		System.out.println("Model: "+myTruck.getModel());
		System.out.println("Year: "+myTruck.getYear());
		System.out.println("Price: $"+myTruck.getPrice());
		System.out.println("Number of seats: "+myTruck.getNumberOfSeats());
		System.out.println("AC: "+myTruck.getTypeTruck());
		System.out.println("GPS: "+myTruck.getAmtOfSpace());
	}

}
