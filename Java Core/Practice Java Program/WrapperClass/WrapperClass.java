
//wrapper class example converting primitive data type into object

public class WrapperClass
{
	public static void main(String[] args)
	{
		int int_num = 6;
		float float_num = 6.6f;
		double double_num = 6.66d;
		
		System.out.println(" Displaying all primitive data type: ");
		System.out.println("int num = " + int_num);
		System.out.println("float num = " + float_num);
		System.out.println("double num = " + double_num);
		
		//converting primitive into objects
		
		Integer obj_int_num = int_num;
		Float obj_float_num = float_num;
		Double obj_double_num = double_num;
		
		System.out.println("\n Displaying all objects data type: ");
		System.out.println("Integer num = " + obj_int_num);
		System.out.println("Float num = " + obj_float_num);
		System.out.println("Double num = " + obj_double_num);
	}
}
