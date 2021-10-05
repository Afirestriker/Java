
/*
Q. Write a java program to create a package games. 
Create 2 classes indoor and outdoor. 
Display names of indoor and outdoor games. */

//import games.*; //doubt => shows erros
import games.IndoorGames;
import games.OutdoorGames;

public class Games
{
	public static void main(String args[])
	{
		IndoorGames in = new IndoorGames();
		OutdoorGames out = new OutdoorGames();
		
		in.gamesName();
		out.gamesName();
	}
}
