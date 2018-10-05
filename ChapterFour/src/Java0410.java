// Java0410.java
// This program uses the <drawArc> and <fillArcs> methods.
// Method <drawArc(X,Y,Width,Height,Start,Degrees)> uses the first four
// parameters in the same manner as the <drawOval> method.  Start is the
// degree value of the arc-start and Degrees is the number of degrees the arc travels.
// Start (0 degrees) is at 3:00 o'clock and positive degrees travel counter-clockwise.


import java.awt.*;
import java.applet.*;


public class Java0410 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(50,50,100,100,0,180);
		g.fillArc(200,50,100,100,0,270);
		g.drawArc(350,50,100,100,0,360);
		g.fillArc(500,50,100,100,0,-180);

		g.drawArc(50,250,100,200,0,180);
		g.fillArc(200,250,100,200,0,270);
		g.drawArc(350,250,200,100,0,360);
		g.fillArc(350,400,200,100,0,-180);
	}
}
