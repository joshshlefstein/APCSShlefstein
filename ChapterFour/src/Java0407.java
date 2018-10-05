// Java0407.java
// This program demonstrates how to draw lines.
// Lines are drawn from (X1,Y1) to (X2,Y2) with drawLine(X1,Y1,X2,Y2).


import java.awt.*;
import java.applet.*;

public class Java0407 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(0,0,800,600);
		g.drawLine(0,600,800,0);
		g.drawLine(100,300,700,300);
		g.drawLine(400,100,400,500);
	}
}
