
public class StringException
{
	public static void main(String[] args)
	{
		try
		{
			String str = "Str";
			int []arr = new int[4];
			System.out.println("\n\t" + str);
			//int ar = arr[6];
			System.out.println(str.charAt(3));
			System.out.println(100/0);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("\nArithmetic Exception Handler: " + ae);
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("\nString Exception Handler: " + se);
		}
		catch(Exception e)
		{
			System.out.println("\nException Handler: " + e);
		}
		finally
		{
			System.out.println("\nInside Finally block......");
		}
		
		System.out.println("\nProgram ends......");
	}
}