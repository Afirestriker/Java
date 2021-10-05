
import java.awt.*;
import java.applet.*;

public class JavaApplet extends Applet
{
	public void init()
	{
		System.out.println("\n\tApplet Initialized");
	}
	
	public void start()
	{
		System.out.println("\n\tApplet Started");
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		setForeground(Color.white);
		
		//g.setFont(new Font("Arial", STYLE.Bold, 20));
		//g.setColor(Color.red);
		g.drawString("This is String", 20, 20);
	}
	
	public void stop()
	{
		System.out.println("\n\tApplet Stopped");
	}
	
	public void destroy()
	{
		System.out.println("\n\tApplet Destroyed");
	}
}


/* <applet code="JavaApplet.class" width="600" height="400"> </applet> */
