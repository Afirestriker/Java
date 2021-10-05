
/*
Slip 28 Q1
Write a Java program to accept 'n' elements from user and display it in
ascending order. (Using Command Line Arguments)
*/

public class Number
{
	static void sortNumberInAsc(int numbers[])
	{
		for(int i=0; i<numbers.length-1; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i] > numbers[j])
				{
					numbers[i] = numbers[i] + numbers[j];
					numbers[j] = numbers[i] - numbers[j];
					numbers[i] = numbers[i] - numbers[j];
				}
			}
		}
	}
	
	static void displayArray(int []arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("\t" + arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int size = args.length;
		int []numbers = new int[size];
		
		for(int i=0; i<size; i++)
		{
			numbers[i] = Integer.parseInt(args[i]);
		}
		
		sortNumberInAsc(numbers);
		
		System.out.println("\n\tDisplaying all numbers in ascending order: \n");
		displayArray(numbers);
	}
}