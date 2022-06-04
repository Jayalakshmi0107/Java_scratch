package day5;

public class JumpingStmtDemo {

	public static void main(String[] args)
	{
		
			for(int i=1;i<=5;i++)
			{
				if(i==3)
				{
					break; //Jumping out from for loop
				}
					System.out.println(i); // 1 2
			}
			for (int b=1;b<=5;b++)//1 2
			{
				if(b==3)
				{
					continue;// without executing syso it will go to next number
				}
				System.out.println(b);//1 2
			}
			
			// Continue example
			System.out.println("Skipping 3,5,7");
			
			for (int r=1;r<11;r++)//1 2
			{
				if(r==3 || r==5 ||r==7 )
				{
					continue;// without executing syso it will go to next number
				}
				System.out.println(r);//1 2
			}
	}
	
	
	
	

}
