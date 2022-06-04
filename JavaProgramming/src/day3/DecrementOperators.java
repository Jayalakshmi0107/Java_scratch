package day3;

/**
 * @author DELL
 *
 */
public class DecrementOperators {

	public static void main(String[] args) {
		// -- decrement operator
		int a=100;
		//scenario 1 -no difference because not storing a value into any other variable
		//a=a-1;
		//a--;
		//--a;
		System.out.println(a);
		// scenario 2
		//int res =a--;
		//System.out.println(res); // difference because first assigned  then decremented
		int res =--a; //first decrementation happened then assigned the value
		System.out.println(a);
	}

}
