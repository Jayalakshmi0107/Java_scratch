package day4;

public class IfElseEvenOrOdd {

	public static void main(String[] args) {
		int i=11;
		
			if(i%2==0)
			{
				System.out.println("Given number is even");
			}
			else
			{
				System.out.println("Given number is odd");
			}
			//using ternary operator
		int num=1234;
		
		//String res=num%2==0? " Number is Even" : " Number is Odd";
		System.out.println(num%2==0? num+ " Number is Even" :num+ " Number is Odd");
		
		
		
		
		
	}

}
