
/*
Slip 20 Q2
Write a Java program to raise a user defined exception if number
entered is <1000.
*/

import java.util.*;

public class NumberException
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			int num;
			
			System.out.print("\n\tEnter Number > 1000 : ");
			num = scan.nextInt();
			
			if(num < 1000)
				throw new Exception("Invalid Number Exception");
			else
				System.out.println("\n\tNumber is valid");
			
			System.out.println("\n\n\tRest of code in try block");
		}
		
		catch(Exception e)
		{
			System.out.println("\n\t" + e);
		}
		
		System.out.println("\n\n\tRest of code outside try and catch block");
		
	}
}