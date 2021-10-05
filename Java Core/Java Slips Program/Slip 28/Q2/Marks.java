
/*
Slip 28 Q2
Write a Package TYBCA which has two classes Subject and Marks. Subject
Class is for accepting Subjects and Marks class is to accept marks. Create
a main class which will use package and calculate total marks and
percentage.
*/

package TYBCA;

import java.util.*;

public class Marks
{
	public void getMarks(String subjects[], int marks[], int max_mark_per_subject)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n Enter marks for each subjects: (NOTE: Marks Range (0-50))");
		for(int i=0; i<marks.length; i++)
		{
			System.out.print("\t" + subjects[i] + " marks: ");
			marks[i] = scan.nextInt();
			
			if(marks[i] > max_mark_per_subject)
			{
				System.out.println("\n\t Invalid Input marks must be between 0-" + max_mark_per_subject);
				System.exit(0);
			}
		}
	}
}