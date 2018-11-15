
public class Pumpkin {
	double weight;
	double pricePerPound = 3.00;;

	public Pumpkin(double pounds) {// defines Pumpkin class
		weight = pounds;
	}

	public void setWeight(double w) {
		weight = w;
	}

	public double getWeight() {
		return weight;
	}

	public void grow(double p) {
		weight = weight + pricePerPound * weight;
	}
}