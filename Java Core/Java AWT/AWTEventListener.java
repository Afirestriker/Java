
import java.awt.*;
import java.awt.event.*;	//use especially when working on event listener in AWT

public class AWTEventListener extends Frame implements ActionListener
{
	Label l1, l2;
	Button btSubmit;
	
	AWTEventListener()
	{
		l1 = new Label("Welcome ");
		btSubmit = new Button("Submit");
		add(btSubmit);
			btSubmit.addActionListener(this);
			
		setLayout(new GridLayout(2,1));
		setSize(400, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btSubmit)
		{
			add(l1);
		}
	}
	
	public static void main(String[] args)
	{
		AWTEventListener obj = new AWTEventListener();
	}
}