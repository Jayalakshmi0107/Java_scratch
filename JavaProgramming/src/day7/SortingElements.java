package day7;

import java.util.Arrays;

public class SortingElements {

	public static void main(String[] args)
	{
		//int a[]= {100,500,200,300,400};
		String a[]= {"cxy","bxy","bxy","abc"};
		System.out.println("Before sorting "+ Arrays.toString(a));
		Arrays.sort(a);//sort element
		System.out.println("After sorting "+ Arrays.toString(a));
	}

}
