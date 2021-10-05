
import java.io.*;

public class FileOutputStreamExample
{
	public static void main(String[] args)
	{
		try{

			FileOutputStream fout = new FileOutputStream("FileOut.txt");

			//write byte
			fout.write(65);

			//write String
			String s = "this is string";
			byte b[] = s.getBytes(); //converting string into byte array
			fout.write(b);


			fout.close();

			System.out.println("\nFile output successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}