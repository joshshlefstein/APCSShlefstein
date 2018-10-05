// Java0412.java
// This program demonstrates how to control the output display color with
// the <Color> class and the <setColor> method.


import java.awt.*;
import java.applet.*;

public class Java0412 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(50,50,100,100);
		g.setColor(Color.green);
		g.fillOval(200,50,100,100);
		g.setColor(Color.blue);
		g.fillOval(350,50,100,100);
		g.setColor(Color.orange);
		g.fillOval(500,50,100,100);
		g.setColor(Color.cyan);
		g.fillOval(50,200,100,100);
		g.setColor(Color.magenta);
		g.fillOval(200,200,100,100);
		g.setColor(Color.yellow);
		g.fillOval(350,200,100,100);
		g.setColor(Color.gray);
		g.fillOval(500,200,100,100);
		g.setColor(Color.lightGray);
		g.fillOval(50,350,100,100);
		g.setColor(Color.darkGray);
		g.fillOval(200,350,100,100);
		g.setColor(Color.pink);
		g.fillOval(350,350,100,100);
		g.setColor(Color.black);
		g.fillOval(500,350,100,100);
	}
}
