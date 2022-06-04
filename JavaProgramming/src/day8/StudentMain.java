package day8;

public class StudentMain {

	public static void main(String[] args)
	{
		//Student stu= new Student();
		/*Approach 1: using obj reference variable
		stu.sid=120;
		stu.sname="Madhav";
		stu.grade='A';
		stu.show();
		// Approach 2: using a method
		stu.setData(121,"Dharvik",'A');
		stu.show();*/
		
		//Approach 3 using constructor
		
		Student stu= new Student(101,"Banu",'A');
		stu.show();
		
		
	}

}
