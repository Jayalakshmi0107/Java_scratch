package day7;

public class SearchingElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {50,30,20,10,40};
		int num=40;
		boolean status=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("value matched " +a[i]);
				status=true;
				break;
			}
		}
		
		if(status==false)
			System.out.println("Element not found ");
		
		
		
	}

}

