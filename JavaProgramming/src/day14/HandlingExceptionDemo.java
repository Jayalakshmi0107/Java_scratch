package day14;

import java.util.Scanner;

public class HandlingExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is inProgess");
		
		//Arithmetic Exception
		System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		try
		{		
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		System.out.println("U have provided a invalid input.Please enter correct input");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program    is excited");
		}
	}


