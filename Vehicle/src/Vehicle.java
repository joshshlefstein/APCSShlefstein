import java.awt.*;

public class Vehicle {
	private Color c;
	private int x1;

	public Vehicle(Graphics g, int x, Color color) { //constructor
		c = color; // set c = to Color in the constructor
		x1 = x; //set x1 = to the x in the constructor
		drawBody(g); //draw the main body that's in the car and truck class
		drawHeadlights(g); // draw the headlights for the vehicle body
		drawBrakelights(g); //draw the brakelights for the vehicle body
	}

	// methods
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
