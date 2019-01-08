import java.awt.*;

public class Windows {
	private int x1;
	private Color c;

	public Windows(Graphics g, int x, Color color, String type) { // constructor
		x1 = x; // set x1 = to the x in the constructor
		c = color; // set c = to Color in the constructor
		if (type == "driver") { // whatever is passed through the constructor (String) will go through this if
								// statement and call the corresponding method
			drawDriverWindow(g);
		} else if (type == "pass") {
			drawPassWindow(g);
		} else if (type == "truck") {
			drawTruckWindow(g);
		}
	}

	// methods
	public void drawDriverWindow(Graphics g) {
		Polygon window = new Polygon();
		window.addPoint(x1 + 65, 197);
		window.addPoint(x1 + 105, 160);
		window.addPoint(x1 + 125, 160);
		window.addPoint(x1 + 125, 197);
		g.setColor(c);
		g.fillPolygon(window);
	}

	public void drawPassWindow(Graphics g) {
		g.setColor(c);
		g.fillRect(x1 + 130, 160, 68, 37);
	}

	public void drawTruckWindow(Graphics g) {
		Polygon window = new Polygon();
		window.addPoint(x1 + 47, 197);
		window.addPoint(x1 + 72, 135);
		window.addPoint(x1 + 145, 135);
		window.addPoint(x1 + 145, 197);
		g.setColor(c);
		g.fillPolygon(window);
	}
}
