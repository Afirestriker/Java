
/* Java multi-threading program, to display all the alphabet from A to Z after 3 seconds */

public class AlphabetAtoZ extends Thread {
	
	public void run() {
		
		char alpha = 'A';
		
		while(alpha < 'Z')
		{			
			System.out.println(Thread.currentThread().getName() + " : " + alpha );
			alpha++;
			try {
				/* Thread sleep method throws, InterruptException and hence this statement is inside try block */
				Thread.sleep(1000*3); /* 1000 (milli seconds) mean 1 second and hence 1000*3 i.e 3 seconds */
			}
			catch(Exception e)
			{
				System.out.println("Exception: " + e);
			}
		
		} /* while close */
	} /* run() method close */
	
	
	public static void main(String[] arg) {
		
		AlphabetAtoZ obj1 = new AlphabetAtoZ();
		
		obj1.setName("AlphaThread");
		obj1.start();
		
	} /* main() method close */
	
} /* class AlphabetAtoZ close */
