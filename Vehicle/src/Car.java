import java.awt.*;

public class Car extends Vehicle {
	private int x1;
	private Color c;
	private Windows driverWindow;
	private Windows passWindow;
	private Mirrors carMirror;

	public Car(Graphics g, int x, Color color) { // constructor
		super(g, x, color); // inheritance
		x1 = x; // set x1 = to the x in the constructor
		c = color; // set c = to Color in the constructor
		drawTop(g); // draw the top part of the car that gets added to the vehicle body
		driverWindow = new Windows(g, x, Color.white, "driver"); // composition. a car has a window
		passWindow = new Windows(g, x, Color.white, "pass");
		carMirror = new Mirrors(g, x, Color.lightGray, "car"); // composition. a car has a mirror

	}

	public void drawTop(Graphics g) { //method
		Polygon top = new Polygon();
		top.addPoint(x1 + 50, 200);
		top.addPoint(x1 + 100, 155);
		top.addPoint(x1 + 200, 155);
		top.addPoint(x1 + 250, 200);
		g.setColor(c);
		g.fillPolygon(top);
	}

}
