package day9;

public class ConstructorDemo {
	
	int x,y;
	String s;
	/*ConstructorDemo()//constructor 1
	{
		System.out.println("This is default constructor..");
	}*/
	
	ConstructorDemo(int a,int b, String str) //constructor 2. constructor is for initialising the data
	{
		x=a;
		y=b;
		s=str;
		System.out.println(x+ " "+y+" "+s);
	}
	
	public static void main(String[] args) {
		
		//ConstructorDemo cd= new ConstructorDemo();//calling constructor 1
		
		ConstructorDemo cd= new ConstructorDemo(100,200,"jaya");// in the same order
	}

}
