
/*
 Applet set font
 
 <applet code="AppletFont" width=150 height=150> </applet>
*/

import java.applet.*;
import java.awt.*;

public class AppletFont extends Applet
{
	Font f1; 			//global since using f1 in two different methods
	
	public void init()
	{
		//It is not necessary to set font in init() method only
		//we can do it in paint() method also. (see below)
		
		f1 = new Font("Arial", Font.BOLD, 14);	//setFont("FontName", Font.STYLE, FontSize);
	}
		
	public void paint(Graphics g)
	{
		g.drawString("Default Font", 50, 50);
		
		g.setFont(f1);
		g.drawString("Font Arial", 50, 70);
		
		//setting font inside paint()
		g.setFont( new Font("seriff", Font.ITALIC, 18) );
		g.drawString("Font Seriff", 50, 90);
		
	}
	
}