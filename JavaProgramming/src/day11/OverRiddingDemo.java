package day11;
class Bank()
{
	double roi()
	{
		return 0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}
class SBI extends Bank
{
double roi()
{
	return 12.5;
}
}

public class OverRiddingDemo {

	public static void main(String[] args) 
	{
		ICICI ic= new ICICI();
		System.out.println(ic.roi());//10.5
		
		SBI sb= new SBI();
		System.out.println(sb.roi());
	}

}
