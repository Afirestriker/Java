
//sorting cities name in descending order

import java.lang.*;
import java.util.*;

public class CityName{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int size, i, j;
		System.out.print("\n Total cities: ");
		size = sc.nextInt();
		
		String cityNames[] = new String[size];
		
		System.out.println("\n Enter cities name: ");
		for(i=0; i<cityNames.length; i++)
		{
			System.out.print("\n City " + (i+1) + ": ");
			cityNames[i] = sc.next();
		}
		
		Arrays.sort(cityNames, Collections.reverseOrder());
		
		//Arrays.sort(cityNames, Collections.reverseOrder());
		System.out.println("\n\nDisplaying city names in reverse order");
		for(i=0; i<cityNames.length; i++)
		{
			System.out.println("\n City " + (i+1) + ": " + cityNames[i]);
		}
	}
}
