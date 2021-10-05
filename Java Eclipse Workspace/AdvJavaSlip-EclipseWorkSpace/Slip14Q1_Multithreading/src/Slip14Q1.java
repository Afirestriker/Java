
/* 
 * Slip14 1. Write a program using thread which displays 51 to 100 numbers with a delay of 1 sec.
 * */

public class Slip14Q1 extends Thread {

	public void run() {
		
		try {
			for(int i=51; i<=100; i++)
			{
				System.out.println(Thread.currentThread().getName() + ": " + i);
				Thread.sleep(1000); // sleep thread for 1000 milliseconds i.e 1 second
			}
		}
		catch(Exception e)
		{
			System.out.println("Slip14Q1 run() Exception: " + e);
		}
		
	} /* run() close */
	
	public static void main(String[] args)
	{
		Slip14Q1 obj1 = new Slip14Q1();
		
		obj1.setName("NumThread");
		obj1.start();
		
	} /* main() close */
	
} /* public class Slip14Q1 close */
