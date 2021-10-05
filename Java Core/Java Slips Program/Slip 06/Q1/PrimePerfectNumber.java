
/*
Slip 06 Q1
Write a java Program to accept ‘n’ no’s through the command line and
store all the prime no’s and perfect no’s into the different arrays and
display both the arrays
*/

import java.lang.*;

public class PrimePerfectNumber
{
    static void primeNumber(int [] numbers)
    {
        int primes[] = new int[numbers.length];
        int fact, primesIndex=0;
        for(int i=0; i<numbers.length; i++)
        {
            fact = numbers[i]/2;
            while(fact > 1)
            {
                if(numbers[i] % fact == 0)
                    break;
                fact--;
            }
            if(fact == 1)
            {
                primes[primesIndex] = numbers[i];
                primesIndex++;
            }
        }//for loop close

        System.out.println("\n\tDisplaying Primes Numbers: ");
        for(int i=0; i<primesIndex; i++)
        {
            System.out.print("\t" + primes[i]);
        }
    }

    static void perfectNumber(int [] numbers)
    {
        int perfects[] = new int[numbers.length];
        int fact, sum=0, perfectsIndex=0;
        for(int i=0; i<numbers.length; i++)
        {
            sum=0;
            fact = numbers[i]/2;
            while(fact > 0)
            {
                if(numbers[i] % fact == 0)
                {
                    sum = sum + fact;
                }
                fact--;
            }

            if(sum == numbers[i])
            {
                perfects[perfectsIndex] = numbers[i];
                perfectsIndex++;
            }
        }// for close

        System.out.println("\n\n\tDisplaying Perfect Numbers: ");
        for(int i=0; i<perfectsIndex; i++)
        {
            System.out.print("\t" + perfects[i]);
        }
    }

    public static void main(String []args)
    {
        int numbers[] = new int[args.length];

        for(int i=0; i<args.length; i++)
        {
            numbers[i] = Integer.parseInt(args[i]);
        }

        primeNumber(numbers);
        perfectNumber(numbers);

    } //main() close
} // class PrimePerfecNumber close