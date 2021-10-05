
//Branching statement break and continue in java.

public class BranchingStatement
{
	public static void main(String args[])
	{
		//Execution of break statement
		System.out.println("\nThis is how break statement works");
		for(int i=0; i<10; i++)
		{
			if(i==5)
				break;
				
			System.out.print("\t" + i);
		}
		
		System.out.println("\n\nThis is how continue statement works");
		for(int i=0; i<10; i++)
		{
			if(i==5)
				continue;
				
			System.out.print("\t" + i);
		}
		
		System.out.println();
		
	}
}