
/*
Slip 24 Q1
Consider a scenario where Bank is a class that provides a method to get
the rate of interest. The rate of interest may differ according to banks.
For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and
6.8% rate of interest.
Write a java program to display the rate of interests of all 3 banks. Use
polymorphism concept and override the method displaying the interest
rates
*/

class Bank
{
	void rateOfInterest()
	{
		System.out.println("\n\t Function to display Rate Of Interest provided by different banks");
	}
}

class SBI extends Bank
{
	void rateOfInterest()
	{
		System.out.println("\n\t SBI Rate Of Interest: " + 8.4 + "%");
	}
}

class ICICI extends Bank
{
	void rateOfInterest()
	{
		System.out.println("\n\t ICICI Rate Of Interest: " + 7.3 + "%");
	}
}
class AXIS extends Bank
{
	void rateOfInterest()
	{
		System.out.println("\n\t AXIS Rate Of Interest: " + 6.8 + "%");
	}
}

public class BankInterest
{
	public static void main(String[] args)
	{
		SBI obj1 = new SBI();
		ICICI obj2 = new ICICI();
		AXIS obj3 = new AXIS();
		
		obj1.rateOfInterest();
		obj2.rateOfInterest();
		obj3.rateOfInterest();
	}
}
