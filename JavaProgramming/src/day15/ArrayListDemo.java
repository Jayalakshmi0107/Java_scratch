package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList <Integer> mylist=new ArrayList<Integer>();//only integer allowed
		//ArrayList <String> mylist=new ArrayList<String>();//only integer allowed
		
		
		//add data into arrayList
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(100);
		mylist.add(null);
		
		//size of a arrayList
		System.out.println(mylist.size());//8
		
		//Display values from arrayList
		System.out.println(mylist);
				
		//remove value from a arrayList
		System.out.println(mylist.remove(6));//100 
		System.out.println("After Removing "+mylist);
		
		//insert values in the middle of arrayList
		
				System.out.println(mylist.next;
				
				//read/retrive values from arrayList
				mylist.add(3,"java");
						System.out.println("After adding "+mylist);
								
		
	}

}
