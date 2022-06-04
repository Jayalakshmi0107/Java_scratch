package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		//  print 1 to 10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		//example 2 Even numbers 1 to 10
		for (int a=2;a<=10;a+=2)
		{
			System.out.println(a);
		} 
		for (int b=1;b<=10;b++)
		{
			if(b%2==0)
			{
				System.out.println(b);
			}
		}
		
		for (int c=1;c<=10;c++)
		{
			if(c%2!=0)
			{
				System.out.println(c);
			}
		}
		for (int e=10;e>=1;e--)
		{
				System.out.println(e);
			}
		
	}

}
