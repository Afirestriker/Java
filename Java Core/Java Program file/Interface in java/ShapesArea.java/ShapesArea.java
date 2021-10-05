
/*
write a java program to create an interface shape, 
Derived two classes circle and rectangle from the 
interface shape and 
define the abstract method area in the derived classes.
*/

import java.lang.*;
import java.util.*;

interface Shape{
	void area();
}

class Circle implements Shape{
	public void area(){
		Scanner in = new Scanner(System.in);
		float r, area;
		final float pie= 3.14f;
		
		System.out.print("\n Calculating circle area");
		System.out.print("\n\t Enter circle Radius: ");
		r = in.nextFloat();
		
		System.out.println("\n\t Area of circle: " + pie*(r*r));
	}
}

class Rectangle implements Shape{
	public void area(){
		Scanner in = new Scanner(System.in);
		int l, b, area;
		
		System.out.print("\n\t Calculating Rectangle area");
		System.out.print("\n Enter length: ");
		l = in.nextInt();
		
		System.out.print(" Enter Breadth: ");
		b = in.nextInt();
		
		System.out.println("\n Area of Rectangle: " + l*b);
	}
}

public class ShapesArea{
	public static void main(String [] args)
	{
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();

		c1.area();
		r1.area();
	}
}