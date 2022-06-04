package day15;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration
		
		//HashMap hm=new HashMap();
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//add data into HashMap--- no add method
		hm.put(101, "Jaya");
		hm.put(102, "Madhav");
		hm.put(104, "Diya");
		hm.put(105, "Dharvik");
		hm.put(103, "Madhav");
		hm.put(101, "Banu");
		System.out.println(hm); //latest value will be taken 101 banu not jaya
		//i.e duplicate key not allowed duplicate value allowed
		//getting size
		System.out.println(hm.size());
//remove pair from hashmap
		
		hm.remove(104);
		System.out.println("After removing "+hm);
//get tthe value from the specific key
		System.out.println(hm.get(102));//madhav
		//Print onlu keys from hashmap
		
		System.out.println(hm.keySet());//101 102 103 105
		
		for(int k:hm.keySet()) {
			System.out.println(k +" "+hm.get(k));
			
		}
		
		hm.clear();
		System.out.println(hm);
		
	
	
	}

}
