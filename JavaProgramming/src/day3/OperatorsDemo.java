package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//int a =10;
		//int b=20;
		int a =10,b=20;
		// Arithmetic operators + - * / %
		System.out.println("Sum of a and b:"+a+b);
		System.out.println("Sum of a and b:"+(a+b));
		System.out.println("Subtraction of a and b:"+(b-a));
		System.out.println("Multiplication of a and b:"+(a*b));
		System.out.println("Division of a and b:"+(b/a));
		System.out.println("Modulo division of a and b:"+(b%a));
		
		// Relational Operators always returns true or false i.e boolean values
		// Relational Operators > >= < <=!= ==
		
		a=100;
		b=200;
		System.out.println(a>b); //false
		System.out.println(a<b);//true
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		//logical operators && || ! returns boolean value(true/false)
		// logical operators used between two boolean values
		
		boolean x=true,y=false;
		System.out.println(x && y);// false
		System.out.println(x || y); // true
		System.out.println(!x);// false
		System.out.println(!y);// true
		
		
		boolean b1=10>20; // false...  the statement is correct
		boolean b2= 20>10; // true
		System.out.println(b1); //false
		System.out.println(b2); //true
		
	}

}
