package day6;
/* Declare an array
 * 
 */

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		//1)Declare an array
		//int a[]=new int[5];
		//2) insert values into array
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; */
		int a[]= {100,200,300,400,500,600};
		System.out.println(a.length);
		
		//read single elementfrom array
		
		System.out.println(a[2]);
		
		//read multiple values from array
		              
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
		System.out.println(a[2]);
		
	//enhanced for loop // for...  each loop	
		for(int x:a)
			
		{
			System.out.println(x);
		}
		
	}

}
