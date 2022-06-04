package day12.InterfaceConcepts;

public class PQR implements ABC,XYZ{

	

	@Override
	public void m2() {
		System.out.println("This is m2 from XYZ");
		
	}

	@Override
	public void m1() {
		System.out.println("THIS IS M1 FEOM ABC");
		
	}
	public static void main(String[] args) {
		PQR obj= new PQR();
		obj.m1();
		obj.m2();
		
	
	}
	
}
