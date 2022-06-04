package day12;
class Temp
{
	final void m1()
	{
		System.out.println("this is m1 method ...");
	}
}

class TempChild extends Temp
{
	void m1()//incorrect methods ncse m1 is final method,we cannot override
	{
		System.out.println("this is overrided method from temp class...");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
