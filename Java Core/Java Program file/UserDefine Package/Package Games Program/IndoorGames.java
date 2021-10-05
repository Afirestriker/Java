
/*
Q. Write a java program to create a package games. 
Create 2 classes indoor and outdoor. 
Display names of indoor and outdoor games. */

package games;

public class IndoorGames
{
	public void gamesName()
	{
		String games[] = {"Chess", "Board", "Carrom-Board", "Hide&Seek"};
		
		System.out.println("\n Indoor Games Name:");
		for(int i=0; i<games.length; i++)
			System.out.println("\t" + (i+1) + ": " + games[i]);
	}
}
