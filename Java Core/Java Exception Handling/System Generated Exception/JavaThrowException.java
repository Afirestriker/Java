
/*
throw new airthmetic excepting and not using try and catch block
*/

public class JavaThrowException
{
	public static void main(String[] args)
	{
		
		if(19>18)
		{
			throw new ArithmeticException("Invalid age exception");
		}
		else
			System.out.println("\nValid age");
		
	}
}