
/*
Slip 20 Q1
Write a Java program to overload the method to calculate volume of
cylinder, cube and sphere.
*/

public class ShapesVolumne
{
	static final double pie = 3.14d;
	
	//volumne of cylinder: pie * (r*r) * h;
	static void volumne(double radius, int height)
	{
		System.out.println("\n\t Given Cylinder Radius: " + radius + " and Height: " + height);
		System.out.println("\t Voumne of Cylinder: " + pie* (radius*radius) * height);
	}
	
	//volumne of cube: edge*edge*edge;
	static void volumne(int edge)
	{	
		System.out.println("\n\t Given Cube edge: " + edge);
		System.out.println("\t Volumne of Cube: " + edge*edge*edge);
	}
	
	//volumne of sphere: 4/3 * pie * (r*r*r);
	static void volumne(double radius)
	{	
		System.out.println("\n\t Given Sphere Radius: " + radius);
		System.out.println("\t Volumne of Sphere: " + 4/3 * pie * (radius*radius*radius));
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n Calculate volumne of cylinder");
		volumne(2.2, 2);
		
		System.out.println("\n Calculate volumne of Cube");
		volumne(2);
		
		System.out.println("\n Calculate volumne of Sphere");
		volumne(2.2);
	}
}