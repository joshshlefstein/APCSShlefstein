import java.awt.*;

public class Vehicle {
	private Color c;
	private int x1;

	public Vehicle(Graphics g, int x, Color color) {
		c = color;
		x1 = x;
		drawBody(g);
		drawHeadlights(g);
		drawBrakelights(g);
	}

	public void drawBody(Graphics g) {
		g.setColor(c);
		g.fillRect(x1, 200, 300, 100);
		g.setColor(Color.black);
		g.fillOval(x1 + 50, 280, 50, 50);
		g.fillOval(x1 + 200, 280, 50, 50);
		g.setColor(Color.gray);
		g.fillOval(x1 + 60, 290, 30, 30);
		g.fillOval(x1 + 210, 290, 30, 30);
	}

	public void drawHeadlights(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(x1 - 5, 260, 10, 10);
	}

	public void drawBrakelights(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x1 + 295, 260, 10, 10);
	}

}
