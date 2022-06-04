package day4;
/*if a<b and a<c a is small
 * if b<a and b<c b is small
 * if c<a and c<b c is small */
public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		int a=100,b=200,c=30;
		if(a<b && a<c)
		{
			System.out.println("a is small "+a +" " +b +" " +c);
		}
		
		else if(b<c && b<a)
		{
			System.out.println("b is small "+a +" " +b +" " +c);
		}
		else
			System.out.println("c is small "+a+" " +b+" " +c);
	}

}
