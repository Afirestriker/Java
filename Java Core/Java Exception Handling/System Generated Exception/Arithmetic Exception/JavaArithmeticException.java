
public class JavaArithmeticException
{
	public static void main(String[] args)
	{
		//int d = 100/0;
		try
		{
			int div = 100/0;
		}
		catch(Exception e)
		{
			System.out.println("\n" + e);
		}
		
		System.out.println("\n\nProgram Ends.......");
	}
}