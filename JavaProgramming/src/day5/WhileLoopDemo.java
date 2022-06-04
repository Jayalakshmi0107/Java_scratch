package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// example 1 print 1 to 10 numbers
		int i =1;
		while(i<=10)
		{
		
		System.out.println("Current Num "+i);
		i++;
	}
		//example 2
		int a=1;
		while(a<=5)
		{
			System.out.println("Hello");
			a++;
		}
		//example 3 // print only even numbers
		int x=2;
		while(x<=10)
		{
			System.out.println(x);
			x+=2;
		}
		
		int y=1;
		while(y<=10)
		{
			if(y%2==0)
			{
				System.out.println(y);
			}
			
			/*else
			{
				System.out.println("odd "+y);
			}*/
			y++;
		}
		//example 4 only odd numbers 1 to 10
		int o=1;
		while(o<=10)
		{
			if(o%2!=0)
			{
				System.out.println(o);
		}o++;
	}
		//example 5 print number in descending order
		
		int d =10;
		while (d>=1)
		{
			System.out.println(d);
			d--;
		}	
		}
		
}
