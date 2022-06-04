package day8;

public class Student {
	int sid;
	String sname;
	char grade;
	void show()
	{
		System.out.println(sid + " "+ sname + " "+grade);
	}
	void setData(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
		
	}
Student(int id,String name,char g)// constructor name should be class name
{// constructor never retuns a value no need to mention void
	sid=id;
	sname=name;
	grade=g;	
}
}
