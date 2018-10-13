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
		for (int k = 1; k < 64; k++)
		{
			g.drawLine(x1,y1,x2,y2);
			x2 -= 15;
			y1 += 10;
			
		}
		
		int a1=10;
		int b1=10;
		int a2=10;
		int b2=640;
		
		for (int k = 1; k < 64; k++)
		{
			g.drawLine(a1,b1,a2,b2);
			a2 += 15;
			b1 += 10;
		}
		
		int c1=10;
		int d1=640;
		int c2=10;
		int d2=10;
		
		for (int k = 1; k < 64; k++)
		{
			g.drawLine(c1,d1,c2,d2);
			c2 += 15;	
			d1 -= 10;
		}
		
		int j1=990;
		int s1=640;
		int j2=990;
		int s2=10;
		
		for (int k = 1; k < 64; k++)
		{
			g.drawLine(j1,s1,j2,s2);
			j2 -= 15;	
			s1 -= 10;
		}
		
		width = 480;
		height = 330;
		g.drawRect(260,160,width,height);	
		
		x1 = 740;
		y1 = 160;
		x2 = 740;
		y2 = 490;
		
		for (int k = 1; k < 34; k++)
		{
			g.drawLine(x1,y1,x2,y2);
			x2 -= 15;
			y1 += 10;
			
		}
		
		a1=260;
		b1=160;
		a2=260;
		b2=490;
		
		for (int k = 1; k < 34; k++)
		{
			g.drawLine(a1,b1,a2,b2);
			a2 += 15;
			b1 += 10;
		}
		
		c1=260;
		d1=490;
		c2=260;
		d2=160;
		
		for (int k = 1; k < 34; k++)
		{
			g.drawLine(c1,d1,c2,d2);
			c2 += 15;	
			d1 -= 10;
		}
		
		j1=740;
		s1=490;
		j2=740;
		s2=160;
		
		for (int k = 1; k < 34; k++)
		{
			g.drawLine(j1,s1,j2,s2);
			j2 -= 15;	
			s1 -= 10;
		}
		
	}

}