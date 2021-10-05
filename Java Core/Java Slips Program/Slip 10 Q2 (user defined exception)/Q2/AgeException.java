
/*
Slip 10 Q2
Write a Java program to accept age from user and throw a user defined
exception named InValidAgeException if age entered if less than 18. 
*/

import java.util.*;

public class AgeException
{
	public static void main(String[] args)
	{	
		try
		{
			Scanner scan = new Scanner(System.in);
			int age;
			
			System.out.print("\n\tEnter Age: ");
			age = scan.nextInt();
			
			if(age>18)
			{
				throw new ArithmeticException("Invalid Age Exception");
			}
			else
				System.out.println("\n\tYou are allow to vote");
		}
		
		catch(Exception e)
		{
			System.out.println("\t" + e);
		}
	}
}