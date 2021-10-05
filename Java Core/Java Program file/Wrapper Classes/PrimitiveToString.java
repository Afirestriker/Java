
//Primitive to String conversion

import java.lang.*;

public class PrimitiveToString{
	public static void main(String[] args){
		
		/*this example used int data type but same is applicable for all other primitive data type.
		 Only in third step: the wrapper class name will chage specific to the type used 
		*/
	
		int i = 100;
		
		System.out.println("\n\t int i = 100");
		
		System.out.println("\n\tDifferent ways to convert primitive type to String");
		System.out.print("\n\tFirst: "); 
			System.out.println("" + i);
		
		System.out.print("\n\tSecond: ");
			System.out.println(String.valueOf(i));
			System.out.println("\tString length: " + String.valueOf(i).length());
			
		System.out.print("\n\tThird: ");
			System.out.println(Integer.toString(i));
			System.out.println("\tString length: " + Integer.toString(i).length());
			
		System.out.println("\n\tThere is one more method called as String.format()");	
			System.out.println("\t\tString.format(Stringformat, object..args): " + String.format("%d", i));
	}
}