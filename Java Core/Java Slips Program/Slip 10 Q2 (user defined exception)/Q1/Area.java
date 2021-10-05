
/*
Slip 10 Q1
Write a Java program to overload the method area to display the area of
circle and rectangle
*/

public class Area
{
	static void area(float radius)
	{
		final float pie = 3.14f;
		System.out.println("\n\t Area of Circle: " + pie*(radius*radius));
	}
	
	static void area(int length, int breadth)
	{
		System.out.println("\n\t Area of Rectangle: " + length*breadth);
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n Area of Circle with radius 2: ");
		area(2);
		
		System.out.println("\n Area of Rectangle with length 2 and breadth 4: ");
		area(2, 4);
		
	}
}
