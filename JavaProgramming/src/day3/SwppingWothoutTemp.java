package day3;

public class SwppingWothoutTemp {

	public static void main(String[] args) {
		/*int a=5,b=3;
		
		System.out.println("Before Swapping a value "+a);
		System.out.println("Before Swapping b value "+b);
		int c=a-b;
		a=a-c;
		b=b+c;
		System.out.println(" c value "+c);
		System.out.println("After Swapping a value "+a);
		System.out.println("After Swapping b value "+b);  */
		
		int a=200,b=100;
		System.out.println("Before swap a: "+a);
		System.out.println("Before swap b: "+b);
		a=a+b;
		System.out.println(a);
		System.out.println(b);// a=30 b=10
		b=a-b;//20;
		a=a-b;
		System.out.println("After swap a: "+a);
		System.out.println("After swap b: "+b);
		
		// using multiply and / without using temp variable a,b should n
		
		int x=20,y=10;
		System.out.println("Before swap x: "+x);
		System.out.println("Before swap y: "+y);
		x=x*y;//200
		y=x/y;//20
		x=x/y;//10
		System.out.println("After swap x: "+x);
		System.out.println("After swap y: "+y);
		
		//int d=25,e=15;
		int d=15,e=25;
		System.out.println("before swap d: "+d);
		System.out.println("before swap e: "+e);
		e=d+e-(d=e);//start execute from right d=e d=15; e=40-15 e=25
		System.out.println("After swap d: "+d);
		System.out.println("After swap e: "+e);
	}

}
