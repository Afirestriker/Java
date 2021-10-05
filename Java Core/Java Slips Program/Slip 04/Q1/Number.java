
/*
Slip 04 Q1
Write a Java program to accept n numbers from user. Store them in an
array and display them in descending order.
*/

import java.lang.*;
import java.util.*;

public class Number
{
    static void convertToDsc(int numbers[])
    {
        for(int i=0; i<numbers.length-1; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                if(numbers[j]>numbers[i])
                {
                    numbers[i] = numbers[i] + numbers[j];
                    numbers[j] = numbers[i] - numbers[j];
                    numbers[i] = numbers[i] - numbers[j];
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size;

        System.out.print("\n Enter total numbers to enter: ");
        size = scan.nextInt();

        int numbers[] = new int[size];

        System.out.println("\n Enter numbers: ");
        for(int i=0; i<size; i++)
            numbers[i] = scan.nextInt();

        convertToDsc(numbers);

        System.out.println("\n Displaying array list in descending order: ");
        for(int i=0; i<numbers.length; i++)
            System.out.print(numbers[i] + "\t");
        
        //scan.close();
    }
}
