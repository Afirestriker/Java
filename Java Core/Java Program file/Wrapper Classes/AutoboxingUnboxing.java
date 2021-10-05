
// Converting all primitive into objects
// Converting all objects into primitive.

import java.lang.*;

public class AutoboxingUnboxing{
	public static void main(String[] args){
		
		byte bt = 6;
		int i = 12;
		float f = 12.0f;
		double d = 12.0d;
		char c = 'c';
		boolean b = true;
		short s = 16;
		long l = 18;
		
		System.out.println("\n Converting all Primitive into objects");
		Byte byteobj = bt;			// primitive into object using parameter contructor
		Integer intobj = Integer.valueOf(i);	//primitive into object using wrapper class method
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean booleanobj = b;
		Short shortobj = s;
		Long longobj = l;
		
		//compile time error since Wrapper class is Final and Immutable just like String class
		//double doubleobj = intobj + floatobj;
		
		System.out.println("\tByte   : " + byteobj);
		System.out.println("\tInteger: " + intobj);
		System.out.println("\tFloat  : " + floatobj);
		System.out.println("\tDouble : " + doubleobj);
		System.out.println("\tChar   : " + charobj);
		System.out.println("\tBoolean: " + booleanobj);
		System.out.println("\tShort  : " + shortobj);
		System.out.println("\tLong   : " + longobj);
		
		System.out.println("\n Converting all object into primitive");
		byte bytevalue = byteobj;
		int intvalue = intobj.intValue();
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = booleanobj;
		short shortvalue = shortobj;
		long longvalue = longobj;
		
		System.out.println("\tbyte   : " + bytevalue);
		System.out.println("\tint    : " + intvalue);
		System.out.println("\tfloat  : " + floatvalue);
		System.out.println("\tdouble : " + doublevalue);
		System.out.println("\tchar   : " + charvalue);
		System.out.println("\tboolean: " + boolvalue);
		System.out.println("\tshort  : " + shortvalue);
		System.out.println("\tlong   : " + longvalue);

	}
}