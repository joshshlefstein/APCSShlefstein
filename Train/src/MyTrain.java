
import java.awt.*;
import java.applet.*;

public class MyTrain extends Applet {

	public void paint(Graphics g) {
		Locomotive l1 = new Locomotive(g, Color.black, 30);
		TrainCar tc1 = new TrainCar(g, Color.green, 200);
		TrainCar tc2 = new TrainCar(g, Color.yellow, 370);
		TrainCar tc3 = new TrainCar(g, Color.magenta, 540);
		TrainCar tc4 = new TrainCar(g, Color.red, 710);
		WindowTrain cab = new WindowTrain(g, 880);
		Caboose c1 = new Caboose(g, 1060);

	}

}
