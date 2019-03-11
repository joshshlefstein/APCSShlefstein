import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class GUI implements ActionListener {

	private JFrame frame = new JFrame("Shlefstein Footwear");
	private JPanel panel = new JPanel();
	private JTextField _size = new JTextField(2);
	private JTextField _material = new JTextField(7);
	private JTextField _color = new JTextField(5);
	private JTextField _price = new JTextField(4);
	private JTextField _quantity = new JTextField(2);
	private JTextField _name = new JTextField(7);
	private JTextField _id = new JTextField(2);
	private JLabel size = new JLabel("Size");
	private JLabel material = new JLabel("Material");
	private JLabel color = new JLabel("Color");
	private JLabel price = new JLabel("Price $");
	private JLabel quantity = new JLabel("Quantity");
	private JLabel name = new JLabel("Name");
	private JLabel id = new JLabel("ID");
	private JButton add = new JButton("Add");
	private JButton save = new JButton("Save");
	private JButton search = new JButton("Search");
	private JTextField searchbar = new JTextField(7);
	private JButton clear = new JButton("Clear");

	private Inventory i = new Inventory();

	public GUI() {
		i.readFile();

		frame.setLayout(new GridLayout(1, 1));
		panel.add(size);
		panel.add(_size);
		_size.addActionListener(this);
		panel.add(material);
		panel.add(_material);
		_material.addActionListener(this);
		panel.add(color);
		panel.add(_color);
		_color.addActionListener(this);
		panel.add(price);
		panel.add(_price);
		_price.addActionListener(this);
		panel.add(quantity);
		panel.add(_quantity);
		_quantity.addActionListener(this);
		panel.add(name);
		panel.add(_name);
		_name.addActionListener(this);
		panel.add(id);
		panel.add(_id);
		_id.addActionListener(this);
		panel.add(add);
		add.addActionListener(this);
		panel.add(save);
		save.addActionListener(this);
		
		panel.add(clear);
		clear.addActionListener(this);

		panel.add(search);
		search.addActionListener(this);

		panel.add(searchbar);
		searchbar.addActionListener(this);

		frame.add(panel);
		frame.setTitle("Shlefstein Footwear");
		frame.setSize(585, 120);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();

		if (str.equals("Add")) {
			
			double price = Double.parseDouble(_price.getText());
			int quantity = Integer.parseInt(_quantity.getText());
			String name = _name.getText();
			int id = Integer.parseInt(_id.getText());
			String color = _color.getText();
			String material = _material.getText();
			double size = Double.parseDouble(_size.getText());
			MensShoes shoe1 = new MensShoes(name, price, quantity, id, color, material, size);
			i.add(shoe1);
		}

		if (str.equals("Save")) {
			i.writeData();
		}
		
		if (str.equals("Clear")) {
			_name.setText("");
			_price.setText("");
			_quantity.setText("");
			_id.setText("");
			_color.setText("");
			_material.setText("");
			_size.setText("");
		}

		if (str.equals("Search")) {
			try {
			int index = i.findIndexByName(searchbar.getText());
			_name.setText(i.findNameByIndex(index));
			_price.setText(String.valueOf(i.getPrice(index)));
			_quantity.setText(String.valueOf(i.getQuantity(index)));
			_id.setText(String.valueOf(i.getID(index)));
			_color.setText(i.getColor(index));
			_material.setText(i.getMaterial(index));
			_size.setText(String.valueOf(i.getSize(index)));
			} catch (Exception failure) {
				System.out.println(failure);
				_material.setText("Error-->");
				_color.setText("Press");
				_price.setText("Clear");
				
			}
			
		}

	}

	public static void main(String[] args) {
		GUI g = new GUI();
		// Gui - reading file and save/write to the textfile

		// bring in textbox for storing variables
		// create a GUI, where the user can input the data
		// load the out.txt file date onto the GUI when you start
		// create a "save" button to output the data into out.txt file so the user can
		// store the information of the inventory

	}

}
