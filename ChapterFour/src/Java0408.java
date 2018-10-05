// Java0408.java
// This program introduces the rectangle command.  A rectangle is drawn from
// the top-left (X,Y) coordinate of a rectangle followed by Width and Height using
// <drawRect(X,Y,Width,Height)>.
// The <fillRect> command draws a rectangle filled with solid pixels.


import java.awt.*;
import java.applet.*;


public class Java0408 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(50,50,100,100);
		g.drawRect(300,50,300,150);
		g.fillRect(50,400,100,100);
		g.fillRect(300,400,300,150);
	}
}
