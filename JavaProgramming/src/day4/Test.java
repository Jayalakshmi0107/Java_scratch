package day4;

public class Test {

	public static void main(String[] args) {
		if(true)
		{
			System.out.println("a");
			if(false)
			{
			System.out.println("b");
			System.out.println("c");
			}
			
			else
			{
				System.out.println("inside else");
			}
		}
		
		else //if no {} then treat one stmt as else part
		{
			System.out.println("x");
	        System.out.println("y");
			System.out.println("z");
		}
			//else //if no {} then treat one stmt as else part
				
				//System.out.println("x");
		       // System.out.println("y");
				//System.out.println("z");
			
		
	}

}
