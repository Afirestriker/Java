
//Static inner class

class OuterClass{
	
	private static int num1 = 2;	//num1 must be static, if we want to use it inside static inner class.
	
	void displayMsg()
	{
		System.out.println("Outser Class display");
	}
	
	static class InnerClass{
		
		int num2 = 4;
		
		void display(){
			System.out.println("Sum: " + (num1+num2));
		}
	}
	
}

public class StaticInnerClass{
	
	public static void main(String[] args){
		OuterClass oobj = new OuterClass();
		OuterClass.InnerClass oiobj = new OuterClass.InnerClass();
		
		oiobj.display();
		oobj.displayMsg();
		
	}
}