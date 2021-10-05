
/*
Applet program - Draw smily face
*/

import java.applet.*;
import java.awt.*;

/*
<applet code="SmilyFace" width=300 height=300> </applet>
*/

public class SmilyFace extends Applet
{
	public void init()
	{
		System.out.println("\n\tApplet initialized");
	}
	
	//no main in applet
	public void paint(Graphics g)
	{
		g.drawString("Smily Face Applet", 10, 20);
		
		//face outline
														//g.drawOval(x, y, width, height);
		g.drawOval(80, 70, 150, 150);
		
		//eyes with black color filled
		//g.setColor(Color.black);						//color is by default black and has not been changed before so its optional
														//g.fillOval(x, y, widht, height);
		g.fillOval(120, 120, 15, 15);	//left eye
		g.fillOval(170, 120, 15, 15); 	//right eye
		
		
		//smily arc
														//g.drawArc(x, y, width, height, startangle, arc angle);		
		g.drawArc(130, 180, 50, 20, 180, 180);
		
	}
	
	public void destroy()
	{
		System.out.println("\n\tApplet destroyed");
	}
}