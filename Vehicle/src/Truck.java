import java.awt.*;
import java.applet.*;

public class Truck extends Vehicle {
	private String type;
	private int amtOfSpace;

	public Truck(Graphics g, int x, String make1, String model1, int y, double p, Color c, int numSeats, String t, int space) {
		super(g, x, make1, model1, y, p, c, numSeats);
		type = t;
		amtOfSpace = space;
		drawTop(g);
		drawBed(g);
	}
	
	public String getTypeTruck() {
		return type;
	}
	
	public int getAmtOfSpace() {
		return amtOfSpace;
}
	public void drawTop(Graphics g) {
		Polygon top = new Polygon();
		top.addPoint(540, 200);
		top.addPoint(570, 130);
		top.addPoint(650, 130);
		top.addPoint(650, 200);
		g.setColor(Color.cyan);
		g.fillPolygon(top);
	}
	
	public void drawBed(Graphics g) {
		Polygon bed = new Polygon();
		bed.addPoint(655, 200);
		bed.addPoint(655, 250);
		bed.addPoint(750, 250);
		bed.addPoint(750, 200);
		g.setColor(Color.white);
		g.fillPolygon(bed);
	}
}
