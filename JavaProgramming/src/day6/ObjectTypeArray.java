package day6;

public class ObjectTypeArray {

	public static void main(String[] args) {
		/*Object a=new Object[5];
		a[0]=100;
		a[1]="welcome";
		a[2]=10.5;
		a[3]='A';
		a[4]=true;*/
		
		Object a[]= {100,"welcome",10.5,'A',true};
		//normal for loop
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
for(Object x:a)
{
	System.out.println(x);
}
	}

}
