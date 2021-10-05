package Animal;

public class WaterAnimal {

	public static void displayName()
	{
		System.out.println("\nWaterAnimal Name");
		
		String waterAnimalName [] = {"Shark", "Bale", "StarFish"};

		for(int i=0; i<waterAnimalName.length; i++)
		{
			System.out.println((i+1) + ": " + waterAnimalName[i]);
		}
	}
	
	//In this code main is optional
	public static void main(String[] args) {
		
	}

}
