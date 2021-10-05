
/* 
 * Slip18 1. Write a program using thread to display odd numbers between 11 to 30 with a delay of one second.
 * */

public class Slip18Q1 implements Runnable{

	/* run() overriding is necessary, since it is a abstract method in Runnable interface */
	public void run()
	{
		try {
			int startNum = 11;
			int endNum = 30;
			
			while(startNum <= endNum)
			{
				if(startNum % 2 != 0)
				{
					System.out.println(Thread.currentThread().getName() + ": " + startNum);
					
					/* sleep statement is inside if-condition, because
					 * we want to display odd numbers after one second of delay, and
					 * if sleep statement is outside if-condition, then it will execute for every
					 * while loop cycle and it will be 2 second of delay in total
					 *  */
					Thread.sleep(1000); /* sleep thread for 1000 milliseconds i.e 1 second */
				}
				
				startNum++;
			}
		}
		catch(Exception e)
		{
			System.out.println("\nSlip18Q1 run() Exception: " + e);
		}
	}
	
	public static void main(String args[])
	{
		Slip18Q1 obj1 = new Slip18Q1();
		
		Thread t1 = new Thread(obj1);
		
		t1.setName("ThreadOddNumber");
		t1.start();
		
	} /* main() close */
	
} /* Slip18Q1 close */
