import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class TestCar extends Applet {

	public void paint(Graphics g) {
		Car myCar = new Car(g, 100, "Honda", "Accord", 2018, 23570, Color.blue, 5, true, false);
		
		System.out.println("Make: "+myCar.getMake());
		System.out.println("Model: "+myCar.getModel());
		System.out.println("Year: "+myCar.getYear());
		System.out.println("Price: $"+myCar.getPrice());
		System.out.println("Number of seats: "+myCar.getNumberOfSeats());
		System.out.println("AC: "+myCar.getAC());
		System.out.println("GPS: "+myCar.getGPS());

	}

}
