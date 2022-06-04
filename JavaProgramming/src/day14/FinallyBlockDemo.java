package day14;

import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		//Array Index Out OF bound exception
		
				int a[]=new int[5];
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number");
				int num =sc.nextInt();
				System.out.println("Enter a position :");
				int pos=sc.nextInt();
				try
				{
					a[pos]=num;
					System.out.println(a[pos]);
				}
				catch(ArithmeticException)
					
				}
				

	}

}
