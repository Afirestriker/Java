
//Check whether number is even or odd
import java.util.*;

public class EvenOdd
{
	void EvenOdd(int num)
	{
		if(num % 2 == 0)
			System.out.println("\n\t" + num + " is even number");
		else
			System.out.println("\n\t" + num + " is odd number");
	}
	
	public static void main(String args[])
	{
		EvenOdd obj1 = new EvenOdd();
		Scanner in = new Scanner(System.in);
		int num;
		
		System.out.println("\nProgram to check whether number is even or odd");
		
		System.out.print("\nEnter number: ");
		num = in.nextInt();
		
		obj1.EvenOdd(num);
		
	}
}