// Java0524.java
// This program is example of displaying multiple graphics rectangles
// using a loop control structure.
// Note how all rectangle share the same top-left corner.


import java.awt.*;
import java.applet.*;


public class Java0524 extends Applet
{
	public void paint(Graphics g)
	{
		int x = 375;
		int y = 275;
		int side = 50;
		for (int k = 1; k <= 25; k++)
		{	
			g.drawRect(50,50,side,side);	
			side += 20;
		}
	}
}


