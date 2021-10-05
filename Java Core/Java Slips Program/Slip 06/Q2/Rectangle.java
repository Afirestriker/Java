
/*
Slip 06 Q2
Write a Java program to create a package shapes. Create two classes
rectangle and circle in the package and display area of rectangle and
circle respectively
*/

package shapes;

import java.util.*;

public class Rectangle 
{
    public void area()
    {
        Scanner scan = new Scanner(System.in);
        int length, breadth;

        System.out.println("\n******************************\n");
        System.out.println(" Calculate Area of Rectangle");

        System.out.print("\t Enter Length: ");
        length = scan.nextInt();

        System.out.print("\t Enter Breadth: ");
        breadth = scan.nextInt();

        System.out.println("\n\t Area of Rectangel: " + length*breadth);
    }
}
