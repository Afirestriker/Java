
/*
Slip 03 Q2
Define a class Student with attributes rollno and name. Define default
and parameterized constructor. Override the toString() method. Keep
the count of Objects created. Create objects using parameterized
constructor and Display the object count after each object is created.
*/

class Student
{
    static int objCount;
    private int rollno;
    private String name;

    Student()
    {
        objCount++;
        System.out.println("\n Total object counts: " + objCount);
    }

    Student(int rollno, String name)
    {
        objCount++;
        this.rollno = rollno;
        this.name = name;

        System.out.println("\n Total object counts: " + objCount);
    }

    public String toString()
    {
        return "\n\tRoll.No: " + rollno + "\tName: " + name;
    }
}

public class StudentData
{
    public static void main(String []args)
    {
        Student s1 = new Student(01, "Mike");        
        System.out.println(s1);

        Student s2 = new Student(02, "Kite");
        System.out.println(s2);
    }
}