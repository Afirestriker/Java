
/*
Slip 24 Q2
Write a java program to display the sound made by the particular animal
with the help of abstraction.Write an abstract class Animal with an
abstract method sound(). Create 2 classes of specific animals (e.g.
Dog/Cat/Pig etc.) which extends the Animal class. Write implementation
of sound() method in the 2 classes. 
*/

abstract class Animal
{
	public abstract void sound();
}

class Dog extends Animal
{
	public void sound()
	{
		System.out.println(" Bark");
	}
}

class Lion extends Animal
{
	public void sound()
	{
		System.out.println(" Roar");
	}
}

public class AnimalSound
{
	public static void main(String[] args)
	{
		Dog d1 = new Dog();
		Lion l1 = new Lion();
		
		System.out.print("\n\tSound made by Dog: ");
		d1.sound();
		
		System.out.print("\n\tSound made by Cat: ");
		l1.sound();
	}
}
