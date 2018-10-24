// Java0733.java
// This program is the same process as Java0732.java.
// This time the program is written as an Applet.
// Note that the program code is written in the <init> method.
// The <exit> method is necessary to stop the program execution.


import javax.swing.*;
import java.awt.*;


public class Java0733 extends JApplet
{
	public void init()
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Number 1"); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Number 2");

		int intNbr1 = Integer.parseInt(strNbr1);
		int intNbr2 = Integer.parseInt(strNbr2);

		int sum = intNbr1 + intNbr2;

		JOptionPane.showMessageDialog(null,intNbr1 + " + " + intNbr2 + " = " + sum);
          
		System.exit(0);
	}
}
