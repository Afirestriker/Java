
/*
Slip 22 Q2
Write a program that accepts two numbers from the user. Perform
division of the two numbers. Handle the exception if the right input is
not given and also if the denominator entered is zero.
*/

import java.util.*;

public class DivisionException
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scan = new Scanner(System.in);
			int num1, num2;
			
			System.out.print("\n\tEnter Integer Number 1: ");
			num1 = scan.nextInt();
			
			System.out.print("\tEnter Integer Number 2: ");
			num2 = scan.nextInt();
			
			float result = (float)(num1/num2);	
			System.out.println("\n\tDivision Result: " + result);
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("\n\tInvalid input must be an Integer value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n\tDivide by Zero Exception");
		}		
	}
}