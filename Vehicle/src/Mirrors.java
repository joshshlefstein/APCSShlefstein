import java.awt.*;

public class Mirrors {
	private int x1;
	private Color c;

	public Mirrors(Graphics g, int x, Color color, String size) {
		x1 = x;
		c = color;

		if (size == "truck") {
			drawTruckMirror(g);
		} else if (size == "car") {
			drawCarMirror(g);
		}
	}

	public void drawTruckMirror(Graphics g) {
		g.setColor(c);
		g.fillRoundRect(x1 + 35, 175, 20, 30, 10, 10);
	}

	public void drawCarMirror(Graphics g) {
		g.setColor(c);
		g.fillRoundRect(x1 + 50, 190, 30, 12, 10, 10);
	}
}
