
//Java String class and its methods

public class StringClass{

	public static void main(String args[])
	{

		String str = "Hello";
		String str1 = "Hello";
		String str2 = new String("Hello");
	
		if(str == str1)
			System.out.println("\n" + str + " == " + str1);

		if(str == str2)
			System.out.println("\n" + str + " == " + str2);
		else
			System.out.println("\n" + str + " != " + str2);
	}
}
