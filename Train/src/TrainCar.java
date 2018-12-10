import java.awt.Color;
import java.awt.Graphics;

public class TrainCar {

	private Color carColor;

	public TrainCar(Graphics g, Color cc, int x) {
		carColor = cc;
		g.setColor(carColor);
		g.fillRect(x, 250, 150, 100);
		g.setColor(Color.black);
		g.fillOval(x + 5, 325, 50, 50);
		g.fillOval(x + 95, 325, 50, 50);
	}

}
