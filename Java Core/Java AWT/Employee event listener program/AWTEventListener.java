
import java.awt.*;
import java.awt.event.*;

public class AWTEventListener extends Frame implements ActionListener
{
	Label firstName, lastName;
	TextField tf_firstName, tf_lastName;
	Button bt_submit, bt_clear, bt_close;
	Panel p1, p2;
	
	AWTEventListener()
	{
		firstName = new Label("Enter First Name:");
		lastName = new Label("Enter Last Name:");
		
		tf_firstName = new TextField("");
		tf_lastName = new TextField("");
		
		bt_submit = new Button("Submit");
			
		bt_clear = new Button("Clear");
		bt_close = new Button("Close");
		
		p1 = new Panel();
		p1.setLayout(new GridLayout(2,2));
		p1.add(firstName);
		p1.add(tf_firstName);
		p1.add(lastName);
		p1.add(tf_lastName);
		
		p2 = new Panel();
		p2.setLayout(new FlowLayout());
		p2.add(bt_submit);
			bt_submit.addActionListener(this);
		p2.add(bt_clear);
			bt_clear.addActionListener(this);
		p2.add(bt_close);
			bt_close.addActionListener(this);
		
		setLayout(new GridLayout(2,2));
		add(p1);
		add(p2);
		setSize(600, 800);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == bt_submit)
		{
			new EmpDetails(tf_firstName.getText(), tf_lastName.getText());
		}
		
		if(ae.getSource() == bt_clear)
		{
			tf_firstName.setText(" ");
			tf_lastName.setText(" ");
		}
		
		if(ae.getSource() == bt_close)
		{
			System.exit(0);	//exit() is the static method of System class. 0 indicate normal termination
		}
	}
	
	public static void main(String[] args)
	{
		AWTEventListener obj = new AWTEventListener();
	}
}