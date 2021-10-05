
/*
Slip 28 Q2
Write a Package TYBCA which has two classes Subject and Marks. Subject
Class is for accepting Subjects and Marks class is to accept marks. Create
a main class which will use package and calculate total marks and
percentage.
*/

import java.util.*;

import TYBCA.Subject;
import TYBCA.Marks;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Subject sub = new Subject();
		Marks mrk = new Marks();
		
		int rollno;
		String studentname;
		
		int totalsubject = 4;
		int max_mark_per_subject = 50;
		int max_mark_possible = totalsubject*max_mark_per_subject;
		int totalmarks=0;
		float percentage;
		
		String subjects[] = new String[totalsubject];
		int mark[] = new int[totalsubject];
		
		System.out.print("\n\tEnter Student Roll.No: ");
		rollno = scan.nextInt();
		
		System.out.print("\tEnter Student Name: ");
		studentname = scan.next();
		
		sub.getSubject(subjects);
		mrk.getMarks(subjects, mark, max_mark_per_subject);
		
		for(int i=0; i<mark.length; i++)
			totalmarks = totalmarks + mark[i];
		
		percentage = (totalmarks*100)/max_mark_possible;
		
		System.out.println("\n\tStudent Roll.No: " + rollno + "  Name: " + studentname);
		System.out.println("\tTotal marks got: " + totalmarks);
		System.out.println("\tPercentage     : " + percentage); 
		
	}
}