
import java.awt.*;
import java.awt.event.*;

public class EmpDetails	//this program is without extending frame class but creating object of frame class
{
	Frame f = new Frame("Emp Details");
	Label fName, lName;
	
	EmpDetails(String fn, String ln)
	{
		fName = new Label(fn);
		lName = new Label(ln);
				
		f.add(new Label("Welcome "));
		f.add(fName);
		f.add(lName);
		
		f.setLayout(new FlowLayout());
		f.setSize(300, 300);
		f.setVisible(true);
	}
}