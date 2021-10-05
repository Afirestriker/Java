
import java.util.*;

public class Sum
{
	public static void main(String args[])
	{

		Scanner scan = new Scanner(System.in);
		int n1, n2, sum;
		System.out.print("Enter number one: ");
		n1 = scan.nextInt();

		System.out.print("Enter number two: ");
		n2 = scan.nextInt();

		sum = n1+n2;
		System.out.println("Sum: " + sum);
	}
}