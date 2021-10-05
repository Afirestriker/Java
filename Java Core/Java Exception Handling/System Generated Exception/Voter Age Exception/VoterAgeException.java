
import java.util.*;

public class VoterAgeException
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			int age;
			
			System.out.print("\n Enter Person Age: ");
			age = scan.nextInt();
			
			if(age < 18)
			{
				throw new ArithmeticException("Age must be greater than 18 for eligible to vote");
			}
			else
			{
				System.out.println("You are allowed to vote");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n" + e);
		}
		
		System.out.println("\nThanks for coming");
	}
}