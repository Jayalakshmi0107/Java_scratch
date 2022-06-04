package day3;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// increment operator ++
		
		int a=10; // increase the value by 1
		a=a+1;
		// scenario 1 -no difference
		System.out.println("the value of a is "+a);
		
		//a++;  //Post increment operators
		++a; // Pre increment operators
		System.out.println("The new value of a is " +a);
		
		// scenario 2
		//int res=a++;
		//System.out.println("the a value of a in scenario 2 :"+res); 
		// a++ first a value is assigned to res the ++ incrementation will happen
		
		int res=++a;
		System.out.println("the a value of a in scenario 2 ++a :"+res);
		// ++a first ++ incrementation will happen then a value is assigned to res  

		
	}

}
