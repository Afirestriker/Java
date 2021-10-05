
//Program to check whether given year is leap year or not

import java.util.*;

public class LeapYear
{
	static void LeapYear(int year)
	{
		if( (year%4==0 && year%100!=0) || year%400 == 0 )
			System.out.println("\n\t" + year + " is a leap year.");
		else
		{
			System.out.println("\n\t" + year + " is not a leap year.");
		}
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int year;
		
		System.out.println("\nProgram to find whether entered year is leap year or not");
		System.out.print("\nEnter Year: ");
		year = in.nextInt();
		
		LeapYear(year);
		
	}
}