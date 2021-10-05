
/* Thread in java, by extending threat class, of java.lang package */

public class ExtendsThread extends Thread {

	/* run() method belongs to Thread class, and it is called when start() method of class Thread is invoked 
	 * Here, we are overriding the run() method,
	 * though,  If we don't override run() method, compiler will not flash any error and it will execute run() 
	   method of Thread class that has empty implemented, So, there will be no output for this thread
	 *
	 * */
	
	public void run() {
		System.out.println("Inside run(), Thread is running...");
	}
	
	public static void main(String[] args) {

		/* Creating an instance of ExtendsThread class, which extends class Thread, and hence we can called method of,
		 * thread using instance of ExtendsThread
		 *  */
		ExtendsThread et1 = new ExtendsThread();
		
		System.out.println("\n ouside Thread, before call to start() method");
		
		/* start() method belong to Thread class, and its invoked run() method */
		et1.start();
		System.out.println("\n ouside Thread, after call to start() method");
	
	} /* main() close */

} /* class ExtendsThread close */
