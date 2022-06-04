package day4;

public class LargestOfatwoNumbers {

	public static void main(String[] args) {
		int a=100,b=20;
		if(a>b)
			 System.out.println("a is greater" +a);  
		else 
			System.out.println("b is greater" +b);
		
		int x=200,y=1000;
	//	String res=x>y? x+ " X is Greater" :  y+ " Y is greater";
		int res=x>y? x :  y;
		System.out.println("the value of res is :"+res);
		//System.out.println(x>y? x+ " X is Greater" : y+ " Y is greater");
	}

}
