import java.awt.*;

public class Windows {
	private int x1;
	private Color c;

	public Windows(Graphics g, int x, Color color, String type) {
		x1 = x;
		c = color;
		if (type == "driver") {
			drawDriverWindow(g);
		} else if (type == "pass") {
			drawPassWindow(g);
		} else if (type == "truck") {
			drawTruckWindow(g);
		}
	}

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
