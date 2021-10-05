
//Interface in java

import java.lang.*;

interface TwoWheeler{
	void run();		//by default, public and abstract
	public abstract void gear(); // no issue even it we use keywoed public and abstract explicitly.
}

class Honda implements TwoWheeler{
	public void run(){
		System.out.println("\n Running Honda bike");
	}
	
	public void gear(){
		System.out.println("\n Gear Changed ");
	}
}

public class Bike{
	public static void main(String [] args)
	{
		Honda h1 = new Honda();
		
		h1.run();
		h1.gear();
		h1.run();
	}
}