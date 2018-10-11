import java.awt.*;
import java.applet.*;

public class GraphicsLab02_100Point extends Applet{
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		g.drawRect(10,10,width,height);	
		
		int x1 = 990;
		int y1 = 10;
		int x2 = 990;
		int y2 = 640;
		for (int k = 1; k < 35; k++)
		{
			g.drawLine(x1,y1,x2,y2);;
			x2 -= 15;	
		}
		
		int a1=10;
		int b1=10;
		int a2=10;
		int b2=640;
		
		for (int k = 1; k < 35; k++)
		{
			g.drawLine(a1,b1,a2,b2);;
			a2 += 15;	
		}
		
		int c1=10;
		int d1=640;
		int c2=10;
		int d2=10;
		
		for (int k = 1; k < 35; k++)
		{
			g.drawLine(c1,d1,c2,d2);;
			c2 += 15;	
		}
		
		int j1=990;
		int s1=640;
		int j2=990;
		int s2=10;
		
		for (int k = 1; k < 35; k++)
		{
			g.drawLine(j1,s1,j2,s2);;
			j2 -= 15;	
		}
	}

}
