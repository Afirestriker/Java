
//display string having greater length

import java.util.*;

public class StringLength
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		String str1, str2;
		
		System.out.print("\nEnter String 1: ");
		str1 = scan.nextLine();
		
		System.out.print("\nEnter String 2: ");
		str2 = scan.nextLine();
		
		if(str1.length() > str2.length())
			System.out.println("\n\t" + str1 + " is having greater length: " + str1.length());
		else if(str2.length() > str1.length())
			System.out.println("\n\t" + str2 + " is having greater length: " + str2.length());
		else
			System.out.println("\n\tBoth String are of same length: " + str1.length() + " == " + str2.length());
	}
}