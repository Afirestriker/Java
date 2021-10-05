
import java.awt.*;
import java.applet.*;

public class AppletLifecycle extends Applet
{
	public void init()
	{
		System.out.println("\n\tApplet Initialized");
	}
	
	public void start()
	{
		System.out.println("\n\tApplet Started, Applet Window Maximized");
	}
	
	public void paint(Graphics g)
	{
		g.drawString("This is String", 20, 20);
	}
	
	public void stop()
	{
		System.out.println("\n\tApplet Stopped, Applet Window Minimized");
	}
	
	public void destroy()
	{
		System.out.println("\n\tApplet Destroyed, Applet Window closed");
	}
}


/* <applet code="AppletLifecycle" width="600" height="400"> </applet> */
