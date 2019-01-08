import java.awt.*;

public class Mirrors {
	private int x1;
	private Color c;

	public Mirrors(Graphics g, int x, Color color, String size) { // constructor
		x1 = x;
		c = color;

		if (size == "truck") { // whatever is passed through the constructor (String) will go through this if
							   // statement and call the corresponding method
			drawTruckMirror(g);
		} else if (size == "car") {
			drawCarMirror(g);
		}
	}

	// methods
	public void drawTruckMirror(Graphics g) {
		g.setColor(c);
		g.fillRoundRect(x1 + 35, 175, 20, 30, 10, 10);
	}

	public void drawCarMirror(Graphics g) {
		g.setColor(c);
		g.fillRoundRect(x1 + 50, 190, 30, 12, 10, 10);
	}
}
