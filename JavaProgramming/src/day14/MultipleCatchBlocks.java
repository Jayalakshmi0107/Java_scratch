package day14;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
		int num=sc.nextInt();
		try
		{
			System.out.println(100/num);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Numer Format Exception occured and handled");
		}
		catch(ArrayIndexOutOfBoundException ae)
		{
			System.out.println("ArrayIndexOutOfBoundException occured and handled");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Numer Format Exception occured and handled");
		}
		
	}

}
