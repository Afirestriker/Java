
//converting String type into primitive using parsexxx() method
/*
We can use the Integer.parseInt() to get the corresponding primitive int value of a String 
or use Integer.valueOf() to get the corresponding value of Integer wrapper class. 
If the string is not an integer, NumberFormatException will be thrown.
*/

import java.lang.*;

public class StringToWrapper{
	public static void main(String[] args){
		
		String s = "100";
		System.out.println("\n\tString s = " + "\"" + s + "\" ");
		
		System.out.println("\n\ts to Integer: " + Integer.valueOf(s));
		System.out.println("\n\ts to Float  : " + Float.valueOf(s));
		System.out.println("\n\ts to Double : " + Double.valueOf(s));
		System.out.println("\n\ts to Long   : " + Long.valueOf(s));
		System.out.println("\n\ts to Short  : " + Short.valueOf(s));
		System.out.println("\n\ts to Boolean: " + Boolean.valueOf(s));
		
		System.out.println("\n\t*************************");
		String b = "True";
		System.out.println("\n\tString s = " + "\"" + b + "\" ");
		System.out.println("\n\ts to Boolean: " + Boolean.valueOf(b));
	}
}