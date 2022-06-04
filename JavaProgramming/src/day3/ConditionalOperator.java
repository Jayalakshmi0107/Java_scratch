package day3;

public class ConditionalOperator {

	public static void main(String[] args) {
		//variable = Excp1 ? Excp2 : Excp3;
		int a=20,b=10;
		int x = a>b ? a :b; //condition true a value returned ,false then returns b
		System.out.println(x);
		
		int age =15;
		String res=(age>18)?"Eligible for vote": "Not eligible for vote";
		System.out.println(res);
			
	}

}
