
import java.io.*;

public class FileInputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream finput = new FileInputStream("FileOut.txt");

			//reading single character
			int i = finput.read();

			System.out.println((char)i);
			System.out.println(i);

			//reading multiple character
			int j;
			while( (j=finput.read()) != -1 )
				System.out.print((char)j);

			finput.close();

			System.out.println("\n\nFile reading completed...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}