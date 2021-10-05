
//Using various String class methods

import java.io.*;

class StringMethods
{

	public static void main(String args[])
	{

		String s1 = "Java";		//Here, s1 and s2 are explicit object i.e defined by user
		String s2 = new String("Java");

	//Length of string
		System.out.psrintln("String s1 length: " + s1.length());	//Here out in system.out.println is an implicit object i.e pre-defined object
		System.out.println("String s2 lenght: " + s2.length() + " \n");

	//compate two string
		if((s1.compareTo(s2)) < 0)
			System.out.println("S1 is smaller than s2");
		else if((s1.compareTo(s2)) > 0)
			System.out.println("S1 is greater than s2");
		else
			System.out.println("Strings are equal");

	//finding last index occurance of a character is given string.
		System.out.println("\ns1.lastIndexOf char a:" + s1.lastIndexOf("a"));

	//finding the first occurance of specifc char in given string
		System.out.println("\ns1.indexOf char a: " + s1.indexOf("a")); 

	//converting String to upper case
		System.out.println("\nConverting s1 to uppercase: " + s1.toUpperCase());
	}
}