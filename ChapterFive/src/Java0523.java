// Java0524.java
// This program demonstrates how to rotate a line around a point.
// In this case the (x1,y1) coordinate stays fixed and the (x2,y2) point changes.


import java.awt.*;
import java.applet.*;


public class Java0524 extends Applet
{
	public void paint(Graphics g)
	{
		int x1 = 50;
		int y1 = 50;
		int x2 = 600;
		int y2 = 50;
		for (int k = 1; k < 50; k++)
		{
			g.drawLine(x1,y1,x2,y2);;
			y2 += 10;	
		}
	}
}


