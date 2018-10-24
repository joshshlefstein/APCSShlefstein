// Java0731.java
// This program introduces program input using Swing dialog boxes.


import javax.swing.JOptionPane;


public class Java0731
{
	public static void main (String args[])
	{
		String firstName = JOptionPane.showInputDialog("Enter First Name"); 
		String lastName = JOptionPane.showInputDialog("Enter Last Name");

		String fullName = firstName + " " + lastName;
	
		JOptionPane.showMessageDialog(null,"Your name is " + fullName);
          
		System.exit(0);
	}
}
