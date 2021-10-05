
/*
Applet setting Background and Foreground color
*/

/*
<applet code="ForegroundBackgroundColor" width=150 height=150> </applet>
*/


import java.applet.*;
import java.awt.*;


public class ForegroundBackgroundColor extends Applet
{
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.white);
	}
	
	public void start()
	{
		System.out.println("\tApplet Starting...");
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This is Applet Black and White combination", 50, 50);
	}
	
	public void stop()
	{
		System.out.println("\tStopping.....");
	}
	
	public void destroy()
	{
		System.out.println("\tPreparing to Unload");
	}
}