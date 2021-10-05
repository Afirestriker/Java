
/* 
 * Slip 20 1. Write a program using thread which displays current date and time continuously with a
	delay of 1 sec.
 * */

import java.util.*;

public class DateAndTime extends Thread{

	public void run()
	{
		try {
			while(true)
			{
				Date dt = new Date();
				System.out.println(Thread.currentThread().getName() + ": " + dt.toString());
				
				/* Sleep thread for 1000 milliseconds i.e 1 second */
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("\n Slip20Q1 DateAndTime.java run() Exception: " + e);
		}
	}
	
	public static void main(String args[])
	{
		DateAndTime obj1 = new DateAndTime();
		
		obj1.setName("DateAndTime");
		obj1.start();
		
	} /* main() close */
	
} /* class DateAndTime close */
