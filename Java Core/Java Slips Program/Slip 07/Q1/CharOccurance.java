
/*
Slip 07 Q1
Write a Java program to accept a string and character from user and
display count of occurrence of that character in string.
*/

import java.util.*;

public class CharOccurance
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String str;
        char ch;
        int count=0;

        System.out.print("\n\tEnter String: ");
        str = scan.nextLine();

        System.out.print("\n\tEnter Character: ");
        ch = scan.next().charAt(0);

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ch)
            {
                count++;
            }
        }
        System.out.println("\n\tTotal occurance of char " + ch + ": " + count);
    }
}