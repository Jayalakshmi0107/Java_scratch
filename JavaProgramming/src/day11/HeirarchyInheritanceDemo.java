package day11;

class Parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class child1 extends Parent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class child2 extends Parent
{
	void print(int c)
	{
		System.out.println(c);
	}
}

public class HeirarchyInheritanceDemo {

	public static void main(String[] args) {
		//Parent p= new Parent();
		//p.display(10);
		
		//child1 c1= new child1();
		//c1.display(20);
		//c1.show(30);
		
		child2 c2= new child2();
		c2.display(2000);
		c2.print(300);
		
		
	}

}
