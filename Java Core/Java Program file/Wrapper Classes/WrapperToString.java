
//Converting wrapper object into string using toString() method

import java.lang.*;

public class WrapperToString{
	public static void main(String[] args){
		
		Integer i = 100;
		
		System.out.println("\n\tInteger i: " + i);
		
		String s = i.toString();
		System.out.println("\n\tString s = i.toString() => " + s);
		
		System.out.println("\tString s.length(): " + s.length());
	}
}
