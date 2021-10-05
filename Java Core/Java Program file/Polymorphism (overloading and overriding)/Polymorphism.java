
//overloading and overridng types of polymorphism
import java.util.*;

class Animal
{
	void eat() //this is overriden
	{
		System.out.println("\nAll Animals are eating food");
	}
}

class Dog extends Animal
{
	void eat() //this is overriden
	{
		System.out.println("\nDog is eating food");
	}
}


public class Polymorphism
{
	static int add(int n1, int n2) //this is overloading
	{
			return n1+n2;
	}
	
	static int add(int n1, int n2, int n3) //this is overloading
	{
		return n1+n2+n3;
	}
	
	public static void main(String args[])
	{	
		int num1, num2, num3;
		Scanner cin = new Scanner(System.in);
	
		System.out.print("\nEnter Number 1: ");
		num1 = cin.nextInt();
		
		System.out.print("Enter Number 2: ");
		num2 = cin.nextInt();
		
		System.out.print("Enter Number 3: ");
		num3 = cin.nextInt();
		
		System.out.println("\nAddition of " + num1 + " & " + num2 + ": " + add(num1, num2));
		
		System.out.println("\nAddition of " + num1 + ", " + num2 + " & " + num3 + ": " + add(num1, num2, num3));
		
		//..................
		Animal a1 = new Animal();
		Dog d1 = new Dog();
		
		a1.eat();
		d1.eat();
	}
}