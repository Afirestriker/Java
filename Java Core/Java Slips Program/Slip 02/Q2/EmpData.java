
/*
Slip 2 Q2
Write a java program to accept the details of ‘n’ employees
 (EName, Salary) from the user, and display them. (Use constructor) 
*/

import java.lang.*;
import java.util.*;

class Employee{
	static int obj;	//static variable deafult value => 0;
	private int eId;
	private String eName;
	private int salary;
	
	Employee()
	{
		Scanner scan = new Scanner(System.in);
		
		obj++;
		eId = obj;
		System.out.println("\n**********************");
		System.out.println("\n Enter employee " + eId + " detail: ");
		System.out.print(" Enter Name  : ");
		eName = scan.nextLine();
		System.out.print(" Enter Salary: ");
		salary = scan.nextInt();
	}
	
	void display()
	{
		System.out.println("\n Displaying employee " + eId + " details: ");
		System.out.println("\t Employee Name  : " + eName);
		System.out.println("\t Employee Salary: " + salary);
	}
}

public class EmpData{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("\n Enter total number of employee: ");
		num = scan.nextInt();

		Employee emp[] = new Employee[num];
		
		for(int i=0; i<num; i++)
			emp[i] = new Employee();
		
		System.out.println("\n***************************");
		System.out.println("\n Displaying all employee details: ");
		
		for(int i=0; i<num; i++)
			emp[i].display();		
	}
}