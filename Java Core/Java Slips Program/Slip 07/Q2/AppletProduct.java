
/*
Slip 07 Q2
Create a Java applet to accept the two numbers as parameters from the
user and display their product. (use param) 
*/

import java.applet.*;
import java.awt.*;

/* <applet code="AppletProduct.class" width=300 height=300> 
	
	<param name="num1" value=20>
	<param name="num2" value=30>
	
   </applet> 
*/

public class AppletProduct extends Applet
{
	Font f1;
	int num1, num2;
	
	public void init()
	{
		f1 = new Font("", Font.BOLD, 14);
		num1 = Integer.parseInt(getParameter("num1"));
		num2 = Integer.parseInt(getParameter("num2"));
	}
	
	public void paint(Graphics g)
	{	
		g.setFont(f1);
		g.drawString("Calculate product of two numbers", 20, 40);
		
		g.drawString("Given Num1: " + num1, 20, 60);
		g.drawString("Given Num2: " + num2, 20, 80);
		
		g.drawString("Product (" + num1 + "*" + num2 + ") : " + (num1*num2), 20, 120);
	}
	
}