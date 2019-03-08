
public class MensShoes {
	private double size;
	private String material;
	private String color;
	private double price;
	private int quantity;
	private String name;
	private int id;

	public MensShoes(String _name, double _price, int _quantity, int _id, String _color, String _material,
			double _size) {
		size = _size;
		material = _material;
		color = _color;
		price = _price;
		quantity = _quantity;
		name = _name;
		id = _id;
	}

	public double getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

}
