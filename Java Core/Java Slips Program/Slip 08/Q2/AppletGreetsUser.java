
/*
Slip 08 Q2
Write a Java program to create an applet which accepts user name as a
parameter and greets the user.
*/

import java.applet.Applet;
import java.awt.*;

/*
	<applet code="AppletGreetsUser" width=150 height=150> 
		
		<param name="userName" value="Mike">
	
	</applet>
*/

public class AppletGreetsUser extends Applet
{
	String name;
	
	public void init()
	{
		name = getParameter("userName");
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Welcome", 30, 80);
		
		g.setFont( new Font("", Font.BOLD, 14) );
		
		g.drawString(name, 90, 80);		
	}
}
