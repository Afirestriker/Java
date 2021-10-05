
//Inheritance using interface

import java.lang.*;

interface Animal{
	void eat(); 
}

interface Cat extends Animal{	//interface "extends" another interface not "implements"
	void drink();
}

class Kitty implements Cat{
	public void eat(){
		System.out.println("\n Kitty is eating");
	}

	public void drink(){
		System.out.println("\n Kitty is drinking");
	}
}

public class InterfaceInheritance{
	public static void main(String [] args){
		Kitty k1 = new Kitty();
		
		k1.eat();
		k1.drink();
	}
}