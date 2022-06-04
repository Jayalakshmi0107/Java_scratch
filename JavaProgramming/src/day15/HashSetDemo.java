package day15;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		//declaration
		//HashSet myset=new HashSet();
		//Set myset=new Set();// wrong
		Set myset=new HashSet();
		//Hashset <Integer>myset=new HashSet<Integer>();
		
		//add elements in set
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add(null);
		myset.add(100);// duplicate not allowed
		myset.add(null); // duplicate null not allowed
		System.out.println(myset);// [null, 100, 10.5, welcome, true]
		
		//remove value from set
		myset.remove(10.5);//here 10.5 is value not index
		System.out.println("After REmoving "+ myset);
		
		//insert and retrive is not possible
		
		//reading data from hashset
		for(Object x:myset)
		{
			System.out.println(x);
		}
	
		}

}
