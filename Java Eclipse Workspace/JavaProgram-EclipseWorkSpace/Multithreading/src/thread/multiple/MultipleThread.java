
/* Java Multithreading program, to demonstrate the working of multiple thread */

/* 
 * NOTE: In multithreading in java, thread are run simultaneously, and are independent of their work
 * */

package thread.multiple;

public class MultipleThread extends Thread{

	public void run()
	{
		try {
			
			String threadName = Thread.currentThread().getName();
			
			for(int i=0; i<=4; i=i+2)
			{	
				System.out.println("Thread " + threadName + i);
				
				Thread.sleep(20);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("MultipleThread "+ Thread.currentThread().getName() +"Exception: " + e);
		}
	}
	
	public static void main(String[] args) {
		
		MultipleThread thread1 = new MultipleThread();
		thread1.setName("Thread 1st: ");
		thread1.start();
		
		MultipleThread thread2 = new MultipleThread();
		thread2.setName("Thread 2nd: ");
		thread2.start();
		
		
	} /* main() close */
	
} /* class MultipleThread close */
