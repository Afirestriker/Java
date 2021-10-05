
/*
Write a package for College in Java, which have two classes BCA and
BBA. Use a function display () to generate the list of subjects for the
specific course. 
*/

package College;

public class BCA
{
    public void display()
    {
        String []Tri1 = {"CF", "PPA", "BM", "BBC"};
        String []Tri2 = {"Adv CF", "C Prog", "DBMS", "Statistics"};
        String []Tri3 = {"Adv C", "Adv DBMS", "Basic Accounting", "Organizational Behavior"};

        System.out.println("\n Trimester 1 subjects: ");
        for(int i=0; i<Tri1.length; i++)
            System.out.println("\t 10" + (i+1) + " " + Tri1[i]);

        System.out.println("\n Trimester 2 subjects: ");
        for(int i=0; i<Tri2.length; i++)
            System.out.println("\t 20" + (i+1) + " " + Tri2[i]);

        System.out.println("\n Trimester 3 subjects: ");
        for(int i=0; i<Tri3.length; i++)
            System.out.println("\t 30" + (i+1) + " " + Tri3[i]);
    }
}