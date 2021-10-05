
//finding area of circle

import java.util.*;

class Circle
{
	public double radius;

	public double areaOfCircle(double r)
	{
		double pie = 3.14;
		double result = pie * (r*r);
		return result;
	}
}

public class AreaOfCircle
{

	public static void main(String args[])
	{
		Circle c1 = new Circle();
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter Radius: ");
		c1.radius = obj.nextDouble();

		System.out.println("\nGiven circle radius " + c1.radius);
		System.out.println("Area of circle: " + c1.areaOfCircle(c1.radius) );	
	}
}
