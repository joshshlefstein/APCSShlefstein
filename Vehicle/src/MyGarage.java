import java.awt.*;
import java.applet.*;

public class MyGarage extends Applet {

	public void paint(Graphics g) {
		Car car1 = new Car(g, 10, Color.blue); // creates car (and includes the objects (mirrors and windows)
		Truck truck1 = new Truck(g, 325, Color.green); // creates car (and includes the objects (mirrors and windows)
		Car car2 = new Car(g, 640, Color.orange); // creates truck (and includes the objects (mirrors and windows)
		Truck truck2 = new Truck(g, 955, Color.magenta); // creates truck (and includes the objects (mirrors and windows)

	}

}
