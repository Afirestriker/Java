
import java.awt.*;
import java.awt.event.*;

public class JavaAwt extends Frame implements ActionListener
{
	JavaAwt()
	{
		Button b1 = new Button("Submit");
		add(b1);
		b1.addActionListener(this);
		
		setLayout(new FlowLayout());
		setSize(200, 200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Label l1 = new Label("Action noted");
		
		add(l1);
	}
	
	public static void main(String[] args)
	{
		JavaAwt obj = new JavaAwt();
	}
}