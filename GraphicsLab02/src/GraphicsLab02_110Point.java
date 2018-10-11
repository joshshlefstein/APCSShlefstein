import java.awt.*;
import java.applet.*;

public class GraphicsLab02_110Point extends Applet {
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
		
		width = 260;
		height = 260;
		g.drawRect(370,190,width,height);	
		
		x1 = 630;
		y1 = 190;
		x2 = 630;
		y2 = 450;
		for (int k = 1; k < 15; k++)
		{
			g.drawLine(x1,y1,x2,y2);;
			x2 -= 10;	
		}
		
		a1=370;
		b1=190;
		a2=370;
		b2=450;
		
		for (int k = 1; k < 15; k++)
		{
			g.drawLine(a1,b1,a2,b2);;
			a2 += 10;	
		}
		
		c1=370;
		d1=450;
		c2=370;
		d2=190;
		
		for (int k = 1; k < 15; k++)
		{
			g.drawLine(c1,d1,c2,d2);;
			c2 += 10;	
		}
		
		j1=630;
		s1=450;
		j2=630;
		s2=190;
		
		for (int k = 1; k < 15; k++)
		{
			g.drawLine(j1,s1,j2,s2);;
			j2 -= 10;	
		}
	}

}