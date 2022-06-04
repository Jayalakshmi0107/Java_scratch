package day9;

public class Calculator 
{

	int x=10,y=20;
	// 1) NO params no return value
	/*void add()
	{
		System.out.println(x+y);
	}*/
	
	// 2) NO params, return value
		int add()
		{
			return (x+y);
			//return x+y;
		}
		// 3) Take params, No return value
				/*void add(int a,int b)
				{
					x=a;
					y=b;
					System.out.println(x+y);
				}*/
				// 4) Take params,  return value
				int add(int a,int b)
				{
					x=a;
					y=b;
					return(x+y);
				}
					
	
}
