import java.awt.*;

public class Truck extends Vehicle {
	private int x1;
	private Color c;
	private Windows driverWindow;
	private Mirrors truckMirror;

	public Truck(Graphics g, int x, Color color) {
		super(g, x, color);
		x1 = x;
		c = color;
		drawTop(g);
		drawBed(g);
		driverWindow = new Windows(g, x, Color.white, "truck");
		truckMirror = new Mirrors(g, x, Color.lightGray, "truck");
	}

	public void drawTop(Graphics g) {
		Polygon top = new Polygon();
		top.addPoint(x1 + 40, 200);
		top.addPoint(x1 + 70, 130);
		top.addPoint(x1 + 150, 130);
		top.addPoint(x1 + 150, 200);
		g.setColor(c);
		g.fillPolygon(top);
	}

	public void drawBed(Graphics g) {
		Polygon bed = new Polygon();
		bed.addPoint(x1 + 155, 200);
		bed.addPoint(x1 + 155, 260);
		bed.addPoint(x1 + 293, 260);
		bed.addPoint(x1 + 293, 200);
		g.setColor(Color.lightGray);
		g.fillPolygon(bed);
	}
}
