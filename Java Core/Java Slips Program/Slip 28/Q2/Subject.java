
/*
Slip 28 Q2
Write a Package TYBCA which has two classes Subject and Marks. Subject
Class is for accepting Subjects and Marks class is to accept marks. Create
a main class which will use package and calculate total marks and
percentage.
*/

package TYBCA;

import java.util.*;

public class Subject
{
	public void getSubject(String subjects[])
	{
		Scanner scan = new Scanner(System.in);
			
		System.out.println("\n\n Enter all " + subjects.length + " Subjects Name: ");
		for(int i=0; i<subjects.length; i++)
		{
			System.out.print("\tSubject " + (i+1) + " name: ");
			subjects[i] = scan.next();
		}
		
	}
}