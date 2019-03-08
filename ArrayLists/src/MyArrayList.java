import java.util.ArrayList;
import java.awt.Color;

public class MyArrayList {

	public static void main(String[] args) {

		Candy tootsieRoll = new Candy("Chocolate", new Color(130, 53, 15), .25);
		Candy kitkat = new Candy("White Chocolate", Color.white, 1.00);

		ArrayList<Candy> list = new ArrayList<Candy>();
		list.add(tootsieRoll);
		list.add(kitkat);

//		System.out.println(list);

		// enhanced for loop
		for (Candy c : list) {
			System.out.println(c.getPrice());
			System.out.println(c.getFlavor());
			System.out.println(c.getColor());
		}
	}

}
