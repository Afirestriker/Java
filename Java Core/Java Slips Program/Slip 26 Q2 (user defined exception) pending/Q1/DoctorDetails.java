
/*
Slip 26 Q1
Define an abstract class Hospital with protected members id and name.
Define a
parameterized constructor. Define one sub class doctor with member
department. Create n objects of Doctor and display all details. 
*/

import java.util.*;

abstract class Hospital
{
	protected int id;
	protected String name;
}

class Doctor extends Hospital
{
	private int docid;
	private String docname;
	private String department;
	
	Doctor() {}
	Doctor(int did)
	{
		Scanner scan = new Scanner(System.in);
		docid = did;
		
		System.out.println("\nEnter details of doctor with ID: " + (did));
		System.out.print("Enter Hospital ID: ");
		id = scan.nextInt();
		
		System.out.print("Enter Hospital Name: ");
		name = scan.next();
		
		System.out.print("Enter Doctor Name: ");
		docname = scan.next();
		
		System.out.print("Enter Department: ");
		department = scan.next();
	}
	
	void display()
	{
		System.out.println("\n**************************************************\n");
		System.out.println("\tDisplaying doctor ID: " + docid + " details: ");
		System.out.println("\tHospital ID: " + id + "  Name: " + name);
		System.out.println("\tDoctor Name: " + docname + "  Department: " + department);
		
	}
}

public class DoctorDetails
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.print("\nEnter total doctor: ");
		n = scan.nextInt();
		
		Doctor d[] = new Doctor[n];
		
		//set doctor details
		for(int i=0; i<n; i++)
		{
			d[i] = new Doctor((i+1));
		}

		//display doctor details
		System.out.println("\nDisplaying All doctor details \n");
		for(int i=0; i<n; i++)
		{
			d[i].display();
		}
		
	}
}