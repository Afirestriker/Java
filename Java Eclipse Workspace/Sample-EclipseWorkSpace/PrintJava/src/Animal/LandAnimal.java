
package Animal;

public class LandAnimal
{	
	public static void displayName()
	{
		System.out.println("\nLandAnimal Name");

		
		String landAnimalName [] = {"Dog", "Cat", "Lion"};
		
		for(int i=0; i<landAnimalName.length; i++)
		{
			System.out.println((i+1) + ": " + landAnimalName[i]);
		}
	}
	
	//main function is not mandatory here
	public static void main(String arg[])
	{
		
	}
}