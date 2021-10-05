
import java.util.*;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}

public class CustomException
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.print("\nEnter Age: ");
			int age = scan.nextInt();
			
			if(age <= 18)
			{
				throw new InvalidAgeException("\n Age must be above 18, to vote");
			}
			else
			{
				System.out.println("\nYou are allowed to vote");
			}
		}
		catch(Exception e)
		{
			System.out.println("\n" + e);
		}
		finally
		{
			System.out.println("\nThanks for coming");
		}
	}
}