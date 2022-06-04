package day7;

public class DeclareStrings {

	public static void main(String[] args) {
		//String s= "welcome";
		//String s=new String("welcome");
		
		/*
		 * scenario 1
		 * String s1= "welcome";
		String s2= "welcome";
		
		System.out.println(s1==s2);// true
		System.out.println(s1.equals(s2));//false*/

		/*//scenario 2
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1==s2);//false compare objects
		System.out.println(s1.equals(s2));//true compare values
*/
		//scenario 3
	String s1="abc";
	String s2=new String("abc");
	String s3=s1;
	System.out.println(s1==s3);
System.out.println(s1.equals(s3));	
	}

}
