// Java0413.java
// This program demonstrates the <drawString> method.
// With <drawString("Hello World",x,y)>, the string Hello World
// will be displayed starting at the [x,y] pixel coordinate.


import java.awt.*;
import java.applet.*;


public class Java0413 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("This string will display in default black at coordinate 200,250]",200,250);
		g.setColor(Color.red);
		g.drawString("This string will display in red at coordinate [5,50]",5,50);
		g.setColor(Color.blue);
		g.drawString("This string will display in blue at coordinate [400,500]",400,500);
	}
}
