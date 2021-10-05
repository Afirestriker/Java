
/*
Slip 06 Q2
Write a Java program to create a package shapes. Create two classes
rectangle and circle in the package and display area of rectangle and
circle respectively
*/

import shapes.Rectangle;
import shapes.Circle;

public class Area
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        r1.area();
        c1.area();
    }
}