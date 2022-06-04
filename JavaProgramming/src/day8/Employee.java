package day8;

public class Employee 
{
	//class contains variables not values
	int eid;
	String ename;
	String job;
	int esal;
	
	void display()// class contains methods  
	{
		System.out.println("Emp id " +eid);
		System.out.println("Emp Name " +ename);
		System.out.println("Emp job " +job);
		System.out.println("Emp sal " +esal);
	}
	
/*public static void main(String[] args)
	{
	Employee empobj1 =new Employee(); // object creation
	
	empobj1.eid=101;
	empobj1.ename="JAYA";
	empobj1.job="Engineer";
	empobj1.esal=200000;
	
	empobj1.display();
	
	Employee empobj2= new Employee();// another object creation
	empobj2.eid=102;
	empobj2.ename="Diya";
	empobj2.job="Doctor";
	empobj2.esal=500000;
	empobj2.display();
	}*/

}
