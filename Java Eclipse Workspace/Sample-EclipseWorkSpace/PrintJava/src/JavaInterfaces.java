
/* 
 * Java Interface
 */

interface Animal
{
	void walk();
	void sound();
}

class Dog implements Animal
{
	public void walk()
	{
		System.out.println("Dog can walk and run");
	}
	
	public void sound()
	{
		System.out.println("Dog make bark sound");
	}
}

public class JavaInterfaces {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		
		d1.walk();
		d1.sound();
		
	}//main() close
	
}//class JavaInface close
