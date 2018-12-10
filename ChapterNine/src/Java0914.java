// Java0914.java
// JackO'lantern Case Study, Stage #3
// This program demonstrates both inheritance and composition.
// A JackO'lantern is-a Pumpkin.  A JackO'lantern has-a face.


import java.awt.*;
import java.applet.*;


public class Java0914 extends Applet
{
	public void paint(Graphics g)
	{
		JackOlantern jack = new JackOlantern(g);
	}
}


class Pumpkin
{
	public Pumpkin(Graphics g)
	{
		g.setColor(Color.orange);
		g.fillOval(100,100,600,450);
		g.setColor(new Color(50,200,50));
		g.fillRect(390,30,20,80);
	}
}


class Face
{

	public Face(Graphics g)
	{
		drawEyes(g);
		drawNose(g);
		drawMouth(g);
	}

	public void drawEyes(Graphics g)
	{
		g.setColor(Color.black);
		g.fillOval(200,200,100,100);
		g.fillOval(500,200,100,100);
	}

	public void drawNose(Graphics g)
	{
		Polygon nose = new Polygon();
		nose.addPoint(350,340);
		nose.addPoint(450,340);
		nose.addPoint(400,270);
		g.fillPolygon(nose);
	}

	public void drawMouth(Graphics g)
	{
		Polygon mouth = new Polygon();
		mouth.addPoint(300,400);
		mouth.addPoint(200,350);
		mouth.addPoint(250,450);
		mouth.addPoint(400,500);
		mouth.addPoint(550,450);
		mouth.addPoint(600,350);
		mouth.addPoint(500,400);
		g.fillPolygon(mouth);
	}
}


class JackOlantern extends Pumpkin
{
	private Face f;

	public JackOlantern(Graphics g)
	{
		super(g);
		f = new Face(g);
	}
}

