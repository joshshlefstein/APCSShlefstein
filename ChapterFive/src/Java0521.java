// Java0521.java
// This program shows how a control structure can be used with graphics.
// This program draws horizontal lines, because y1 and y2 have the same value.


import java.awt.*;
import java.applet.*;


public class Java0521 extends Applet
{
	public void paint(Graphics g)
	{
		int x1 = 100;
		int x2 = 700;
		for (int y = 50; y < 500; y +=10)
			g.drawLine(x1,y,x2,y);	
	}
}


