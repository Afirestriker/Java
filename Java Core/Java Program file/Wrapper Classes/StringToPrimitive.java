
//converting String type into primitive using parsexxx() method
/*
We can use the Integer.parseInt() to get the corresponding primitive int value of a String 
or use Integer.valueOf() to get the corresponding value of Integer wrapper class. 
If the string is not an integer, NumberFormatException will be thrown.
*/

import java.lang.*;

public class StringToPrimitive{
	public static void main(String[] args){
		
		String s = "100";
		System.out.println("\n\tString s = " + "\"" + s + "\" ");
		
		System.out.println("\n\ts to int    : " + Integer.parseInt(s));
		System.out.println("\n\ts to float  : " + Float.parseFloat(s));
		System.out.println("\n\ts to double : " + Double.parseDouble(s));
		System.out.println("\n\ts to long   : " + Long.parseLong(s));
		System.out.println("\n\ts to short  : " + Short.parseShort(s));
		System.out.println("\n\ts to boolean: " + Boolean.parseBoolean(s));
		System.out.println("\n\ts to char   : " + s.toCharArray());

		System.out.println("\n\t*************************");
		
		String b = "True";
		System.out.println("\n\n\tString s = " + "\"" + b + "\" ");
		System.out.println("\n\ts to boolean: " + Boolean.parseBoolean(b));
	}
}
