import java.awt.Color;
import java.awt.Graphics;


public class Vehicle {
	private String make;
	private String model;
	private int year;
	private double price;
	private Color color;
	private int numberOfSeats;

	public Vehicle(Graphics g, int x, String make1, String model1, int y, double p, Color c, int numSeats) {
		make = make1;
		model = model1;
		year = y;
		price = p;
		color = c;
		numberOfSeats = numSeats;
		
	g.setColor(c);
	g.fillRect(x, 200, 300, 100);
	g.setColor(Color.black);
	g.fillOval(x + 50, 280, 50, 50);
	g.fillOval(x + 200, 280, 50, 50);
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}
	
	public Color getColor() {
		return color;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

}
