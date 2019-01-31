import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverter implements ActionListener {

	JFrame myFrame = new JFrame("Convert Celsius to Fahrenheight");
	JPanel myPanel = new JPanel();
	JLabel fahr;
	JTextField cels;

	public CelsiusConverter() {
		// creates the frame
		myFrame.setLayout(new GridLayout(2, 2));

		// creates text field, button, and label
		cels = new JTextField("Temperature in Celsius");
		JButton convert = new JButton("Convert");
		fahr = new JLabel("Fahrenheit");

		// creates an action for the button
		convert.addActionListener(this);

		// adds text field, button, and label to the panel
		myPanel.add(cels);
		myPanel.add(convert);
		myPanel.add(fahr);

		// adds the panel to the frame
		myFrame.add(myPanel);

		// formats the frame
		myFrame.setTitle("Convert Celsius to Fahrenheit");
		;
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
	}

	// implements ActionListener interface
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();

		// parse degrees celsius as a double and convert to fahrenheit
		if (str.equals("Convert")) {
			double newCels = Double.parseDouble(cels.getText());
			double convertedTemp = newCels * (9 / 5) + 32;
			fahr.setText(convertedTemp + "Fahrenheit"); // sets the label
		}

	}

	// main method
	public static void main(String args[]) {
		new CelsiusConverter();
	}
}
