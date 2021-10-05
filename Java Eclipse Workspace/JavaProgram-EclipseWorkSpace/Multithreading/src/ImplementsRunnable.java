
/* Creating thread, By implementing Runnable interface of java.lang package */

public class ImplementsRunnable implements Runnable {

	/* Here, run() is an abstract method of interface Runnalbe and hence it is mandatory to override it inside ImplementsRunnable class */
	public void run() {
		System.out.println("This run() method of Runnable Method \n \t Thread Running...");
	}
	
	public static void main(String[] args) {
		
		ImplementsRunnable ir1 = new ImplementsRunnable();
		
		/* Here, we are creating an instance of Thread class, since Runnable interface only has method run() and,
		 * start() and other methods are inside the Thread class.
		 *  */
		Thread thread1 = new Thread(ir1);
		
		thread1.start();
		System.out.println("\n ouside Thread, after call to start() method");
		
	}

}
