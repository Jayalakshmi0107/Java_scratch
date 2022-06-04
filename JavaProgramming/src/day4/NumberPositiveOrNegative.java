package day4;

public class NumberPositiveOrNegative {

	public static void main(String[] args) {

		int i=0;
		if(i>0)
		{
			System.out.println(i+ " Number is positive");
		}
		else if(i<0)
		{
			System.out.println(i+ " Number is negative");
		}
		else if(i==0)// else (i==0)-- throws error. if must if condition needs to check
		{
			System.out.println(i+ " Number is zero");
		}
		
	}

}
