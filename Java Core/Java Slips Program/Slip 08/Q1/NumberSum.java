
/*
Slip 08 Q1
Write a Java program to accept numbers using command line argument.
Display the total count of numbers accepted and also display the sum
*/

public class NumberSum
{
    public static void main(String[] args)
    {
        int count = args.length;
        int sum=0;
        int numbers[] = new int[args.length];

        for(int i=0; i<args.length; i++)
        {
            numbers[i] = Integer.parseInt(args[i]);
            sum = sum + numbers[i];
        }

        System.out.println("\n\t Total Numbers count: " + count);
        System.out.println("\t Sum of all Nubmer: " + sum);

    }
}