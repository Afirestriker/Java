
/*
Slip 09 Q1
Write a Java program to accept 2 matrices and display their sum. 
*/

import java.util.*;

public class MatricesSum
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rowsize, colsize;
        System.out.print("\n\t Enter Row Size: ");
        rowsize = scan.nextInt();
        System.out.print("\t Enter Col Size: ");
        colsize = scan.nextInt();

        int matrixA[][] = new int[rowsize][colsize];
        int matrixB[][] = new int[rowsize][colsize];
        int matrixC[][] = new int[rowsize][colsize];

        System.out.println("\n Enter Matrix A elements: ");
        for(int i=0; i<rowsize; i++)
        {
            for(int j=0; j<colsize; j++)
            {
                matrixA[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n Enter Matrix B elements: ");
        for(int i=0; i<rowsize; i++)
        {
            for(int j=0; j<colsize; j++)
            {
                matrixB[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n Sum of Both Matrix");
        for(int i=0; i<rowsize; i++)
        {
            for(int j=0; j<colsize; j++)
            {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print("\t" + matrixC[i][j]);
            }
            System.out.println();
        }
    }
}