
//inner / nested class

class OuterClass{

	private int num1 = 2;
	
	class InnerClass{
		
		private int num2 = 4;
		
		void display(){
		System.out.println("Sum: " + (num1+num2) );
		}
	}
}

public class MemberInnerClass{
	
	public static void main(String[] args)
	{
		OuterClass ocobj = new OuterClass();
		OuterClass.InnerClass icobj = ocobj.new InnerClass();
		
		icobj.display();
	}
}