
/*
Slip 09 Q2
Write a Java program to create class student. Inherit the class Result
from student and display the student marksheet along with grade. (Use
parametrized constructor)
*/

import java.util.*;

class Student
{
    protected int rollno, std;
    protected String name;
}

public class Result extends Student
{
    private int totalsub, totalmarks=0, outoff;
    private int marks[];
    private char grade;
    private int percentage;

    Result() {}
    Result(int std, int rollno, String name)
    {
        this.std = std;
        this.rollno = rollno;
        this.name = name;
    }

    void setResult()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\tSet Result of standard: " + std + "  Roll.No: " + rollno);
        System.out.print("\n\t Enter Total Subjects: ");
        totalsub = scan.nextInt();
        outoff = totalsub*100;

        marks = new int[totalsub];
        for(int i=0; i<totalsub; i++)
        {
            System.out.print("\t Enter subject " + (i+1) + " marks: ");
            marks[i] = scan.nextInt();
            if(marks[i] > 100)
            {
                System.out.println("\n\tInvalid input, marks must be between 0-100");
                System.exit(0);
            }
            totalmarks = totalmarks + marks[i];
        }

        percentage = (totalmarks * 100) / outoff;

        if(percentage > 90)
            grade = 'A';
        else if(percentage > 80)
            grade = 'B';
        else if(percentage > 75)
            grade = 'C';
        else if(percentage > 45)
            grade = 'D';
        else
            grade = 'F';
    }

    void getResult()
    {
        System.out.println("\n***************************************\n");
        System.out.println("\tXYZ School Marksheet (Year)\n");
        System.out.println("\tStd: " + std + "  Roll.No: " + rollno + "  Name: " + name);
        for(int i=0; i<totalsub; i++)
        {
            System.out.println("\tSubject " + (i+1) + " marks: " + marks[i]);
        }
        System.out.println("\n\tTotal Marks: " + totalmarks);
        System.out.println("\tPercentage: " + percentage + "  Grades: " + grade);
    }

    public static void main(String[] args)
    {
        Result s1 = new Result(04, 01, "Mike");

        s1.setResult();
        s1.getResult();
    }
}
