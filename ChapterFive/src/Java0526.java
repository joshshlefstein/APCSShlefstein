// Java0526.java
// This program demonstrates how to draw multiple lines easily with a loop structure
// inside a rectangle to form a pattern.


import java.awt.*;
import java.applet.*;


public class Java0526 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(50,50,500,500);
		for (int x = 50; x <= 550; x += 10)
			g.drawLine(x,50,600-x,550);
		
	}
}


