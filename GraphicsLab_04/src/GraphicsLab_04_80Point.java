import java.awt.*;
import java.applet.*;
public class GraphicsLab_04_80Point extends Applet {

	public void paint(Graphics g) {
		//Cube
		g.drawRect(50, 50, 200, 200);
		g.drawRect(100, 100, 200, 200);
		g.drawLine(50, 50, 100, 100);
		g.drawLine(250, 50, 300, 100);
		g.drawLine(50, 250, 100, 300);
		g.drawLine(250, 250, 300, 300);
	}

}
