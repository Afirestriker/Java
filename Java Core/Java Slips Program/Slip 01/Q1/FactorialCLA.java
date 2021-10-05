
/*
Slip 01 Q1
Write a Java program to accept number from command line argument
and display its factorial. 
*/

import java.lang.*;

public class FactorialCLA{
	
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		int temp = num;
		int fact=1;
		
		while(temp > 0)
		{
			fact = fact * temp;
			temp--;
		}
		
		System.out.println("\n\tFactorial of " + num + " is: " + fact);
	}
}