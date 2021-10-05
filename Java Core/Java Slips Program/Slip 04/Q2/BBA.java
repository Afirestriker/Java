
/*
Write a package for College in Java, which have two classes BCA and
BBA. Use a function display () to generate the list of subjects for the
specific course. 
*/

package College;

public class BBA
{
    public void display()
    {
        String []Tri1 = {"Principle of Management", "Business Economics", "Organizational Behavior", "Basic of Accounting"};
        String []Tri2 = {"Business laws", "Introduction to Sociology", "Business Mathematics", "Marketing Management"};
        String []Tri3 = {"Statistics", "Introduction to Psychology", "Micro Economics", "Finanacial and Management Accounting"};

        System.out.println("\n Trimester 1 subjects: ");
        for(int i=0; i<Tri1.length; i++)
        {
            System.out.println("\t10" + (i+1) + " " + Tri1[i]);
        }

        System.out.println("\n Trimester 2 subjects: ");
        for(int i=0; i<Tri2.length; i++)
        {
            System.out.println("\t20" + (i+1) + " " + Tri2[i]);
        }

        System.out.println("\n Trimester 3 subjects: ");
        for(int i=0; i<Tri3.length; i++)
        {
            System.out.println("\t30" + (i+1) + " " + Tri3[i]);
        }
    }
}