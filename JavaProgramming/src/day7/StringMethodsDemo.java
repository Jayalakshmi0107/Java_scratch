package day7;

public class StringMethodsDemo {

	public static void main(String[] args) {
		
		String s="welcome";
		System.out.println(s);
		//length
		System.out.println(s.length());//7
		
		//concat()- join the string
		System.out.println(1+3);//4
		System.out.println("abc"+"xyz"); //abcxyz
		System.out.println(1+"xyz"); //1xyz
		System.out.println("1"+"3"); //13
		
		String s1="welcome";
		String s2="Home";
		String s3="Dear";
		
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println("welcome ".concat(s2));
		System.out.println("welcome ".concat("--Home"));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim ()-trim right and left side spaces not middle space
		s="   Hel lo   ";
		System.out.println("Before trimming :"+s);
		System.out.println(s.length());
		System.out.println("after trimng :"+s.trim());
		s="welcome";
		System.out.println(s.charAt(6));
		//contain () -- returns a boolean value true/false
		System.out.println(s.contains("C"));
		System.out.println(s.contains("co"));
		System.out.println(s.contains("me"));
		System.out.println(s.contains("we"));
		System.out.println(s.contains("L"));
		
     //equals() equalsIgnoreCase() -compare 2 strings retuens true/false
		
		s1="WELCOME";
		s2="welcome";
		
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	
	//replace() -replace single/multiple/ sequence of characters
	s="welcome to selenium automation testing";
	 System.out.println(s.replace("e", "f"));
	 System.out.println(s.replace("testing", "Program"));
	 //substring() - extract the substring of the main string(starting index, ending index)
	 s="welcome";
	System.out.println(s.substring(2,5));//lco ---- w e l c o m e
	//												0 1 2 3 4 5 6
	//split() - divide the string into multiple parts based on delemeter/seperator
	s="jaya@gmail com";
	
	String a[]=s.split(" ");
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	//toUpperCase toLowercase
	
	s="WelCome";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());

	// one method with in another method
	s="WElCome";
	System.out.println(s.contains("WEL".toLowerCase()));
	
}
}