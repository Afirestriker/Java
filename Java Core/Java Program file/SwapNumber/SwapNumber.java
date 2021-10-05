
//Program to Swap two numbers using temporary variable
import java.util.*;

public class SwapNumber
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int num1, num2, swap;
		
		System.out.println("\nProgram to swap two number");
		
		System.out.print("\nEnter number 1: ");
		num1 = in.nextInt();
		
		System.out.print("Enter number 2: ");
		num2 = in.nextInt();
		
		//swapping process
		swap = num1;
		num1 = num2;
		num2 = swap;
		
		System.out.println("\n****Numbers After Swap****");
		System.out.println("Number 1: " + num1);
		System.out.println("Number 2: " + num2);
		
	}
}