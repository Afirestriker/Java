
import java.awt.*;
//importing java.awt package classes and interfaces.

public class AWTcomponents extends Frame //extending Frame class which belong to java.awt package
{	
	AWTcomponents()
	{
		/* This is class AWTcomponents default constructor, we will be defining all component inside this constructor only
		 * so that the component will be created and loaded on the frame as soon as the object of AWTcomponents class is created.
		*/
		
		//Label class
		Label l = new Label("Welcome");
		add(l);

		//Button class
		Button bt1 = new Button("Click");
		add(bt1);
		
		add(l);	// adding previous label again will not input label "Welcome" twice but will change it position.

		//TestField Class
		TextField tf1 = new TextField("");
		add(tf1);

		//Additing button with using reference object variable.
		add(new Button("Submit"));
		
		//Checkbox Class
		Checkbox cb1 = new Checkbox("CheckIT");
		cb1.setState(true);	//this will select cb1 item automatically when this statement exexutes.
		add(cb1);
		
		Checkbox cb2 = new Checkbox("Check2");
		cb2.setState(true);
		add(cb2);
		
		
		//CheckboxGroup class
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb3 = new Checkbox("Radio1", cbg, true);	//true specify that Radio1 will be selected as soon as it is created and inserted.
		add(cb3);
		add(new Checkbox("Radio2", cbg, false));
		
		add(new Label(cbg.getSelectedCheckbox().toString()));
		
		//List Class
		List listobj = new List(4);
		listobj.add("Item1");
		listobj.add("Item2");
		add(listobj);
		listobj.setMultipleMode(true);	//by default setMultipleMode(false);
		
		//Choice class
		Choice choiceobj = new Choice();
		choiceobj.add("choice1");
		choiceobj.add("choice2");
		add(choiceobj);
		
		setVisible(true);		
		setSize(800, 400);	//setSize(width, height);
		setLayout(new FlowLayout());	// OR, ==> FlowLayout fl = new FlowLayout(); setLayout(fl);
	}
	
	public static void main(String[] args)
	{
		AWTcomponents obj = new AWTcomponents();
	}
}