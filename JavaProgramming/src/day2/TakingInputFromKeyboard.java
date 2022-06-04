package day2;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a value");
		int a=sc.nextInt();
		System.out.println("Enter  b value");
		int b=sc.nextInt();
		//int a=100;
		//int b=200;
		System.out.println("the value of a+b is "+a+b);
		System.out.println("the value of a+b is "+(a+b));
		//System.out.println(a+b);

	}

}
