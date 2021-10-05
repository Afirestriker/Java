
import java.awt.*;

public class AWTPracticeProgram extends Frame
{
	AWTPracticeProgram(){

		Label l1 = new Label("This is AWT");
		add(l1);
		
		add(new Label("Program"));
		
		
		setVisible(true);
		setSize(600, 200);	//setSize(widht, height);
		setLayout(new FlowLayout());
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n\tRunning AWT");
		AWTPracticeProgram obj = new AWTPracticeProgram();
	}
}