import java.awt.*;
import java.applet.*;
public class GraphicsLab_04_110Point extends Applet {
	public void paint(Graphics g) {
				//Cube
				g.drawRect(50, 50, 200, 200);
				g.drawRect(100, 100, 200, 200);
				g.drawLine(50, 50, 100, 100);
				g.drawLine(250, 50, 300, 100);
				g.drawLine(50, 250, 100, 300);
				g.drawLine(250, 250, 300, 300);
				
				//Sphere in cube
				g.drawOval(75, 75, 200, 200);
				g.drawOval(75, 150, 200, 50);
				g.drawOval(75, 115, 200, 120);
				g.drawOval(75, 93, 200, 165);
				g.drawOval(150, 75, 50, 200);
				g.drawOval(115, 75, 120, 200);
				g.drawOval(93, 75, 165, 200);
				
				//Triangle
				g.drawLine(500, 300, 300, 500);
				g.drawLine(500, 300, 700, 500);
				g.drawLine(300, 500, 700, 500);
				g.drawLine(400, 400, 700, 500);
				g.drawLine(500, 300, 500, 500);
				g.drawLine(600, 400, 300, 500);
				
				//Prism
				g.drawLine(550, 50, 350, 250);//
				g.drawLine(550, 50, 750, 250);//
				g.drawLine(350, 250, 750, 250);//
				g.drawLine(460, 140, 750, 250);
				g.drawLine(550, 50, 563, 179);
				g.drawLine(650, 150, 350, 250);
				g.drawLine(563, 179, 530, 250);
				
	}

}
