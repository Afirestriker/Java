
/* Demonstrate the working of Traffic signal using multiple thread */

package thread.multiple;

public class TrafficSignal extends Thread {

	public void run()
	{
		String threadName = Thread.currentThread().getName();
		
		try {
			
			if(threadName.equals("red"))
			{
				System.out.println(threadName + " signal");
				Thread.sleep(1000*60);
			}
			
			if(threadName.equals("orange"))
			{
				System.out.println(threadName + " signal");
				Thread.sleep(1000*5);
			}
			
			if(threadName.equals("green"))
			{
				System.out.println(threadName + " signal");
				Thread.sleep(1000*60);
			}
		}
		catch(Exception e)
		{
			System.out.println("TrafficSignal " + threadName + " Exception: " + e);
		}
		
		
	}
	
	public static void main(String[] args)
	{
		TrafficSignal red = new TrafficSignal();
		red.setName("red");
		red.start();
		
		TrafficSignal orange = new TrafficSignal();
		orange.setName("orange");
		orange.start();
		
		TrafficSignal green = new TrafficSignal();
		green.setName("green");
		green.start();
		
	}
	
}
