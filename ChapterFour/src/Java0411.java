// Java0411.java
// This program demonstrates the significance of using parameters in the correct
// sequence Java0411.java is very similar to Java0409,java with rearranged parameters.


import java.awt.*;
import java.applet.*;


public class Java0411 extends Applet
{
	public void paint(Graphics screen)
	{
		screen.drawOval(100,100,50,50);
		screen.drawOval(50,300,50,300);
		screen.fillOval(400,50,100,100);
		screen.fillOval(150,300,400,300);
	}
}

