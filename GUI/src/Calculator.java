import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
	JFrame frame = new JFrame("Calc");
	JPanel screen = new JPanel();
	JPanel buttons = new JPanel();
	JPanel clear = new JPanel();
	
	JTextField display = new JTextField("Delete this text first");
	
	public Calculator() {
		frame.setLayout(new GridLayout(3,1));
		JButton b1 = new JButton("1");
		b1.addActionListener(this);
		JButton b2 = new JButton("2");
		b2.addActionListener(this);
		JButton b3 = new JButton("3");
		b3.addActionListener(this);
		JButton b4 = new JButton("4");
		b4.addActionListener(this);
		JButton b5 = new JButton("5");
		b5.addActionListener(this);
		JButton b6 = new JButton("6");
		b6.addActionListener(this);
		JButton b7 = new JButton("7");
		b7.addActionListener(this);
		JButton b8 = new JButton("8");
		b8.addActionListener(this);
		JButton b9 = new JButton("9");
		b9.addActionListener(this);
		JButton b0 = new JButton("0");
		b0.addActionListener(this);
		JButton ba = new JButton("+");
		ba.addActionListener(this);
		JButton bs = new JButton("-");
		bs.addActionListener(this);
		JButton bm = new JButton("x");
		bm.addActionListener(this);
		JButton bd = new JButton("÷");
		bd.addActionListener(this);
		JButton delete = new JButton("Clear");
		delete.addActionListener(this);
		JButton equal = new JButton("=");
		equal.addActionListener(this);
		
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		buttons.add(b4);
		buttons.add(b5);
		buttons.add(b6);
		buttons.add(b7);
		buttons.add(b8);
		buttons.add(b9);
		buttons.add(b0);
		buttons.add(ba);
		buttons.add(bs);
		buttons.add(bm);
		buttons.add(bd);
		buttons.add(equal);
		clear.add(delete);
		screen.add(display);
		
		frame.add(screen);
		frame.add(buttons);
		frame.add(clear);
		
		frame.setTitle("Calc");
		frame.setSize(300, 600);
		frame.setVisible(true);
		
		
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("1")) {
		String temp = display.getText();
		String temp1 = temp + 1;
		display.setText(temp1);
		}
		if(str.equals("2")) {
			String temp = display.getText();
			String temp1 = temp + 2;
			display.setText(temp1);
			}
		if(str.equals("3")) {
			String temp = display.getText();
			String temp1 = temp + 3;
			display.setText(temp1);
			}
		if(str.equals("4")) {
			String temp = display.getText();
			String temp1 = temp + 4;
			display.setText(temp1);
			}
		
		if(str.equals("5")) {
			String temp = display.getText();
			String temp1 = temp + 5;
			display.setText(temp1);
			}
		if(str.equals("6")) {
			String temp = display.getText();
			String temp1 = temp + 6;
			display.setText(temp1);
			}
		if(str.equals("7")) {
			String temp = display.getText();
			String temp1 = temp + 7;
			display.setText(temp1);
			}
		if(str.equals("8")) {
			String temp = display.getText();
			String temp1 = temp + 8;
			display.setText(temp1);
			}
		if(str.equals("9")) {
			String temp = display.getText();
			String temp1 = temp + 9;
			display.setText(temp1);
			}
		if(str.equals("0")) {
			String temp = display.getText();
			String temp1 = temp + 0;
			display.setText(temp1);
			}
		if(str.equals("Clear")) {
			display.setText("");
		}
		if(str.equals("+")) {
			String temp = display.getText();
			String temp1 = temp + "+";
			display.setText(temp1);
			}
		if(str.equals("-")) {
			String temp = display.getText();
			String temp1 = temp + "-";
			display.setText(temp1);
			}
		if(str.equals("x")) {
			String temp = display.getText();
			String temp1 = temp + "x";
			display.setText(temp1);
			}
		if(str.equals("÷")) {
			String temp = display.getText();
			String temp1 = temp + "÷";
			display.setText(temp1);
			}
//		if(str.equals("=")) {
//			String temp = display.getText();
//			double solve = Double.parseDouble(display.getText());
//			display.setText(temp);
//			}
		
		
		
	}
	
	public static void main(String args[]) {
		new Calculator();
	}
	
}