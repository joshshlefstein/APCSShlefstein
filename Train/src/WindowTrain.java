import java.awt.Color;
import java.awt.Graphics;

public class WindowTrain extends TrainCar {

	private int x;

	public WindowTrain(Graphics g, int x1) {
		super(g, Color.orange, x1);
		x = x1;
		drawWindows(g);

	}

	public void drawWindows(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x + 30, 280, 30, 30);
		g.fillRect(x + 90, 280, 30, 30);
	}

}
