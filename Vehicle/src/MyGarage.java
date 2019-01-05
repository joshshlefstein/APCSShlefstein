import java.awt.*;
import java.applet.*;

public class MyGarage extends Applet {

	public void paint(Graphics g) {
		Car myCar = new Car(g, 10, Color.blue);
		Truck myTruck = new Truck(g, 325, Color.green);
		Car car2 = new Car(g, 640, Color.orange);
		Truck truck2 = new Truck(g, 955, Color.magenta);

	}

}
