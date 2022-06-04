package day9;

public class CalculaterMain {

	public static void main(String[] args) {
		Calculator calobj= new Calculator();
		//calobj.add();//1
		//int res = calobj.add();
		//System.out.println(res); 2 // for further use we store the output in some variable
		
		//System.out.println(calobj.add());
		
		//calobj.add(100, 200);//3
		
		int res=calobj.add(25, 30);
		System.out.println(res);//4
	}

}
