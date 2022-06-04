package day6;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		//To declare 2 dim array
		int a[][]=new int[3][2];
		//int [][]a=new int[3][2];
		//int []]a[]=new int[3][2];
		// inserting values approach 1
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600; 
		
		
		//Approch 2
		
		
		/*int a[][]= {{100,200},
					{300,400},
					{500,600}};
//Find the size of an array
	System.out.println("Number of rows "+  a.length); //3
	 System.out.println("number of cols "+a[1].length);
		//read single value from array
	 System.out.println("The value of "+a[2][1]);
	 // read multiple value from array
	 for(int r=0;r< a.length;r++) //a.length =3
	 {
		 for(int c=0;c<a[r].length;c++) //a[r].length=2 0 1 2
		 {
		
			 System.out.print(a[r][c]+" ");//00=100; 01=200; 10=300;11=400 20=500 21=600
	 }
	 System.out.println();
	}*/

	 
	 for(int x[]:a)
	 {
		 for(int v:x)
		 {
			 System.out.print(v+" ");
		 }
		 System.out.println();
	 }
}
}
