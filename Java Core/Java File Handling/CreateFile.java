
//creating a file
import java.io.*;

public class CreateFile
{
	public static void main(String[] args)
	{
		try
		{
			File fl = new File("File1.txt");

			if(fl.createNewFile())
			{
				System.out.println("File created: " + fl.getName());
			}
			else
			{
				System.out.println("File Already Exists");
			}
		}//try block close
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}