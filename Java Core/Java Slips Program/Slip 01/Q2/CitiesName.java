
/*
Slip 01 Q2
Write a java program to accept n names of cities from user 
and display them in descending order
*/

import java.lang.*;
import java.util.*;

public class CitiesName{
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int size, i,j;
		
		System.out.print("\n Enter total cities in number: ");
		size = scan.nextInt();
		
		String citiesName[] = new String[size];
		
		System.out.println("\n Enter cities Name: ");
		
		//accepting cities name
		for(i=0; i<size; i++)
		{
			System.out.print(" City " + (i+1) + " name: ");
			citiesName[i] = scan.next();
		}
		
		//sorting cities in descending order
		for(i=0; i<size-1; i++)
		{
			for(j=i+1; j<size; j++)
			{
				if(citiesName[j].compareTo(citiesName[i]) > 0)
				{
					String temp   = citiesName[i];
					citiesName[i] = citiesName[j];
					citiesName[j] = temp;
				}
			}
		}
		
		//displaying cities name
		System.out.println("\n\n Displaying cities name in descending order: ");
		for(i=0; i<citiesName.length; i++)
		{
			System.out.println(" City " + (i+1) + " : " + citiesName[i]);
		}
		
	}//main method close
}