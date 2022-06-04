
 package day4;
/* a>b and a>c ----- a is largest
 * b>a and b>c ----- b is largest
 * c>a and c>b ----- c is largest */
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a =100,b=2000,c=300;
		System.out.println("a  value is" +a); 
		System.out.println("b value is " +b);
		System.out.println("c value is " +c);
		if((a>b)&&(a>c))
		{
			System.out.println("a is largest");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is largest");
		}
		
		else
		{
			System.out.println("c is largest");
		}
	}

}
