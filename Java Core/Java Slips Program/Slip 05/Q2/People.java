
/*
Slip 05 Q2
Define an Employee class with suitable attributes having getSalary()
method, which returns salary withdrawn by a particular employee. 
Write a class Manager which extends a class Employee, 
override the getSalary() method, which will return salary of
manager by adding traveling allowance, house rent allowance etc. 
*/

import java.lang.*;
import java.util.*;

class Employee
{
    static int obj;
    protected int id;
    protected String name;
    protected float salaryWithdrawn;

    public void setEmployeeDetail()
    {
        Scanner scan = new Scanner(System.in);

        id = ++obj;
        System.out.println("\n Enter employee " + id + " details: ");
        System.out.print("\t Enter Name: ");
        name = scan.nextLine();
        System.out.print("\t Enter Salary Withdrawn: ");
        salaryWithdrawn = scan.nextFloat();

    }

    public void getSalary()
    {
        System.out.println("\n Salary withdrawn by the employee: ");
        System.out.println("\n\tEmployee ID: " + id + "\tName: " + name + "\tSalary Withdrwan: " + salaryWithdrawn);
    }


}

class Manager extends Employee
{
    static int obj;
    private float salary;
    private float travellingAllowance, houseRentAllowance;

    public void setManagerDetail()
    {
		Scanner scan = new Scanner(System.in);
		
        id = ++obj;
        System.out.println("\n Enter Manager " + id + " details: ");
        System.out.print("\t Enter Name: ");
        name = scan.nextLine();
        System.out.print("\t Enter Salary: ");
        salary = scan.nextFloat();
    }

    public void getSalary()
    {
        travellingAllowance = (salary*10/100) + salary;
        houseRentAllowance = (salary*20/100) + salary;

        salary = salary + travellingAllowance + houseRentAllowance;

        System.out.println("\n Manager Salary: ");
        System.out.println("\n\tManager ID: " + id + "\tName: " + name + "\tSalary: " + salary);
    }

}

public class People
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Manager m1 = new Manager();

        e1.setEmployeeDetail();
        m1.setManagerDetail();

        e1.getSalary();
        m1.getSalary();

    }
}