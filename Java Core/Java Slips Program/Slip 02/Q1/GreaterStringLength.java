
/*
Slip 2 Q1
Write a Java program to accept two strings from user 
and display the string having greater length
*/

import java.lang.*;
import java.util.*;

public class GreaterStringLength{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str1, str2;
		
		System.out.print("\n Enter String 1: ");
		str1 = scan.nextLine();
		
		System.out.print("\n Enter String 2: ");
		str2 = scan.nextLine();
		
		if(str1.length() > str2.length())
		{
			System.out.println("\n\t\"" + str1 + "\" is having greater length");
		}
		else if(str1.length() < str2.length())
		{
			System.out.println("\n\t\"" + str2 + "\" is having greater length");
		}
		else
			System.out.println("\n\t Both String are of same length");

		//scan.close();
	}
}
