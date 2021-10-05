
public class ArrayException
{
	public static void main(String[] args)
	{
		try
		{
			int []arr = new int[4];
			
			arr[4] = 2;
		}
		catch(Exception e)
		{
			System.out.println("\nArray Exception: " + e);
		}
		
		System.out.println("\nProgram ends......");
	}
}