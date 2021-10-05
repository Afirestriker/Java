
/*
Slip 03 Q1
Write Java program to accept a number from the user and display if it is
an armstrong number.(Use Scanner) 
*/

import java.lang.*;
import java.util.*;

public class Armstrong{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int num, temp, digit, sum=0;

        System.out.println("\n Program to find whether number is armstrong or not");
        System.out.print("\n Enter number: ");
        num = scan.nextInt();
        
        String numStr = Integer.toString(num);
        int numlength = numStr.length();

        temp = num;
        while(temp > 0)
        {
            digit = temp%10;
            sum = sum + (int)Math.pow(digit, numlength);    //Math.pow(double, double) return double type value, converted to (int)
            temp = temp/10;
        }

        if(sum == num)
            System.out.println("\n\t" + num + " is a Armstrong nubmer");
        else
            System.out.println("\n\t" + num + " is not Armstrong number");

        //scan.close();
    }
}