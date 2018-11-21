
public class Pumpkin {
	private double weight;
	private double pricePerPound=.25;

	public Pumpkin(double pounds) {// defines Pumpkin class
		weight = pounds;
	}

	public void setWeight(double w) {
		if(w<1000)
			weight = w;
	}

	public double getWeight() {
		return weight;
	}

	public void grow() {
		weight = weight + .5;
	}
	
	public double getPrice() {
		double p = weight*pricePerPound;
		return p;
	}
}