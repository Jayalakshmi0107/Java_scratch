package day12.InterfaceConcepts;

interface Shape
{
	int length=10; //all variables are final and static
	int width= 20; // final and static
	void circle();//	abstract method
	default void square() //default should be used
	{
		System.out.println("This is square");
	}
	static void rectangle() //default or static should be used
	{
		System.out.println("This is rectangle... ");
	}
}


public class InterfaceDemo implements Shape {
	void circle()
	{
		System.out.println("This is circle..");
	}

	public static void main(String[] args)
	{
		
Shape s= new Shape();// in correct bcse we can not instatiate interface
Shape s=new InterfaceDemo();//correct

 
	}

}
