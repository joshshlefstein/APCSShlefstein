import java.awt.*;
import java.applet.*;


		public class GraphicsLab_04_90Point extends Applet
		{
			public void paint(Graphics g)
			{
				//Cube
				g.drawRect(50, 50, 200, 200);
				g.drawRect(100, 100, 200, 200);
				g.drawLine(50, 50, 100, 100);
				g.drawLine(250, 50, 300, 100);
				g.drawLine(50, 250, 100, 300);
				g.drawLine(250, 250, 300, 300);
				
				//Sphere
				g.drawOval(500, 50, 200, 200);
				g.drawOval(500, 125, 200, 50);
				g.drawOval(500, 90, 200, 120);
				g.drawOval(500, 70, 200, 165);
				g.drawOval(575, 50, 50, 200);
				g.drawOval(540, 50, 120, 200);
				g.drawOval(518, 50, 165, 200);

			

	}

}
