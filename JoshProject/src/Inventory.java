import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Inventory {
	ArrayList<MensShoes> list;

	public Inventory() {
		list = new ArrayList<MensShoes>();
	}

	public void add(MensShoes item) {
		list.add(item);
	}

	public void remove(MensShoes item) {
		list.remove(item);
	}

	public String findNameByIndex(int index) {
		return list.get(index).getName();
	}

	public int getSize() {
		return list.size();
	}

	public double getPrice(int index) {
		return list.get(index).getPrice();
	}

	public int getQuantity(int index) {
		return list.get(index).getQuantity();
	}

	public int getID(int index) {
		return list.get(index).getId();
	}

	public String getColor(int index) {
		return list.get(index).getColor();
	}

	public String getMaterial(int index) {
		return list.get(index).getMaterial();
	}

	public double getSize(int index) {
		return list.get(index).getSize();
	}

	public int findIndexByName(String itemName) {
		for (int i = 0; i <= list.size(); i++) { // iterating through all the items in the arrayList
			if ((list.get(i).getName()).equals(itemName)) {
				return i;
			}
		}
		return -1; // if nothing is found
	}

	public void writeData() {
		try {
			FileWriter f = new FileWriter("out.txt");
			for (MensShoes it : list) {
				f.write(it.getId() + " " + it.getName() + " " + it.getQuantity() + " " + it.getPrice() + " "
						+ it.getColor() + " " + it.getMaterial() + " " + it.getSize() + "\n");
			}
			f.close();
		} catch (Exception failure) {
			System.out.println(failure);
		}
	}

	public void readFile() {
		try {
			FileReader fr = new FileReader("out.txt");
			BufferedReader br = new BufferedReader(fr);

			// reading in the data from the file
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = line.split(" ");
				// item object
				// store it into your array list of items
				int id = Integer.parseInt(parts[0]);
				String name = parts[1];
				int quantity = Integer.parseInt(parts[2]);
				double price = Double.parseDouble(parts[3]);
				String color = parts[4];
				String material = parts[5];
				double size = Double.parseDouble(parts[6]);

				MensShoes s = new MensShoes(name, price, quantity, id, color, material, size);
				list.add(s);

			}

			fr.close();// close file, unless the file will hang
		} catch (Exception failure) {
			System.out.println(failure);
		}
	}

}
