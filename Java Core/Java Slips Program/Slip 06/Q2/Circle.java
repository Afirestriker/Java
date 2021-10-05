
/*
Slip 06 Q2
Write a Java program to create a package shapes. Create two classes
rectangle and circle in the package and display area of rectangle and
circle respectively
*/

package shapes;

import java.util.*;

public class Circle
{
    public void area()
    {
        Scanner scan = new Scanner(System.in);
        float radius, area;
        final float pie = 3.14f;

        System.out.println("\n**************************************\n");
        System.out.println(" Calcualte Area of Circle");

        System.out.print("\t Enter Radius: ");
        radius = scan.nextFloat();

        System.out.println("\n\t Area of Circle: " + pie*(radius*radius));
    }
}