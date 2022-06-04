package day14;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is inProgess");
		
		//Arithmetic Exception
		/*System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(100/num);*/
		
		//Array Index Out OF bound exception
				
		/*int a[]=new int[5];
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		
		System.out.println("Enter a position :");
		int pos=sc.nextInt();*/
		
		Scanner sc=new Scanner (System.in);
				System.out.println("Enter a string");
		String str=sc.next();
		
		int num=Integer.parseInt(str);
		System.out.println(num);
		
		
		
		
		System.out.println("Program is Completed");
		System.out.println("Program is exicted");
	}

}
