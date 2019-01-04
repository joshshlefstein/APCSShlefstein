import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
public class displayAllVehicles extends Applet {

	public void paint(Graphics g) {
		Car myCar = new Car(g, 100, "Honda", "Accord", 2018, 23570, Color.blue, 5, true, false);
		Truck myTruck = new Truck(g, 500, "Ram", "1500", 2019, 31795, Color.cyan, 2, "Pickup", 200);

	}

}
