package day5;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		// example 1 print 1 to 10 numbers
		int i=100;
        do
        {
        	System.out.println(i);
        	i++;
        }while(i<=10);
        // example 2 descending order 10 to 1 numbers
        int a=10;
        do
        {
        	System.out.println(a);
        	a--;
        }while(a>0);
	}

}
