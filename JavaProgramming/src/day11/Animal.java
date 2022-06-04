package day11;

public class Animal {
	String color="white";
	void eat()
	{
		System.out.println("Eating... ");
	}

}

class Dog extends Animal
{
	String colour="balck";
	void displaycolour()
	{
		//System.out.println(super.color);
		System.out.println(color);
	}
	
	void eat()
	{
		//System.out.println("Eating bread...");
		super.eat();
	}
}
