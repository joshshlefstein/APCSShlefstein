import java.awt.Color;

public class Candy {

	private String flavor;
	private Color color;
	private double price;

	public Candy(String f, Color c, double p) {
		flavor = f;
		color = c;
		price = p;
	}

	public String getFlavor() {
		return flavor;
	}

	public Color getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}
}
