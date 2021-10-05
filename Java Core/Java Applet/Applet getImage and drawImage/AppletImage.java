
/*
	getImage and drawImage inside Applet
	This program is run using AppletImage.html file, hence applet tag is present inside html file.
*/

import java.applet.*;
import java.awt.*;

public class AppletImage extends Applet
{
	Image picture;			//global class Image type object since using it in two different methods.
	
	public void init()		//This is optional method, can write init() definitions inside paint() as well.
	{
		picture = getImage(getDocumentBase(), "Detach_from_the_Outome.jpg");		//load the image and placed it in picture object
		
		//picture = getImage(getCodeBase(), "Detach_from_the_Outome.jpg");
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(picture, 20, 20, this);		//g.drawImage(image, x, y, ImageObserver);	(this -> ImageObserver object)
	}
	
}