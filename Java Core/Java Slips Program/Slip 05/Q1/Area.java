
/*
Slip 05 Q1
Define an Interface Shape with abstract method area(). Write a java
program to calculate an area of Circle and Sphere. 
*/

import java.util.*;

interface Shape
{
    void area();
}

class Circle implements Shape
{
    private float radius;
    private final float pie = (float)3.14;
    private float area;

    public void area()      //interface shape->area() implementation
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculate Area of Circle: ");
        System.out.print("\nEnter Circle Radius: ");
        radius = scan.nextFloat();

        area = pie*(radius*radius);
        System.out.println("\t Area of Circle: " + area);
    }
}   //Class Circle closed

class Sphere implements Shape
{
    private float radius;
    private final float pie = (float)3.14;
    private float area;

    public void area()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calcualte Area of Sphere: ");
        System.out.print("\nEnter Sphere Radius: ");
        radius = scan.nextFloat();

        area = 4*pie*(radius*radius);
        System.out.println("\t Area of Sphere: " + area);
    }
}

public class Area
{
    public static void main(String []args)
    {
        Circle c1 = new Circle();
        Sphere s1 = new Sphere();

        System.out.println("\n***********************************************\n");
        c1.area();

        System.out.println("\n***********************************************\n");
        s1.area();
    }
}