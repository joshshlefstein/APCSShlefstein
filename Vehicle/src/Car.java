import java.awt.*;
import java.applet.*;

public class Car extends Vehicle {
	private int numberOfSeats = 0;
	private boolean ac = false;
	private boolean gps = false;

    
	public Car(Graphics g, int x, String make1, String model1, int y, double p, Color c, int numSeats, boolean coolair, boolean directions) {
		super(g, x, make1, model1, y, p, c, numSeats);
		
		ac = coolair;
		gps = directions;
		drawTop(g);
		
	}
	public void drawTop(Graphics g) {
		Polygon top = new Polygon();
		top.addPoint(150, 200);
		top.addPoint(200, 155);
		top.addPoint(300, 155);
		top.addPoint(350, 200);
		g.setColor(Color.blue);
		g.fillPolygon(top);
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
