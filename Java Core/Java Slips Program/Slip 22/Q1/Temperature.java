
/*
Slip 22 Q1
Write a Java program to accept n temperature values in degree and
convert it to Fahrenheit. (Formula : (0°C × 9/5) + 32 = 32°F) .Use array
for the same. 
*/

import java.util.*;

public class Temperature
{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("\nProgram to convert temperature into fahrenheit\n");
		
		System.out.print("Enter total values: ");
		n = scan.nextInt();
		
		float temp[] = new float[n];
		float fahr[] = new float[n];
		
		System.out.println("\n Enter " + n + " temperature values: ");
		for(int i=0; i<n; i++)
		{
			System.out.print("\t" + (i+1) + ": ");
			temp[i] = scan.nextFloat();
			fahr[i] = (temp[i] * 9/5) + 32;
		}
		
		System.out.println("\n Displaying temperature and its fahrenheit values: ");
		for(int i=0; i<n; i++)
		{
			System.out.println("\n\t Temp: " + temp[i] + "\t Fahrenheit: " + fahr[i]);
		}
	}
}