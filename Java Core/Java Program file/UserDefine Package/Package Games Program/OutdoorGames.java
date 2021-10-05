
/*
Q. Write a java program to create a package games. 
Create 2 classes indoor and outdoor. 
Display names of indoor and outdoor games. */

package games;

public class OutdoorGames
{
	public void gamesName()
	{
		String games[] = {"Cricket", "Basketball", "Tennis", "Polo"};
		
		System.out.println("\n Outdoor Games Name:");
		for(int i=0; i<games.length; i++)
			System.out.println("\t" + (i+1) + ": " + games[i]);
	}
}