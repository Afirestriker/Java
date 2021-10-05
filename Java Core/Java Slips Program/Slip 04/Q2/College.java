
/*
Slip 04 Q2
Write a package for College in Java, which have two classes BCA and
BBA. Use a function display () to generate the list of subjects for the
specific course. 
*/

import College.BBA;
import College.BCA;

public class College
{
    public static void main(String[] args)
    {
        BBA bbasub = new BBA();
        BCA bcasub = new BCA();

        System.out.println("\n List of subjects for BBA");
        bbasub.display();

        System.out.println("\n*************************\n");

        System.out.println(" List of subjects for BCA");
        bcasub.display();
    }
}