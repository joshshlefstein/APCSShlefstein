import java.awt.Color;
import java.awt.Graphics;

public class Caboose extends TrainCar {
	private int x;

	public Caboose(Graphics g, int x1) {

		super(g, Color.red, x1);
		x = x1;
		drawWindows(g);
		drawTop(g);

	}

	public void drawWindows(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x + 30, 280, 30, 30);
		g.fillRect(x + 90, 280, 30, 30);
	}

	public void drawTop(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x + 30, 235, 90, 15);
		g.setColor(Color.black);
		g.fillRect(x + 25, 235, 100, 5);
	}

}
