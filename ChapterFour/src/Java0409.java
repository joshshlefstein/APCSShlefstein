// Java0409.java
// This program uses the <drawOval> method to draw ovals and circles.
// The four parameters of the <drawOval> method are identical to the parameters of
// the <drawRect> method.  With <drawOval(X,Y,Width,Height)> (X,Y) is the
// coordinate of the top-left corner of the rectangle that circumscribes the oval.
// It also shows that the Graphics variable does not have to be "g".


import java.awt.*;
import java.applet.*;


public class Java0409 extends Applet
{
	public void paint(Graphics screen)
	{
		screen.drawOval(50,50,100,100);
		screen.drawOval(300,50,300,50);
		screen.fillOval(50,400,100,100);
		screen.fillOval(300,400,300,150);
	}
}


