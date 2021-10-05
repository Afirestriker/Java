
/*
	Write a java program and create abstract class shape. 
	Derive 2 classes circle and rectangle. 
	In derived class define the abstract method display 
	of base class.
*/

import java.util.*;

abstract class Shape
{
	Shape() { System.out.println("\n**************\nShape constructor called \n***********");}
	public abstract void display();
	abstract void area(); //By default abstract methods are public
}

class Circle extends Shape
{
	Circle() { System.out.println("\n Circle object created");}
	double r, pie=3.14d, area;
	
	public void display()
	{
		System.out.println("\n\tArea of circle: " + area);
	}
	
	void area()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("\n\tEnter Circle Radius: "); 
		r = in.nextDouble();
		area = pie * (r*r);
	}
}

class Rectangle extends Shape
{
	Rectangle() {System.out.println("\n Rectangle object created");}
	int l, b;
	
	public void display()
	{
		System.out.println("\n\tArea of Rectangle: " + l*b);
	}
	
	void area()
	{	
		Scanner in = new Scanner(System.in);
		System.out.print("\n\tEnter length: ");
		l = in.nextInt();
		System.out.print("\n\tEnter Breadth: ");
		b = in.nextInt();
	}
}

public class GeometricShapes
{
	public static void main(String args[])
	{
		Circle Cobj = new Circle();
		Cobj.area();
		Cobj.display();
		
		Rectangle Robj = new Rectangle();
		Robj.area();
		Robj.display();
	}
}

/*
 *NOTE: First while inheritance as in above code where we extends shape in circle and rectangle
 * Always the base class constructor is called first and then derived class constructor is called.
*/