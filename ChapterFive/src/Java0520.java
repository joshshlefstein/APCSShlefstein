// Java0520.java
// This program shows how a control structure can be used with graphics.
// This program draws vertical lines, because x1 and x2 have the same value.


import java.awt.*;
import java.applet.*;


public class Java0520 extends Applet
{
	public void paint(Graphics g)
	{
		int y1 = 100;
		int y2 = 500;
		for (int x = 50; x < 700; x +=10)
			g.drawLine(x,y1,x,y2);	
	}
}


