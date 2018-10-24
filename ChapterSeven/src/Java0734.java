// Java0734.java
// This program demonstrates how to use the <init> method for GUI input
// followed by the <paint> method for graphical output.


import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Java0734 extends JApplet
{
	int size;	// size of squares to be displayed
	int count;	// the quantity of squares to be displayed
	
	public void init()
	{   
		String str1 = JOptionPane.showInputDialog("Enter Square Size"); 
		String str2 = JOptionPane.showInputDialog("Enter Square Count");

		size = Integer.parseInt(str1);
		count = Integer.parseInt(str2);
          
		// System.exit(0);
	}
	
	public void paint(Graphics g)
	{
		Random rnd = new Random(12345);
		for (int k = 1; k <= count; k++)
		{
			int x = rnd.nextInt(800-size);
			int y = rnd.nextInt(600-size);
			int red = rnd.nextInt(256);
			int green = rnd.nextInt(256);
			int blue = rnd.nextInt(256);
			g.setColor(new Color(red,green,blue));
			g.fillRect(x,y,size,size);
		}
	}
	
}
