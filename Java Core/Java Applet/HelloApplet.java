
/*Applet basic program*/

import java.applet.*;
import java.awt.*;

public class HelloApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome", 50, 50);
	}
}
/* <applet code="HelloApplet.class" width=150 height=150> </applet> */