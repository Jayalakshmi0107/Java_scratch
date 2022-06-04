package day3;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		//int c;
		System.out.println("Before swapping a value "+a);
		System.out.println("Before swapping b value "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping a value "+a);
		System.out.println("After swapping b value "+b);
	}

}
