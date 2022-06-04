package day5;

public class ReverseANumber {

	public static void main(String[] args) {
		int num= 561;
		int reverse=0;
		//while(num!=-1)
			while(num!=0)
		{
			reverse=reverse*10+num%10;//4
			System.out.println(reverse);
			num=num/10;  //123
			//System.out.println(num);
		}
		System.out.println("Reverse Number "+reverse);
	}

}
