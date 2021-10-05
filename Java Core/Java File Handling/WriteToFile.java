
//writing inside a file

import java.io.*;

public class WriteToFile
{
	public static void main(String[] args)
	{

		try
		{
			FileWriter fw = new FileWriter("WriteToFile.txt");

			fw.write("inside file");
			fw.close();

			System.out.println("\nFile wrote successfully...");

		}//try block close

		catch(Exception e)
		{
			System.out.println(e);
		}//catch block close

	}
}