//Java0528.java
//This program introduces animation using the "draw and erase“
//method.
import java.awt.*;
import java.applet.*;
public class Java0528 extends Applet
{
	public void paint(Graphics g)
	{
		for (int x = 0; x < 780; x += 5)
		{
			g.setColor(Color.black);
			g.fillOval(x,300,20,20);
			for (long delay = 1; delay < 10000000; delay++);
			g.setColor(Color.white);
			g.fillOval(x,300,20,20);
		}			
	}
} 
