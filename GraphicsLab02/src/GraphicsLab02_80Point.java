import java.awt.*;
import java.applet.*;


public class GraphicsLab02_80Point extends Applet {
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);
		
		int x1 = 990;
		int y1 = 10;
		int x2 = 990;
		int y2 = 640;
		for (int k = 1; k < 64; k++)
		{
			g.drawLine(x1,y1,x2,y2);
			x2 -= 15;
			y1 += 10;
			
		}
		
			
		}
	}