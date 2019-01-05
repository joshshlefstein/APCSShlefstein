import java.awt.*;

public class Car extends Vehicle {
	private int x1;
	private Color c;
	private Windows driverWindow;
	private Windows passWindow;
	private Mirrors carMirror;

	public Car(Graphics g, int x, Color color) {
		super(g, x, color);
		x1 = x;
		c = color;
		drawTop(g);
		driverWindow = new Windows(g, x, Color.white, "driver");
		passWindow = new Windows(g, x, Color.white, "pass");
		carMirror = new Mirrors(g, x, Color.lightGray, "car");

	}

	public void drawTop(Graphics g) {
		Polygon top = new Polygon();
		top.addPoint(x1 + 50, 200);
		top.addPoint(x1 + 100, 155);
		top.addPoint(x1 + 200, 155);
		top.addPoint(x1 + 250, 200);
		g.setColor(c);
		g.fillPolygon(top);
	}

}
